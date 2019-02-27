package india.selfdoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class SettingFragment extends Fragment implements View.OnClickListener {

    private TextView changeEmail;

    private TextView changePassword;

    private TextView changePhnNo;

    private TextView deleteAccount;

    private LinearLayout layoutOfPopup;

    private PopupWindow popupMessage;

    private Button popUpWindowBtn;

    private EditText popUpWindowEditText;

    View popupview;

    private View view;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_setting, container, false);

        changeEmail = (TextView)view.findViewById(R.id.changeEmailTextView);
        changePassword = (TextView)view.findViewById(R.id.changePasswordTextView);
        changePhnNo = (TextView)view.findViewById(R.id.changeMobileNotextView);
        deleteAccount = (TextView)view.findViewById(R.id.deleteAccountTextView);


        changeEmail.setOnClickListener(this);
        changePassword.setOnClickListener(this);
        changePhnNo.setOnClickListener(this);
        deleteAccount.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.changePasswordTextView){

            startActivity(new Intent(this.getActivity(), ChangePassword.class));

        }

        if (v.getId() == R.id.changeEmailTextView){

                    startActivity(new Intent(this.getActivity(), ChangeEmail.class));

                }

        if (v.getId() == R.id.changeMobileNotextView){

                    startActivity(new Intent(this.getActivity(), ChangePhoneNumber.class));

                }

        if (v.getId() == R.id.deleteAccountTextView){

                    startActivity(new Intent(this.getActivity(), DeleteAccount.class));

                }

    }
}
