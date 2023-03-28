package com.example.switch_and_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private int check = 1;

    private LinearLayout ll;
    private Button button;
    private Switch switch1;

    private RadioButton rd1;

    private RadioButton rd2;

    private RadioButton rd3;

    private RadioButton rd4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = findViewById(R.id.switch1);
        button = findViewById(R.id.button);
        ll = (LinearLayout) findViewById(R.id.mew);
        rd1 = findViewById(R.id.radioButton);
        rd2 = findViewById(R.id.radioButton2);
        rd3 = findViewById(R.id.radioButton3);
        rd4 = findViewById(R.id.radioButton4);
    }

    public void me1(View view) {
        if(check==1)
        {
            ll.setBackgroundColor(Color.parseColor("#FFFF00"));
        }
    }

    public void me2(View view) {
        if(check==1)
        {
            ll.setBackgroundColor(Color.parseColor("#00FF00"));
        }
    }

    public void me3(View view) {
        if(check==1)
        {
            ll.setBackgroundColor(Color.parseColor("#FF0000"));
        }
    }

    public void me4(View view) {
        if(check==1)
        {
            ll.setBackgroundColor(Color.parseColor("#0000FF"));
        }
    }

    public void go(View view) {
        if(check == 0)
        {
            if(rd1.isChecked())
            {
                ll.setBackgroundColor(Color.parseColor("#FFFF00"));
            }
            else if(rd2.isChecked())
            {
                ll.setBackgroundColor(Color.parseColor("#00FF00"));
            }
            else if(rd3.isChecked())
            {
                ll.setBackgroundColor(Color.parseColor("#FF0000"));
            }
            else
            {
                ll.setBackgroundColor(Color.parseColor("#0000FF"));
            }
        }
    }
    public void letsSee(View view) {
        if(switch1.isChecked())
        {
            check = 0;
        }
        else
        {
            check = 1;
        }
    }
}