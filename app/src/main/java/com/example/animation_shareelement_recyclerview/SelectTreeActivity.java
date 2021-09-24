package com.example.animation_shareelement_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class SelectTreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_tree);

        Fade fade = new Fade();
        View decor= getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);


        final ImageView imgTree1= findViewById(R.id.imgTree1);
        imgTree1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectTreeActivity.this,Screen4.class);

                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(
                        SelectTreeActivity.this,imgTree1,
                        ViewCompat.getTransitionName(imgTree1)
                );
                startActivity(intent, optionsCompat.toBundle());
            }
        });

        final ImageView imgTree3= findViewById(R.id.imgTree3);
        imgTree3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectTreeActivity.this,Screen3.class);

                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(
                        SelectTreeActivity.this,imgTree3,
                        ViewCompat.getTransitionName(imgTree3)
                );
                startActivity(intent, optionsCompat.toBundle());
            }
        });



    }
}