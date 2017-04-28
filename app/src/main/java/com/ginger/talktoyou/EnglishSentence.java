package com.ginger.talktoyou;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class EnglishSentence extends  Activity {
    private EditText num1;
    int [] text;
    private static int i = 0;
    private static int judge = 0;
    private SoundPool soundPool11;
    private SoundPool soundPool12;
    private SoundPool soundPool13;
    private SoundPool soundPool14;
    private SoundPool soundPool15;
    private SoundPool soundPool16;
    private SoundPool soundPool17;
    private SoundPool soundPool18;
    private SoundPool soundPool21;
    private SoundPool soundPool22;
    private SoundPool soundPool23;
    private SoundPool soundPool24;
    private SoundPool soundPool25;
    private SoundPool soundPool26;
    private SoundPool soundPool27;
    private SoundPool soundPool28;
    private SoundPool soundPool31;
    private SoundPool soundPool32;
    private SoundPool soundPool33;
    private SoundPool soundPool34;
    private SoundPool soundPool35;
    private SoundPool soundPool36;
    private SoundPool soundPool37;
    private SoundPool soundPool38;
    private SoundPool soundPool41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.ginger.talktoyou.R.layout.english_sentence);
        text = new int[100];
        soundPool11 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool11.load(this, com.ginger.talktoyou.R.mipmap.es11, 1);
        soundPool12 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool12.load(this, com.ginger.talktoyou.R.mipmap.es12, 1);
        soundPool13 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool13.load(this, com.ginger.talktoyou.R.mipmap.es13, 1);
        soundPool14 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool14.load(this, com.ginger.talktoyou.R.mipmap.es14, 1);
        soundPool15 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool15.load(this, com.ginger.talktoyou.R.mipmap.es15, 1);
        soundPool16 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool16.load(this, com.ginger.talktoyou.R.mipmap.es16, 1);
        soundPool17 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool17.load(this, com.ginger.talktoyou.R.mipmap.es17, 1);
        soundPool18 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool18.load(this, com.ginger.talktoyou.R.mipmap.es18, 1);
        soundPool21 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool21.load(this, com.ginger.talktoyou.R.mipmap.es21, 1);
        soundPool22 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool22.load(this, com.ginger.talktoyou.R.mipmap.es22, 1);
        soundPool23 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool23.load(this, com.ginger.talktoyou.R.mipmap.es23, 1);
        soundPool24 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool24.load(this, com.ginger.talktoyou.R.mipmap.es24, 1);
        soundPool25 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool25.load(this, com.ginger.talktoyou.R.mipmap.es25, 1);
        soundPool26 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool26.load(this, com.ginger.talktoyou.R.mipmap.es26, 1);
        soundPool27 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool27.load(this, com.ginger.talktoyou.R.mipmap.es27, 1);
        soundPool28 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool28.load(this, com.ginger.talktoyou.R.mipmap.es28, 1);
        soundPool31 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool31.load(this, com.ginger.talktoyou.R.mipmap.es31, 1);
        soundPool32 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool32.load(this, com.ginger.talktoyou.R.mipmap.es32, 1);
        soundPool33 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool33.load(this, com.ginger.talktoyou.R.mipmap.es33, 1);
        soundPool34 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool34.load(this, com.ginger.talktoyou.R.mipmap.es34, 1);
        soundPool35 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool35.load(this, com.ginger.talktoyou.R.mipmap.es35, 1);
        soundPool36 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool36.load(this, com.ginger.talktoyou.R.mipmap.es36, 1);
        soundPool37 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool37.load(this, com.ginger.talktoyou.R.mipmap.es37, 1);
        soundPool38 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool38.load(this, com.ginger.talktoyou.R.mipmap.es38, 1);
        soundPool41 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool41.load(this, com.ginger.talktoyou.R.mipmap.es41, 1);

        ImageButton btn1 = (ImageButton) findViewById(com.ginger.talktoyou.R.id.button1);
        ImageButton btn2 = (ImageButton) findViewById(com.ginger.talktoyou.R.id.button2);
        ImageButton btn3 = (ImageButton) findViewById(com.ginger.talktoyou.R.id.button3);
        ImageButton btn4 = (ImageButton) findViewById(com.ginger.talktoyou.R.id.button4);
        ImageButton clear = (ImageButton) findViewById(com.ginger.talktoyou.R.id.people);
        ImageButton btn6 = (ImageButton) findViewById(com.ginger.talktoyou.R.id.button6);
        ImageButton btn7 = (ImageButton) findViewById(com.ginger.talktoyou.R.id.button7);
        ImageButton btn8 = (ImageButton) findViewById(com.ginger.talktoyou.R.id.button8);
        ImageButton btn9 = (ImageButton) findViewById(com.ginger.talktoyou.R.id.button9);
        ImageButton help = (ImageButton) findViewById(com.ginger.talktoyou.R.id.imageView);
        num1 = (EditText) findViewById(com.ginger.talktoyou.R.id.editText1);
        btn1.setOnClickListener(Number);
        btn2.setOnClickListener(Number);
        btn3.setOnClickListener(Number);
        btn4.setOnClickListener(Number);
        clear.setOnClickListener(Number);
        btn6.setOnClickListener(Number);
        btn7.setOnClickListener(Number);
        btn8.setOnClickListener(Number);
        btn9.setOnClickListener(Number);

        help.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EnglishSentence.this, EShelp.class);
                startActivity(intent);
                //MainActivity.this.finish();
            }
        });
    }

    private Button.OnClickListener Number = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {

            String keyin = num1.getText().toString();

            switch(v.getId()){
                case com.ginger.talktoyou.R.id.button1: {
                    num1.setText(keyin+"5"); //Text上顯示數字
                    i++;
                    judge = 0;
                    text[i] = 5;
                    break;
                }
                case com.ginger.talktoyou.R.id.button2: {
                    num1.setText(keyin+"3");
                    i++;
                    judge = 0;
                    text[i] = 3;
                    break;
                }
                case com.ginger.talktoyou.R.id.button3: {
                    num1.setText(keyin+"7");
                    i++;
                    judge = 0;
                    text[i] = 7;
                    break;
                }
                case com.ginger.talktoyou.R.id.button4: {
                    num1.setText(keyin+"1");
                    i++;
                    judge = 0;
                    text[i] = 1;
                    break;
                }
                case com.ginger.talktoyou.R.id.people: {
                    i = 0;
                    judge = 1;
                    int length = num1.getText().length();
                    if (length > 0) {
                        num1.getText().delete(0, length);
                    }
                    break;
                }
                case com.ginger.talktoyou.R.id.button6: {
                    num1.setText(keyin+"2");
                    i++;
                    judge = 0;
                    text[i] = 2;
                    break;
                }
                case com.ginger.talktoyou.R.id.button7: {
                    num1.setText(keyin+"6");
                    i++;
                    judge = 0;
                    text[i] = 6;
                    break;
                }
                case com.ginger.talktoyou.R.id.button8: {
                    num1.setText(keyin+"4");
                    i++;
                    judge = 0;
                    text[i] = 4;
                    break;
                }
                case com.ginger.talktoyou.R.id.button9: {
                    num1.setText(keyin+"8");
                    i++;
                    judge = 0;
                    text[i] = 8;
                    break;
                }
            }

            if(i % 2 == 0 && judge == 0) {
                if (text[i - 1] == 1 && text[i] == 1) {
                    Toast.makeText(EnglishSentence.this, "Let me think a minute.", Toast.LENGTH_SHORT).show();
                    soundPool11.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 2) {
                    Toast.makeText(EnglishSentence.this, "Please call my mother.", Toast.LENGTH_SHORT).show();
                    soundPool12.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 3) {
                    Toast.makeText(EnglishSentence.this, "Give me a break.", Toast.LENGTH_SHORT).show();
                    soundPool13.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 4) {
                    Toast.makeText(EnglishSentence.this, "I don't feel well.", Toast.LENGTH_SHORT).show();
                    soundPool14.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 5) {
                    Toast.makeText(EnglishSentence.this, "Let me rest a minute.", Toast.LENGTH_SHORT).show();
                    soundPool15.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 6) {
                    Toast.makeText(EnglishSentence.this, "I want to take a drink, my cup is in the back of my chair.", Toast.LENGTH_SHORT).show();
                    soundPool16.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 7) {
                    Toast.makeText(EnglishSentence.this, "I'm sorry.", Toast.LENGTH_SHORT).show();
                    soundPool17.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 8) {
                    Toast.makeText(EnglishSentence.this, "Please help me tie the seat belt.", Toast.LENGTH_SHORT).show();
                    soundPool18.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 1) {
                    Toast.makeText(EnglishSentence.this, "Can we do it this way?", Toast.LENGTH_SHORT).show();
                    soundPool21.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 2) {
                    Toast.makeText(EnglishSentence.this, "See you later.", Toast.LENGTH_SHORT).show();
                    soundPool22.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 3) {
                    Toast.makeText(EnglishSentence.this, "What time is it now?", Toast.LENGTH_SHORT).show();
                    soundPool23.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 4) {
                    Toast.makeText(EnglishSentence.this, "Can we be friend on facebook?", Toast.LENGTH_SHORT).show();
                    soundPool24.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 5) {
                    Toast.makeText(EnglishSentence.this, "I have big fish to fry.", Toast.LENGTH_SHORT).show();
                    soundPool25.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 6) {
                    Toast.makeText(EnglishSentence.this, "Please put my foot on the foot rest.", Toast.LENGTH_SHORT).show();
                    soundPool26.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 7) {
                    Toast.makeText(EnglishSentence.this, "It sounds like fun.", Toast.LENGTH_SHORT).show();
                    soundPool27.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 8) {
                    Toast.makeText(EnglishSentence.this, "Do me a favor.", Toast.LENGTH_SHORT).show();
                    soundPool28.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 1) {
                    Toast.makeText(EnglishSentence.this, "Thank you for encouraging me.", Toast.LENGTH_SHORT).show();
                    soundPool31.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 2) {
                    Toast.makeText(EnglishSentence.this, "What's wrong?", Toast.LENGTH_SHORT).show();
                    soundPool32.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 3) {
                    Toast.makeText(EnglishSentence.this, "I appreciate you.", Toast.LENGTH_SHORT).show();
                    soundPool33.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 4) {
                    Toast.makeText(EnglishSentence.this, "Please introduce yourself, Thank you.", Toast.LENGTH_SHORT).show();
                    soundPool34.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 5) {
                    Toast.makeText(EnglishSentence.this, "Do you have another idea?", Toast.LENGTH_SHORT).show();
                    soundPool35.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 6) {
                    Toast.makeText(EnglishSentence.this, "Please talk slowly.", Toast.LENGTH_SHORT).show();
                    soundPool36.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 7) {
                    Toast.makeText(EnglishSentence.this, "Whatever you decide is fine.", Toast.LENGTH_SHORT).show();
                    soundPool37.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 8) {
                    Toast.makeText(EnglishSentence.this, "It’s a good suggestion.", Toast.LENGTH_SHORT).show();
                    soundPool38.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 4 && text[i] == 1) {
                    Toast.makeText(EnglishSentence.this, "Pardon me!", Toast.LENGTH_SHORT).show();
                    soundPool41.play(1, 1, 1, 0, 0, 1);
                }
            }
        }};
    }
