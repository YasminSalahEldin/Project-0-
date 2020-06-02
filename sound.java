package com.example.android.viewpager;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import com.example.android.viewpager.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab1 extends Fragment {
    private SoundPool soundPool;
    private int number1,number2,number3,number4,number5,number6,number7,number8,number9,number10;

    public tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            SoundPool = new SoundPool.Builder()
                    .setMaxStreams(10)
                    .setAudioAttributes(audioAttributes)
                    .build();
        }
    } else {
        SoundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);


        number1 = soundPool.load(this,R.raw.number_one,1);
        number2 = soundPool.load(this,R.raw.number_two,1);
        number3 = soundPool.load(this,R.raw.number_three,1);
        number4 = soundPool.load(this,R.raw.number_four,1);
        number5 = soundPool.load(this,R.raw.number_five,1);
        number6 = soundPool.load(this,R.raw.number_six,1);
        number7 = soundPool.load(this,R.raw.number_seven,1);
        number8 = soundPool.load(this,R.raw.number_eight,1);
        number9 = soundPool.load(this,R.raw.number_nine,1);
        number10 = soundPool.load(this,R.raw.number_ten,1);

    }
    public void playSound(View v){
        Switch (v.getId()){
            case R.id.imageView:
                soundPool.play(number1,1,1,0,0,1);
                break;
            case R.id.imageView5:
                soundPool.play(number2,1,1,0,0,1);
                break;
            case R.id.imageView6:
                soundPool.play(number3,1,1,0,0,1);
                break;
            case R.id.imageView7:
                soundPool.play(number4,1,1,0,0,1);
                break;
            case R.id.imageView8:
                soundPool.play(number5,1,1,0,0,1);
                break;
            case R.id.imageView9:
                soundPool.play(number6,1,1,0,0,1);
                break;
            case R.id.imageView10:
                soundPool.play(number7,1,1,0,0,1);
                break;
            case R.id.imageView11:
                soundPool.play(number8,1,1,0,0,1);
                break;
            case R.id.imageView12:
                soundPool.play(number9,1,1,0,0,1);
                break;
            case R.id.imageView13:
                soundPool.play(number10,1,1,0,0,1);
                break;

        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
}
