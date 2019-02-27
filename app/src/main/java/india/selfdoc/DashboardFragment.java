package india.selfdoc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import india.selfdoc.LoginActivity;
import india.selfdoc.MainActivity;
import india.selfdoc.R;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dash_frag, container, false);
        ((ConstraintLayout) view).findViewById(R.id.policy_btn).setOnClickListener(this);
        ((ConstraintLayout) view).findViewById(R.id.disease_btn).setOnClickListener(this);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.policy_btn:
                loadFragment(6);
                break;
            case R.id.disease_btn:
                loadFragment(7);
                break;

        }
    }

    private void loadFragment(int page){
        ((MainActivity)getActivity()).loadFragment(page);
    }
}
