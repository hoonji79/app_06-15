package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class app_main extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_main);

        Button item = findViewById(R.id.button8);
        ImageView profileImg = findViewById(R.id.imageView3);
        ImageButton insert_carpool = findViewById(R.id.imageButton4);
        Intent emailIntent = getIntent();
        String email = emailIntent.getStringExtra("email"); // 유저 이메일


        profileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_main.this,select_mypage.class);
                startActivity(intent);
            }
        });

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_main.this,detail_carpool.class);
                startActivity(intent);
            }
        });

        insert_carpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(app_main.this,insert_carpool.class);
                intent.putExtra("email",email);
                startActivity(intent);
            }
        });

    }
}
