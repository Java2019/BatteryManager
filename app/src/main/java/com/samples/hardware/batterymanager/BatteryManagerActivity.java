package com.samples.hardware.batterymanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BatteryManagerActivity extends AppCompatActivity
        implements View.OnClickListener{

    private Button bStart;
    private Button bStop;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_manager);

        text = (TextView)findViewById(R.id.text);
        bStart = (Button)findViewById(R.id.bStart);
        bStop = (Button)findViewById(R.id.bStop);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bStart:

                break;
            case R.id.bStop:

                break;
        }
    }
}
