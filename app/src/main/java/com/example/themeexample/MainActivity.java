package com.example.themeexample;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button simpleBtn, bigBtn,originalBtn;
    private TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.customText);
        text2 = (TextView) findViewById(R.id.bigText);

        originalBtn = (Button) findViewById(R.id.originalTextButton);
        originalBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                text1.setTextAppearance(getApplicationContext(), R.style.MyAppTheme);
                text2.setTextAppearance(getApplicationContext(), R.style.MyAppTheme);
            }
        });

        simpleBtn = (Button) findViewById(R.id.simpleTextButton);
        simpleBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                text1.setTextAppearance(getApplicationContext(), R.style.SimpleStyle);
                text2.setTextAppearance(getApplicationContext(), R.style.SimpleStyle);
            }
        });

        bigBtn = (Button) findViewById(R.id.bigTextButton);
        bigBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                text1.setTextAppearance(getApplicationContext(), R.style.SimpleStyle_BigPurple);
                text2.setTextAppearance(getApplicationContext(), R.style.SimpleStyle_BigPurple);
            }
        });
    }

}

