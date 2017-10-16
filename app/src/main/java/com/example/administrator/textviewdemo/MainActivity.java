package com.example.administrator.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTv;
    private Boolean mSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv = (TextView) findViewById(R.id.tv);

        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mSelected) {
                    mSelected = true;
                    mTv.setSelected(true);
                }else {
                    mSelected = false;
                    mTv.setSelected(false);
                }
            }
        });


    }
}
