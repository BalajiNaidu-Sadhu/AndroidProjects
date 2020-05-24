

/****************************************************************************
 *                                                                          *
 *                  Name :- Balaji Naidu Sadhu                                 *
 *                  ZID :- Z1860906                                         *
 *                  Due Date :- April 15 2020                                           *
 *                  Assignment :- 100                                          *
 *                  Description :- An application to display                *
 *                                  the splash screen and play audio        *
 ****************************************************************************/


package z1860906.cs.niu.edu.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {
    // The five imageViews
    private Button titanicBtn,KGFBtn, Car1Btn, Car2Btn, TBBtn,RrrBtn;
    // The five MediaPlayers
    private MediaPlayer titanicPlayer,KGFPlayer, Car1Player, Car2Player, TBPlayer,RrrPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons Initialization
        titanicBtn = findViewById(R.id.titanicBtn);
        KGFBtn = findViewById(R.id.KGFBtn);
        Car1Btn = findViewById(R.id.CarBtn);
        Car2Btn = findViewById(R.id.Car1Btn);
        TBBtn = findViewById(R.id.TBBtn);
        RrrBtn = findViewById(R.id.rrr);


        //Assign Click Listener
        titanicBtn.setOnClickListener(this);
        KGFBtn.setOnClickListener(this);
        Car1Btn.setOnClickListener(this);
        Car2Btn.setOnClickListener(this);
        TBBtn.setOnClickListener(this);
        RrrBtn.setOnClickListener(this);

        // Media Player Initialization
        // Create the media player for each instrument
        titanicPlayer = MediaPlayer.create(this,R.raw.titanic);
        KGFPlayer = MediaPlayer.create(this,R.raw.kgfdrum);
        Car1Player = MediaPlayer.create(this,R.raw.kamals);
        Car2Player = MediaPlayer.create(this,R.raw.garuda);
        TBPlayer = MediaPlayer.create(this,R.raw.rocky);
        RrrPlayer = MediaPlayer.create(this,R.raw.aravinda);
    }
    // functionality for onclick of the images
    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.titanicBtn :  if(titanicPlayer.isPlaying())
                                    {
                                        titanicPlayer.pause();
                                    }
                                    else
                                    {
                                        if(KGFPlayer.isPlaying())
                                        {
                                            KGFPlayer.pause();
                                        }
                                        else if(Car1Player.isPlaying())
                                        {
                                            Car1Player.pause();
                                        }
                                        else if(Car2Player.isPlaying())
                                        {
                                            Car2Player.pause();
                                        }
                                        else if(TBPlayer.isPlaying())
                                        {
                                            TBPlayer.pause();
                                        }
                                        else if(RrrPlayer.isPlaying())
                                        {
                                            RrrPlayer.pause();
                                        }


                                        titanicPlayer.start();
                                    }
                                    break;

            case R.id.KGFBtn :      if(KGFPlayer.isPlaying())
                                    {
                                        KGFPlayer.pause();
                                    }
                                    else
                                    {
                                        if(titanicPlayer.isPlaying())
                                        {
                                            titanicPlayer.pause();
                                        }
                                        else if(Car1Player.isPlaying())
                                        {
                                            Car1Player.pause();
                                        }
                                        else if(Car2Player.isPlaying())
                                        {
                                            Car2Player.pause();
                                        }
                                        else if(TBPlayer.isPlaying())
                                        {
                                            TBPlayer.pause();
                                        }
                                        else if(RrrPlayer.isPlaying())
                                        {
                                            RrrPlayer.pause();
                                        }

                                        KGFPlayer.start();
                                    }
                                    break;

            case R.id.Car1Btn :      if(Car1Player.isPlaying())
                                    {
                                        Car1Player.pause();
                                    }
                                    else
                                    {
                                        if(titanicPlayer.isPlaying())
                                        {
                                            titanicPlayer.pause();
                                        }
                                        else if(KGFPlayer.isPlaying())
                                        {
                                            KGFPlayer.pause();
                                        }
                                        else if(Car2Player.isPlaying())
                                        {
                                            Car2Player.pause();
                                        }
                                        else if(TBPlayer.isPlaying())
                                        {
                                            TBPlayer.pause();
                                        }
                                        else if(RrrPlayer.isPlaying())
                                        {
                                            RrrPlayer.pause();
                                        }

                                        Car1Player.start();
                                    }
                                    break;

            case R.id.CarBtn :     if(Car2Player.isPlaying())
                                    {
                                        Car2Player.pause();
                                    }
                                    else
                                    {
                                        if(titanicPlayer.isPlaying())
                                        {
                                            titanicPlayer.pause();
                                        }
                                        else if(KGFPlayer.isPlaying())
                                        {
                                            KGFPlayer.pause();
                                        }
                                        else if(Car1Player.isPlaying())
                                        {
                                            Car1Player.pause();
                                        }
                                        else if(TBPlayer.isPlaying())
                                        {
                                            TBPlayer.pause();
                                        }
                                        else if(RrrPlayer.isPlaying())
                                        {
                                            RrrPlayer.pause();
                                        }

                                        Car2Player.start();
                                    }
                                    break;

            case R.id.TBBtn :       if(TBPlayer.isPlaying())
                                    {
                                        TBPlayer.pause();
                                    }
                                    else
                                    {
                                        if(titanicPlayer.isPlaying())
                                        {
                                            titanicPlayer.pause();
                                        }
                                        else if(KGFPlayer.isPlaying())
                                        {
                                            KGFPlayer.pause();
                                        }
                                        else if(Car1Player.isPlaying())
                                        {
                                            Car1Player.pause();
                                        }
                                        else if(Car2Player.isPlaying())
                                        {
                                            Car2Player.pause();
                                        }
                                        else if(RrrPlayer.isPlaying())
                                        {
                                            RrrPlayer.pause();
                                        }

                                        TBPlayer.start();
                                    }
                                    break;
            case R.id.rrr :       if(RrrPlayer.isPlaying())
            {
                RrrPlayer.pause();
            }
            else
            {
                if(titanicPlayer.isPlaying())
                {
                    titanicPlayer.pause();
                }
                else if(KGFPlayer.isPlaying())
                {
                    KGFPlayer.pause();
                }
                else if(Car1Player.isPlaying())
                {
                    Car1Player.pause();
                }
                else if(Car2Player.isPlaying())
                {
                    Car2Player.pause();
                }
                else if(TBPlayer.isPlaying())
                {
                    TBPlayer.pause();
                }

                RrrPlayer.start();
            }
                break;


            default :               titanicPlayer.stop();
                                    KGFPlayer.stop();
                                    Car1Player.stop();
                                    Car2Player.stop();
                                    TBPlayer.stop();
                                    RrrPlayer.stop();
                                    break;
        }
    }
    //method for backpressed and stop and finish the function and exit
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        titanicPlayer.stop();
        KGFPlayer.stop();
        Car1Player.stop();
        Car2Player.stop();
        TBPlayer.stop();
        RrrPlayer.stop();
        finish();
    }
}
