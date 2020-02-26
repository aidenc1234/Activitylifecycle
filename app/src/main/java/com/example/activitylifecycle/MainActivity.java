package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MAIN_ACTIVITY";
    private static final String STORAGE_KEY = "stored_count";
    private SharedPreferences.Editor mEditor;

    TextView m1;
    TextView m2;
    TextView m3;
    TextView m4;
    TextView m5;
    TextView m6;
    TextView m7;

    private int createcount;
    private int destroycount;
    private int restartcount;
    private int resumecount;
    private int pausecount;
    private int startcount;
    private int stopcount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = findViewById(R.id.oncreate);
        m2 = findViewById(R.id.ondestroy);
        m3 = findViewById(R.id.onrestart);
        m4 = findViewById(R.id.onresume);
        m5 = findViewById(R.id.onpause);
        m6 = findViewById(R.id.onstart);
        m7 = findViewById(R.id.onstop);
        createcount++;
        m1.setText("Oncreate: " +createcount);
        m2.setText("Ondestroy: " +destroycount);
        m3.setText("Onrestart: " +restartcount);
        m4.setText("Onresume: " +resumecount);
        m5.setText("Onpause: " +pausecount);
        m6.setText("Onstart: " +startcount);
        m7.setText("Onstop: " +stopcount);
        SharedPreferences mySharedPrefs = getSharedPreferences("Storage", Context.MODE_PRIVATE);


    }
    @Override
    protected void onDestroy() {
        destroycount++;

        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        restartcount++;
        m1.setText("Oncreate: " +createcount);
        m2.setText("Ondestroy: " +destroycount);
        m3.setText("Onrestart: " +restartcount);
        m4.setText("Onresume: " +resumecount);
        m5.setText("Onpause: " +pausecount);
        m6.setText("Onstart: " +startcount);
        m7.setText("Onstop: " +stopcount);
        super.onRestart();


    }
    @Override
    protected void onResume() {
        resumecount++;
        m1.setText("Oncreate: " +createcount);
        m2.setText("Ondestroy: " +destroycount);
        m3.setText("Onrestart: " +restartcount);
        m4.setText("Onresume: " +resumecount);
        m5.setText("Onpause: " +pausecount);
        m6.setText("Onstart: " +startcount);
        m7.setText("Onstop: " +stopcount);
        super.onResume();

    }
    @Override
    protected void onPause() {
        pausecount++;
        super.onPause();
    }
    @Override
    protected void onStart() {
        startcount++;
        m1.setText("Oncreate: " +createcount);
        m2.setText("Ondestroy: " +destroycount);
        m3.setText("Onrestart: " +restartcount);
        m4.setText("Onresume: " +resumecount);
        m5.setText("Onpause: " +pausecount);
        m6.setText("Onstart: " +startcount);
        m7.setText("Onstop: " +stopcount);
        super.onStart();
    }
    @Override
    protected void onStop() {
        stopcount++;
        super.onStop();
    }
    }


