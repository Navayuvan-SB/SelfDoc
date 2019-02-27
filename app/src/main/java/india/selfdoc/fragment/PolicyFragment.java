package india.selfdoc.fragment;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import india.selfdoc.MainActivity;
import india.selfdoc.R;
import india.selfdoc.adapter.accordion.AccordionView;

public class PolicyFragment extends Fragment implements   TextToSpeech.OnInitListener {

    private TextToSpeech tts;

    private Button btnHos1;
    private Button btnHos2;
    private Button btnHos3;
    private Button btnHos4;
    private Button btnHos5;
    private Button btnHos6;
    private Button btnHos7;
    private Button btnHos8;
    private Button btnHos9;
    private Button btnHos10;

    private AccordionView accordionView1;
    private TextView textView1;
    private Button btnSpk1;

    private AccordionView accordionView2;
    private TextView textView2;
    private Button btnSpk2;

    private AccordionView accordionView3;
    private TextView textView3;
    private Button btnSpk3;

    private AccordionView accordionView4;
    private TextView textView4;
    private Button btnSpk4;

    private AccordionView accordionView5;
    private TextView textView5;
    private Button btnSpk5;

    private AccordionView accordionView6;
    private TextView textView6;
    private Button btnSpk6;

    private AccordionView accordionView7;
    private TextView textView7;
    private Button btnSpk7;

    private AccordionView accordionView8;
    private TextView textView8;
    private Button btnSpk8;

    private AccordionView accordionView9;
    private TextView textView9;
    private Button btnSpk9;

    private AccordionView accordionView10;
    private TextView textView10;
    private Button btnSpk10;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.policy_frag, container, false);
        tts  = new TextToSpeech(getActivity(), this);

        btnHos1 = (Button) view.findViewById(R.id.btn_hos_1);
        btnHos2 = (Button) view.findViewById(R.id.btn_hos_2);
        btnHos3 = (Button) view.findViewById(R.id.btn_hos_3);
        btnHos4 = (Button) view.findViewById(R.id.btn_hos_4);
        btnHos5 = (Button) view.findViewById(R.id.btn_hos_5);
        btnHos6 = (Button) view.findViewById(R.id.btn_hos_6);
        btnHos7 = (Button) view.findViewById(R.id.btn_hos_7);
        btnHos8 = (Button) view.findViewById(R.id.btn_hos_8);
        btnHos9 = (Button) view.findViewById(R.id.btn_hos_9);
        btnHos10 = (Button) view.findViewById(R.id.btn_hos_10);




        btnSpk1 = (Button) view.findViewById(R.id.btn_spk_1);
        btnSpk2 = (Button) view.findViewById(R.id.btn_spk_2);
        btnSpk3 = (Button) view.findViewById(R.id.btn_spk_3);
        btnSpk4 = (Button) view.findViewById(R.id.btn_spk_4);
        btnSpk5 = (Button) view.findViewById(R.id.btn_spk_5);
        btnSpk6 = (Button) view.findViewById(R.id.btn_spk_6);
        btnSpk7 = (Button) view.findViewById(R.id.btn_spk_7);
        btnSpk8 = (Button) view.findViewById(R.id.btn_spk_8);
        btnSpk9 = (Button) view.findViewById(R.id.btn_spk_9);
        btnSpk10 = (Button) view.findViewById(R.id.btn_spk_10);

      //  tts.setPitch(1);

        accordionView1 = (AccordionView) view.findViewById(R.id.txtHeading1);
        textView1 = (TextView) accordionView1.findViewById(R.id.txtDesc1);
        textView1.setText(" To Create a healthy, capable and content new India.");

        accordionView2 = (AccordionView) view.findViewById(R.id.txtHeading2);
        textView2 = (TextView) accordionView2.findViewById(R.id.txtDesc2);
        textView2.setText(" To reduce the level of under-nutrition anaemia and low birth weight babies.");

        accordionView3 = (AccordionView) view.findViewById(R.id.txtHeading3);
        textView3 = (TextView) accordionView3.findViewById(R.id.txtDesc3);
        textView3.setText(" Pradhan Mantri Jeevan Jyothi Bima Yojana\n" +
                "  Pradhan Mantri Mantri Suraksha Bima Yojana\n" +
                "  Atal Pension Yojana\n" +
                "    To provide insurance & pension.");

        accordionView4 = (AccordionView) view.findViewById(R.id.txtHeading4);
        textView4 = (TextView) accordionView4.findViewById(R.id.txtDesc4);
        textView4.setText(" To create bank accounts and insurance covers upto Rs.30,000 and rupay debit card.");

        accordionView5 = (AccordionView) view.findViewById(R.id.txtHeading5);
        textView5 = (TextView) accordionView5.findViewById(R.id.txtDesc5);
        textView5.setText(" To provide accessible, affordable and accountable quality healthy services to the poorest house holds in the remotest rural regions.");

        accordionView6 = (AccordionView) view.findViewById(R.id.txtHeading6);
        textView6 = (TextView) accordionView6.findViewById(R.id.txtDesc6);
        textView6.setText(" To provide cash incentives to pregnant mothers, who opt for institional deliveries.");

        accordionView7 = (AccordionView) view.findViewById(R.id.txtHeading7);
        textView7 = (TextView) accordionView7.findViewById(R.id.txtDesc7);
        textView7.setText(" To provide health insurance scheme for Below Poverty Line(BPL) families in unorganised sector.");

        accordionView8 = (AccordionView) view.findViewById(R.id.txtHeading8);
        textView8 = (TextView) accordionView8.findViewById(R.id.txtDesc8);
        textView8.setText(" To provide pension of Rs. 200 above 60 age.\n" +
                "    To provide pension of Rs. 500 above 80 age.");

        accordionView9 = (AccordionView) view.findViewById(R.id.txtHeading9);
        textView9 = (TextView) accordionView9.findViewById(R.id.txtDesc9);
        textView9.setText(" To provide quality health care @ AIMMS Hospital.");

        accordionView10 = (AccordionView) view.findViewById(R.id.txtHeading10);
        textView10 = (TextView) accordionView10.findViewById(R.id.txtDesc10);
        textView10.setText(" To provide free entitlements to pregnant women & sick new born for cash less.");


        btnHos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnHos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(4);
                Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
            }
        });

        btnSpk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView1);
            }

        });

        btnSpk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView2);
            }

        });

        btnSpk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView3);
            }

        });

        btnSpk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView4);
            }

        });

        btnSpk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView5);
            }

        });

        btnSpk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView6);
            }

        });

        btnSpk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView7);
            }

        });

        btnSpk8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView8);
            }

        });

        btnSpk9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView9);
            }

        });

        btnSpk10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                speakOut(textView10);
            }

        });

        return view;
    }


    @Override
    public void onDestroy() {
        // Don't forget to shutdown tts!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }



    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);
            // int result = tts.setLanguage(new Locale("ta_IN"));

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } /**else {
             btnSpk1.setEnabled(true);
             speakOut();
             }*/

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }

    private void speakOut(TextView textView) {

        String text = textView.getText().toString();
        textView.setText(text);
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

    private void loadFragment(int page){
        ((MainActivity)getActivity()).loadFragment(page);
    }


}
