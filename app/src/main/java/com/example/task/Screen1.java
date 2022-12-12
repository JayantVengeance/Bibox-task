package com.example.task;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Screen1 extends AppCompatActivity {


    private Button S1S2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        CheckBox mc1=(CheckBox) findViewById(R.id.cb1);
        CheckBox mc2=(CheckBox)findViewById(R.id.cb2);
        CheckBox mc3=(CheckBox)findViewById(R.id.cb3);
        CheckBox mc4=(CheckBox)findViewById(R.id.cb4);
        CheckBox mc5=(CheckBox)findViewById(R.id.cb5);


        S1S2=findViewById(R.id.button);


       int a[]=new int[5];

        S1S2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int count=0;

                if(mc1.isChecked()==true)
                {
                    count++;
                   a[0]=1;
                }

                if(mc2.isChecked()==true)
                {
                    count++;
                    a[1]=1;
                }
                if(mc3.isChecked()==true)
                {
                    count++;
                    a[2]=1;
                }
                if(mc4.isChecked()==true)
                {
                    count++;
                    a[3]=1;
                }
                if(mc5.isChecked()==true)
                {
                    count++;
                    a[4]=1;
                }

                int finalCount = count;
                Log.i("final count is", String.valueOf(finalCount));
                if(finalCount ==5||finalCount==3)
                {
                    Intent intent=new Intent(Screen1.this, Screen2.class);
                    intent.putExtra("key",a);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Select 3 or all", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}