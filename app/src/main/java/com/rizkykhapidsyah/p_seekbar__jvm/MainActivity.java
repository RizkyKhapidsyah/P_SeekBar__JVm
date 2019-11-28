package com.rizkykhapidsyah.p_seekbar__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView TV_SeekBarProgress_IDJAVA;
    SeekBar SeekBar_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV_SeekBarProgress_IDJAVA = findViewById(R.id.TV_SeekBarProgress_IDXML);
        TV_SeekBarProgress_IDJAVA.setText("0%");

        SeekBar_IDJAVA = findViewById(R.id.SeekBar_IDXML);

        SeekBar_IDJAVA.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int X = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                X = progress;
                String Z = String.valueOf(X);
                TV_SeekBarProgress_IDJAVA.setText(Z + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Kosong
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, X + "%", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
