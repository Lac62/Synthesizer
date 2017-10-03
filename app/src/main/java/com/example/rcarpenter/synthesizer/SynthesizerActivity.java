package com.example.rcarpenter.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;

import java.util.ArrayList;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private Button fButton;
    private Button eButton;
    private Button Challenge1;
    private Button Challenge2;
    private Button TwinkleTwinkle;
    private NumberPicker numberPicker;
    private NumberPicker numberPicker2;
    private NumberPicker TwinkleP;
    private CheckBox NoMiddle;
    private Button LeanOnMe;
    private static final String TAG = SynthesizerActivity.class.getName();
    MediaPlayer mpE;
    MediaPlayer mpF;
    MediaPlayer mpG;
    MediaPlayer mpA;
    MediaPlayer mpB;
    MediaPlayer mpCS;
    MediaPlayer mpD;
    MediaPlayer mpHE;
    MediaPlayer mpFS;
    MediaPlayer mpBB;
    MediaPlayer mpC;
    MediaPlayer mpDS;
    MediaPlayer mpGS;
    MediaPlayer mpHF;
    MediaPlayer mpHFS;
    MediaPlayer mpHG;
    ArrayList<MediaPlayer>Notes;
    ArrayList<MediaPlayer>Scale;
    ArrayList<MediaPlayer>Twinkle;
    ArrayList<MediaPlayer>Twinkle2;
    ArrayList<MediaPlayer> LeanOn;
    String names[] = {"A", "B", "B Flat", "C", "C Sharp", "D", "D Sharp", "E", "F", "F Sharp", "G", "G Sharp", "High E", "High F", "High F Sharp", "High G"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        fButton = (Button) findViewById(R.id.Fbutton);
        eButton = (Button) findViewById(R.id.Ebutton);
        Challenge1 = (Button) findViewById(R.id.Challenge1);
        Challenge2 = (Button) findViewById(R.id.Challenge2);
        TwinkleTwinkle = (Button) findViewById(R.id.TwinkleTwinkle);
        numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker2 = (NumberPicker) findViewById(R.id.numberPicker2);
        TwinkleP = (NumberPicker) findViewById(R.id.TwinkleP);
        NoMiddle = (CheckBox) findViewById(R.id.PlayMiddle);
        LeanOnMe = (Button) findViewById(R.id.LeanOnMe);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpHE = MediaPlayer.create(this, R.raw.scalehighe);
        mpFS = MediaPlayer.create(this, R.raw.scalefs);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mpHF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHG = MediaPlayer.create(this, R.raw.scalehighg);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(20);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(15);
        numberPicker2.setDisplayedValues(names);
        TwinkleP.setMinValue(0);
        TwinkleP.setMaxValue(4);

        Notes = new ArrayList<>();
        Notes.add(mpA);
        Notes.add(mpB);
        Notes.add(mpBB);
        Notes.add(mpC);
        Notes.add(mpCS);
        Notes.add(mpD);
        Notes.add(mpDS);
        Notes.add(mpE);
        Notes.add(mpF);
        Notes.add(mpFS);
        Notes.add(mpG);
        Notes.add(mpGS);
        Notes.add(mpHE);
        Notes.add(mpHF);
        Notes.add(mpHFS);
        Notes.add(mpHG);

        Scale = new ArrayList<>();
        Scale.add(mpE);
        Scale.add(mpFS);
        Scale.add(mpG);
        Scale.add(mpA);
        Scale.add(mpB);
        Scale.add(mpCS);
        Scale.add(mpD);
        Scale.add(mpHE);

        Twinkle = new ArrayList<>();
        Twinkle.add(mpA);
        Twinkle.add(mpA);
        Twinkle.add(mpHE);
        Twinkle.add(mpHE);
        Twinkle.add(mpHFS);
        Twinkle.add(mpHFS);
        Twinkle.add(mpHE);
        Twinkle.add(mpD);
        Twinkle.add(mpD);
        Twinkle.add(mpCS);
        Twinkle.add(mpCS);
        Twinkle.add(mpB);
        Twinkle.add(mpB);
        Twinkle.add(mpA);

        Twinkle2 = new ArrayList<>();
        Twinkle2.add(mpHE);
        Twinkle2.add(mpHE);
        Twinkle2.add(mpD);
        Twinkle2.add(mpD);
        Twinkle2.add(mpCS);
        Twinkle2.add(mpCS);
        Twinkle2.add(mpB);

        LeanOn = new ArrayList<>();
        LeanOn.add(mpC);
        LeanOn.add(mpC);
        LeanOn.add(mpD);
        LeanOn.add(mpE);
        LeanOn.add(mpF);
        LeanOn.add(mpF);
        LeanOn.add(mpE);
        LeanOn.add(mpD);
        LeanOn.add(mpC);
        LeanOn.add(mpC);
        LeanOn.add(mpD);
        LeanOn.add(mpE);
        LeanOn.add(mpE);
        LeanOn.add(mpD);
        LeanOn.add(mpC);
        LeanOn.add(mpC);
        LeanOn.add(mpD);
        LeanOn.add(mpE);
        LeanOn.add(mpF);
        LeanOn.add(mpF);
        LeanOn.add(mpE);
        LeanOn.add(mpD);
        LeanOn.add(mpC);
        LeanOn.add(mpC);
        LeanOn.add(mpD);
        LeanOn.add(mpE);
        LeanOn.add(mpB);
        LeanOn.add(mpC);

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "This worked! Button 1 pressed!");
                mpF.start();
                delayplaying(WHOLE_NOTE);
                mpF.stop();
            }
        });
        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpE.start();
                delayplaying(WHOLE_NOTE);
                mpE.stop();
            }
        });
        Challenge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int i = 0;
                for (i = 0; i < Scale.size(); i++ ){
                    playnote(Scale.get(i), WHOLE_NOTE);
                }


            }
        });
        Challenge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int i = 0;
                while (i <= numberPicker.getValue() - 1  ){
                 playnote(Notes.get(numberPicker2.getValue()), WHOLE_NOTE);
                    i++;
                }
            }
        });
        TwinkleTwinkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int i = 0;
                int n = 0;
                if (NoMiddle.isChecked()){
                    TwinkleP.setValue(0);
                }
                for (i = 0; i < Twinkle.size(); i++){
                    if (i == 6 || i == 13){
                        playnote(Twinkle.get(i), WHOLE_NOTE);
                    }
                    else {
                        playnote(Twinkle.get(i), WHOLE_NOTE/2);
                    }

                }
                for (n = 0; n < TwinkleP.getValue(); n++) {
                    for (i = 0; i < Twinkle2.size(); i++) {
                        if (i == 6) {
                            playnote(Twinkle2.get(i), WHOLE_NOTE);
                        } else {
                            playnote(Twinkle2.get(i), WHOLE_NOTE / 2);
                        }

                    }
                }
                for (i = 0; i < Twinkle.size(); i++){
                    if (i == 6 || i == 13){
                        playnote(Twinkle.get(i), WHOLE_NOTE);
                    }
                    else {
                        playnote(Twinkle.get(i), WHOLE_NOTE/2);
                    }

                }
            }
        });
        LeanOnMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 0;
                for (i = 0; i < LeanOn.size(); i++){
                    if (i==0 || i==4 || i==8 || i==12 || i==14 || i==18 || i==22|| i==26){
                        playnote(LeanOn.get(i), WHOLE_NOTE*2);
                    }
                    else if (i==3 || i==7 || i==11 || i==13 || i==17 || i==21 || i==25 || i==27){
                        playnote(LeanOn.get(i), WHOLE_NOTE);
                    }
                    else{
                       playnote(LeanOn.get(i), WHOLE_NOTE/2);
                    }
                }
            }
        });

    }

    private void delayplaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void playnote(MediaPlayer mp, int delay){
        mp.seekTo(0);
        mp.start();
        delayplaying(delay);

    }

}
