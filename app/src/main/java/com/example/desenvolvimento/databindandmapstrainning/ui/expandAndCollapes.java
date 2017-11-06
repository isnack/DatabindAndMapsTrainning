package com.example.desenvolvimento.databindandmapstrainning.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.desenvolvimento.databindandmapstrainning.R;

public class expandAndCollapes extends Activity{


    boolean isExpanded=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extend_lay);

        Button expand=(Button)findViewById(R.id.button1);
        Button collapse=(Button)findViewById(R.id.button2);


        final ImageView image1=(ImageView)findViewById(R.id.imageView1);
        final ImageView image2=(ImageView)findViewById(R.id.imageView2);



        expand.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!isExpanded){
                    image1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_out));
                    image2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down));
                    isExpanded=true;
                }else{
                    image1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_in));
                    image2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up));
                    isExpanded=false;
                }

            }
        });

        collapse.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if(isExpanded){
                    image1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_in));
                    image2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up));
                    isExpanded=false;
                }
            }
        });
    }

}
