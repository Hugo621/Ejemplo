package com.hugomahanjane.ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ciclovida" ,"ingreso a metodo oncreate");


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclovida" ,"ingreso a metodo onrestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclovida" ,"ingreso a metodo onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclovida" ,"ingreso a metodo onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ciclovida" ,"ingreso a metodo onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclovida" ,"ingreso a metodo onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclovida" ,"ingreso a metodo ondestroy");
    }
}
