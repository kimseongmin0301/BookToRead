package org.techtown.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu4Activity extends AppCompatActivity {
    int imageIndex = 0;
    public void onButtonClicked(View v) {
        imageIndex++;
        if (imageIndex > 17){
            imageIndex = 0;
        }
    }
    public void onButton2Clicked(View v){
        imageIndex--;
        if (imageIndex < 0){
            imageIndex = 17;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
        Intent intent = getIntent();

        //돌아가기 버튼
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        finish();
                    }
                }
        );
    }
}