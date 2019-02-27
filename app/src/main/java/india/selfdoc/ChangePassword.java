package india.selfdoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ChangePassword extends AppCompatActivity {

    private Button update;
    private EditText newPassword;
    private FirebaseUser firebaseUser;
    private FirebaseAuth firebaseAuth;
    ImageView acc, hom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);




            update = findViewById(R.id.btnUpdatepassword);
            newPassword = findViewById(R.id.password);
            hom = findViewById(R.id.home);


            firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

            update.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String userPasswordNew = newPassword.getText().toString();
                    firebaseUser.updatePassword(userPasswordNew).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(ChangePassword.this, "Password Changed", Toast.LENGTH_SHORT).show();
                                finish();
                            } else {
                                Toast.makeText(ChangePassword.this, "Password Update Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            });


        }
        public void accSettings (View v)
        {
            startActivity(new Intent(ChangePassword.this, MainActivity.class));

        }
        public void home (View v)
        {
            startActivity(new Intent(this, MainActivity.class));


        }
    }