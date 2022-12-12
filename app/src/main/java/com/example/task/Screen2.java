package com.example.task;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Intent intent=getIntent();

        int[] arr=intent.getIntArrayExtra("key");

        System.out.println(Arrays.toString(arr));
        ImageView i1=findViewById(R.id.fr);
        ImageView i2=findViewById(R.id.mg);
        ImageView i3=findViewById(R.id.wh1);
        ImageView i4=findViewById(R.id.wh2);
        ImageView i5=findViewById(R.id.ss1);
        ImageView i6=findViewById(R.id.st);


            if(arr[0]==0)
            {
                i2.setVisibility(View.INVISIBLE);
            }
            if(arr[1]==0)
            {
                i1.setVisibility(View.INVISIBLE);
            }
            if(arr[4]==0)
            {
                i3.setVisibility(View.INVISIBLE);
                i4.setVisibility(View.INVISIBLE);
            }
            if(arr[3]==0)
            {
                i5.setVisibility(View.INVISIBLE);
            }
            if(arr[2]==0)
            {
                i6.setVisibility(View.INVISIBLE);
            }


            int color[]=new int[4];
            CheckBox red=(CheckBox) findViewById(R.id.checkBoxRed);
            CheckBox blue=(CheckBox) findViewById(R.id.checkBoxBlue);
            CheckBox green=(CheckBox) findViewById(R.id.checkBoxGreen);
            CheckBox yellow=(CheckBox) findViewById(R.id.checkBoxYellow);

            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    red.setChecked(true);
                    Arrays.fill(color,0);
                    color[0]=1;
                    blue.setChecked(false);
                    green.setChecked(false);
                    yellow.setChecked(false);

                }
            });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blue.setChecked(true);
                Arrays.fill(color,0);
                color[1]=1;
                red.setChecked(false);
                green.setChecked(false);
                yellow.setChecked(false);

            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                green.setChecked(true);
                Arrays.fill(color,0);
                color[2]=1;
                red.setChecked(false);
                blue.setChecked(false);
                yellow.setChecked(false);

            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yellow.setChecked(true);
                Arrays.fill(color,0);
                color[3]=1;
                red.setChecked(false);
                blue.setChecked(false);
                green.setChecked(false);

            }
        });

         Button btn=findViewById(R.id.button2);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(color[0]==color[1]&&color[2]==color[3]&&color[0]==color[3])
                 {
                     Toast.makeText(Screen2.this, "Please check on one of the colors!!!", Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     Intent intent=new Intent(Screen2.this,Final.class);
                     intent.putExtra("keycolor",color);
                     intent.putExtra("keyimage",arr);
                     startActivity(intent);
                 }
             }
         });





    }
}