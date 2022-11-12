package org.techtown.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;

import static android.speech.tts.TextToSpeech.ERROR;
import java.util.Locale;

public class MenuActivity extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,
              imageView6,imageView7,imageView8,imageView9,imageView10,
              imageView11,imageView12,imageView13,imageView14,imageView15,
              imageView16,imageView17,imageView18;



    int imageIndex = 0;
    TextToSpeech tts;
    TextView textView1,textView2,textView3,textView4,textView5,
            textView7,textView8,textView9,textView10,textView11,textView12,
            textView13,textView14,textView15,textView16,textView17,
            king1,king2,king3,clover1,clover2,clover3,clover4,clover5,
            clover6,clover7,clover8,clover9,jam1,jam2,jam3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = getIntent();

        //돌아가기 버튼
        Button button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        finish();
                    }
                }
        );

        //읽어주기 버튼

        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);
        textView3 = (TextView) findViewById(R.id.text3);
        textView4 = (TextView) findViewById(R.id.text4);
        textView5 = (TextView) findViewById(R.id.text5);
        textView7 = (TextView) findViewById(R.id.text7);
        textView8 = (TextView) findViewById(R.id.text8);
        textView9 = (TextView) findViewById(R.id.text9);
        textView10 = (TextView) findViewById(R.id.text10);
        textView11 = (TextView) findViewById(R.id.text11);
        textView12 = (TextView) findViewById(R.id.text12);
        textView13 = (TextView) findViewById(R.id.text13);
        textView14 = (TextView) findViewById(R.id.text14);
        textView15 = (TextView) findViewById(R.id.text15);
        textView16 = (TextView) findViewById(R.id.text16);
        textView17 = (TextView) findViewById(R.id.text17);
        king1 = (TextView) findViewById(R.id.king1);
        king2 = (TextView) findViewById(R.id.king2);
        king3 = (TextView) findViewById(R.id.king3);
        clover1 = (TextView) findViewById(R.id.clover1);
        clover2 = (TextView) findViewById(R.id.clover2);
        clover3 = (TextView) findViewById(R.id.clover3);
        clover4 = (TextView) findViewById(R.id.clover4);
        clover5 = (TextView) findViewById(R.id.clover5);
        clover6 = (TextView) findViewById(R.id.clover6);
        clover7 = (TextView) findViewById(R.id.clover7);
        clover8 = (TextView) findViewById(R.id.clover8);
        clover9 = (TextView) findViewById(R.id.clover9);
        jam1 = (TextView) findViewById(R.id.jam1);
        jam2 = (TextView) findViewById(R.id.jam2);
        jam3 = (TextView) findViewById(R.id.jam3);


        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != ERROR) {
                    // 언어를 선택한다.
                    tts.setLanguage(Locale.KOREAN);
                }
            }
        });
        Button soundon = (Button)findViewById(R.id.button10);
        soundon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // editText에 있는 문장을 읽는다.
                if(imageIndex == 0) {
                    tts.speak(textView1.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }else if(imageIndex == 1){
                    tts.speak(textView2.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }else if(imageIndex == 2){
                    tts.speak(textView3.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }else if(imageIndex == 3){
                    tts.speak(textView4.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }else if(imageIndex == 4){
                    tts.setSpeechRate(0.7f);
                    tts.setPitch(0.7f);
                    tts.speak(king1.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);

                    tts.setPitch(1.5f);
                    tts.speak(clover1.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 5){
                    tts.setPitch(0.7f);
                    tts.speak(king2.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);

                    tts.setPitch(1.5f);
                    tts.speak(clover2.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 6){
                    tts.setSpeechRate(1f);
                    tts.speak(textView5.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);

                    tts.setSpeechRate(0.7f);
                    tts.setPitch(1.5f);
                    tts.speak(clover3.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 7){
                    tts.setSpeechRate(1f);
                    tts.setPitch(1f);
                    tts.speak(textView7.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);

                    tts.setSpeechRate(0.7f);
                    tts.setPitch(1.5f);
                    tts.speak(clover4.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 8){
                    tts.setPitch(1f);
                    tts.setSpeechRate(1f);
                    tts.speak(textView8.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }else if(imageIndex == 9){
                    tts.speak(textView9.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }else if(imageIndex == 10){
                    tts.speak(textView10.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }else if(imageIndex == 11){
                    tts.speak(textView11.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }else if(imageIndex == 12){
                    tts.speak(textView12.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);

                    tts.setPitch(1.5f);
                    tts.setSpeechRate(0.7f);
                    tts.speak(clover5.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 13){
                    tts.setPitch(1f);
                    tts.setSpeechRate(1f);
                    tts.speak(textView13.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);

                    tts.setPitch(1.5f);
                    tts.setSpeechRate(0.7f);
                    tts.speak(clover6.getText().toString(),TextToSpeech.QUEUE_ADD,null);

                    tts.setPitch(2.0f);
                    tts.speak(jam1.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 14){
                    tts.setPitch(1f);
                    tts.setSpeechRate(1f);
                    tts.speak(textView14.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);

                    tts.setPitch(1.5f);
                    tts.setSpeechRate(0.7f);
                    tts.speak(clover7.getText().toString(),TextToSpeech.QUEUE_ADD,null);

                    tts.setPitch(2.0f);
                    tts.speak(jam2.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 15){
                    tts.setPitch(1f);
                    tts.setSpeechRate(1f);
                    tts.speak(textView15.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);

                    tts.setPitch(1.5f);
                    tts.setSpeechRate(0.7f);
                    tts.speak(clover8.getText().toString(),TextToSpeech.QUEUE_ADD,null);

                    tts.setPitch(2.0f);
                    tts.speak(jam3.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 16){
                    tts.setPitch(1f);
                    tts.setSpeechRate(1f);
                    tts.speak(textView16.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);

                    tts.setSpeechRate(0.7f);
                    tts.setPitch(0.7f);
                    tts.speak(king3.getText().toString(),TextToSpeech.QUEUE_ADD,null);

                    tts.setPitch(1.5f);
                    tts.speak(clover9.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                }else if(imageIndex == 17){
                    tts.setPitch(1f);
                    tts.setSpeechRate(1f);
                    tts.speak(textView17.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

        Button soundoff = (Button)findViewById(R.id.soundoff);
        soundoff.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                tts.stop();
            }
        });

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);

    }

    public void onButtonClicked(View v) {
        tts.stop();
        imageIndex++;
        if (imageIndex > 17){
            imageIndex = 0;
        }
        changeImage();
    }
    public void onButton2Clicked(View v){
        tts.stop();
        imageIndex--;
        if (imageIndex < 0){
            imageIndex = 17;
        }
        changeImage();
    }

    private void changeImage(){
        if (imageIndex == 0){
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);

        } else if (imageIndex == 1) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.VISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 2) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.VISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 3) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.VISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.VISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 4) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.VISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.VISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.VISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 5) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.VISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.VISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.VISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 6) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.VISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.VISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.VISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 7) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.VISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.VISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.VISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 8) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.VISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.VISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 9) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.VISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.VISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 10) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.VISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.VISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 11) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.VISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.VISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 12) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.VISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.VISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.VISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 13) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.VISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.VISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.VISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.VISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 14) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.VISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.VISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.VISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.VISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 15) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.VISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.VISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.VISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.VISIBLE);
        }else if (imageIndex == 16) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.VISIBLE);
            imageView18.setVisibility(View.INVISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.VISIBLE);
            textView17.setVisibility(View.INVISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.VISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.VISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }else if (imageIndex == 17) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            imageView13.setVisibility(View.INVISIBLE);
            imageView14.setVisibility(View.INVISIBLE);
            imageView15.setVisibility(View.INVISIBLE);
            imageView16.setVisibility(View.INVISIBLE);
            imageView17.setVisibility(View.INVISIBLE);
            imageView18.setVisibility(View.VISIBLE);

            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView7.setVisibility(View.INVISIBLE);
            textView8.setVisibility(View.INVISIBLE);
            textView9.setVisibility(View.INVISIBLE);
            textView10.setVisibility(View.INVISIBLE);
            textView11.setVisibility(View.INVISIBLE);
            textView12.setVisibility(View.INVISIBLE);
            textView13.setVisibility(View.INVISIBLE);
            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.VISIBLE);

            king1.setVisibility(View.INVISIBLE);
            king2.setVisibility(View.INVISIBLE);
            king3.setVisibility(View.INVISIBLE);
            clover1.setVisibility(View.INVISIBLE);
            clover2.setVisibility(View.INVISIBLE);
            clover3.setVisibility(View.INVISIBLE);
            clover4.setVisibility(View.INVISIBLE);
            clover5.setVisibility(View.INVISIBLE);
            clover6.setVisibility(View.INVISIBLE);
            clover7.setVisibility(View.INVISIBLE);
            clover8.setVisibility(View.INVISIBLE);
            clover9.setVisibility(View.INVISIBLE);
            jam1.setVisibility(View.INVISIBLE);
            jam2.setVisibility(View.INVISIBLE);
            jam3.setVisibility(View.INVISIBLE);
        }
    }
}