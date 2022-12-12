package com.example.task;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Intent intent=getIntent();

        int[] arr=intent.getIntArrayExtra("keyimage");
        int [] color=intent.getIntArrayExtra("keycolor");

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

        ConstraintLayout layout=findViewById(R.id.constraint);
        if(color[0]==1)
        {
            layout.setBackgroundColor(Color.RED);
        }
        else if(color[1]==1)
        {
            layout.setBackgroundColor(Color.BLUE);
        }
        else if(color[2]==1)
        {
            layout.setBackgroundColor(Color.GREEN);
        }
        else
        {
            layout.setBackgroundColor(Color.YELLOW);
        }

    }
}