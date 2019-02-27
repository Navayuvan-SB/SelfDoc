package india.selfdoc.fragment;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
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

public class DiseaseFragment extends Fragment implements   TextToSpeech.OnInitListener {
    RecyclerView recyclerView;
   private TextToSpeech tts;
   private Button btnDis1;
   private Button btnDis2;
   private Button btnDis3;

   private Button btnSpk1;
   private Button btnSpk2;
   private Button btnSpk3;
   private AccordionView accordionView1;
   private TextView textView1;
   private AccordionView accordionView2;
   private TextView textView2;
   private AccordionView accordionView3;
   private TextView textView3;

   @Nullable
   @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.disease_frag, container, false);
      tts  = new TextToSpeech(getActivity(), this);
      btnDis1 = (Button) view.findViewById(R.id.btn_d_hos_1);
      btnDis2 = (Button) view.findViewById(R.id.btn_d_hos_2);
      btnDis3 = (Button) view.findViewById(R.id.btn_d_hos_3);

      btnSpk1 = (Button) view.findViewById(R.id.btn_d_spk_1);
      btnSpk2 = (Button) view.findViewById(R.id.btn_d_spk_2);
      btnSpk3 = (Button) view.findViewById(R.id.btn_d_spk_3);
      //tts.setPitch(1);

       accordionView1 = (AccordionView) view.findViewById(R.id.txtHeading1);
       textView1 = (TextView) accordionView1.findViewById(R.id.txtDesc1);
       textView1.setText("Diabetes is a disease that affects your body’s ability to produce or use insulin. Insulin is a hormone. When your body turns the food you eat into energy (also called sugar or glucose), insulin is released to help transport this energy to the cells. Insulin acts as a “key.” Its chemical message tells the cell to open and receive glucose. If you produce little or no insulin, or are insulin resistant, too much sugar remains in your blood. Blood glucose levels are higher than normal for individuals with diabetes. There are two main types of diabetes: Type 1 and Type 2.");

       accordionView2 = (AccordionView) view.findViewById(R.id.txtHeading2);
       textView2 = (TextView) accordionView2.findViewById(R.id.txtDesc2);
       textView2.setText("A heart attack (myocardial infarction or MI) is a serious medical emergency in which the supply of blood to the heart is suddenly blocked, usually by a blood clot.\n" +
               "\n" +
               "A heart attack is a medical emergency. Dial 999 and ask for an ambulance if you suspect a heart attack.\n" +
               "\n" +
               "A lack of blood to the heart may seriously damage the heart muscle and can be life-threatening.");

       accordionView3 = (AccordionView) view.findViewById(R.id.txtHeading3);
       textView3 = (TextView) accordionView3.findViewById(R.id.txtDesc3);
       textView3.setText("Cancer is a broad term. It describes the disease that results when cellular changes cause the uncontrolled growth and division of cells.\n" +
               "\n" +
               "Some types of cancer cause rapid cell growth, while others cause cells to grow and divide at a slower rate.\n" +
               "\n" +
               "Certain forms of cancer result in visible growths called tumors, while others, such as leukemia, do not.\n" +
               "\n" +
               "Most of the body's cells have specific functions and fixed lifespans. While it may sound like a bad thing, cell death is part of a natural and beneficial phenomenon called apoptosis.");

       btnDis1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               loadFragment(4);
               Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
           }

       });

       btnDis2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               loadFragment(4);
               Toast.makeText(view.getContext(), "Loading Google Map", Toast.LENGTH_LONG).show();
           }

       });

       btnDis3.setOnClickListener(new View.OnClickListener() {
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
