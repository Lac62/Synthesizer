package com.example.rcarpenter.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import java.util.ArrayList;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private Button fButton;
    private Button eButton;
    private Button Challenge1;
    private Button Challenge2;
    private NumberPicker numberPicker;
    private NumberPicker numberPicker2;
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
    String names[] = {"A", "B", "B Flat", "C", "C Sharp", "D", "D Sharp", "E", "F", "F Sharp", "G", "G Sharp", "High E", "High F", "High F Sharp", "High G"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        fButton = (Button) findViewById(R.id.Fbutton);
        eButton = (Button) findViewById(R.id.Ebutton);
        Challenge1 = (Button) findViewById(R.id.Challenge1);
        Challenge2 = (Button) findViewById(R.id.Challenge2);
        numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker2 = (NumberPicker) findViewById(R.id.numberPicker2);
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
                for (i = 0, )


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
