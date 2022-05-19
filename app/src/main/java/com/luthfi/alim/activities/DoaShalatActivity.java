package com.luthfi.alim.activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.luthfi.alim.R;

import java.io.IOException;

public class DoaShalatActivity extends AppCompatActivity {
    Button Play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        //Inisialisasi Button
        Play = findViewById(R.id.btnPlay);

        //Menambahkan Listener pada Button
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stateAwal();
            }
        });
    }

    private void stateAwal(){

        Play.setEnabled(false);
    }

    private void playAudio(){
        //Menentukan resource audio yang akan dijalankan
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.y2mate);

        //Kondisi Button setelah tombol play di klik
        Play.setEnabled(true);

        //Menjalankan Audio / Musik
        try{
            mediaPlayer.prepare();
        }catch (IllegalStateException ex){
            ex.printStackTrace();
        }catch (IOException ex1){
            ex1.printStackTrace();
        }
        mediaPlayer.start();

        //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlay:
                playAudio();
                break;
        }
    }


}
