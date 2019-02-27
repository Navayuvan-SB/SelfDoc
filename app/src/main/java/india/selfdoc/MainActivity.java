package india.selfdoc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import india.selfdoc.fragment.DashboardFragment;
import india.selfdoc.fragment.InsuranceMapFragment;
import india.selfdoc.fragment.PolicyFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private RecyclerView recyclerView;

   /* private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

    private DatabaseReference mRoot = firebaseDatabase.getReference();

    private DatabaseReference mUsers = mRoot.child("Users");

    private DatabaseReference mThisUser;

    private DatabaseReference mThisUserEmail;

    private DatabaseReference mThisUserPhnNo;

    private FirebaseAuth mAuth = FirebaseAuth.getInstance(); */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FirebaseUser user = mAuth.getCurrentUser();

        mThisUser= mUsers.child(user.getUid());

        mThisUserEmail = mThisUser.child("Email ID");

        mThisUserPhnNo = mThisUser.child("Phone Number");

        mThisUserEmail.setValue(getIntent().getStringExtra("EMAIL_ID"));

        mThisUserPhnNo.setValue(getIntent().getStringExtra("PHN_NO")); */


        loadFragment(1);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Fragment frag = getSupportFragmentManager().findFragmentById(R.id.main_frag);

            if(frag instanceof DashboardFragment){
             //   super.onBackPressed();
            } else{
                getSupportFragmentManager().beginTransaction().replace(R.id.main_frag, new DashboardFragment()).commit();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_logout) {

            FirebaseAuth.getInstance().signOut();
            Intent loginIntent = new Intent(this, Login.class);
            loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(loginIntent);
            Toast.makeText(getApplicationContext(), "Successfully Logout.", Toast.LENGTH_LONG).show();
           return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if(id == R.id.nav_symptom_check){

            loadFragment(4);
        }

        if(id == R.id.nav_insurance){

            loadFragment(5);
        }

        if(id == R.id.nav_policy){

            loadFragment(6);
        }

        if(id == R.id.nav_hospital){

            loadFragment(7);
        }

        if(id == R.id.nav_account_settings){

            loadFragment(9);
        }
        if(id == R.id.nav_disease){

            loadFragment(8);
        }

        if(id == R.id.nav_send){

            loadFragment(10);
        }

        if(id == R.id.share){

            loadFragment(11);
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void loadFragment(int page){
        Fragment fragment = null;
        switch (page){
            case 1:
                fragment = new DiseaseFragment();
                break;

            case 4:
                fragment = new Disease_prediction();
                break;
            case 5:
                fragment = new InsuranceMapFragment();
//                startActivity(new Intent(this, InsuranceMapFragment.class));
                break;
            case 6:
                fragment = new PolicyFragment();
                break;
            case 7:
                fragment = new HospitalMapFragment();
                break;

            case 8:

                fragment = new DiseaseFragment();
                break;

            case 9:

                fragment = new SettingFragment();
                break;

            case 10:
                browser1();
                break;

            case 11:
                share();
                break;
        }

        if(fragment != null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.main_frag, fragment).commit();

        }
    }
    public void browser1(){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://selfdoc.godaddysites.com/contact-us"));
        startActivity(browserIntent);
    }
    public void share() {
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "hello";
        String shareSub = "hai";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));
    }


}
