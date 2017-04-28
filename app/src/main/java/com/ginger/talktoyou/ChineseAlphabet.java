package com.ginger.talktoyou;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;

public class ChineseAlphabet extends  Activity {
    private EditText num1;
    int[] text;
    private static int i = 0;
    private int judge = 0;
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
    private SoundPool soundPool31;
    private SoundPool soundPool32;
    private SoundPool soundPool33;
    private SoundPool soundPool34;
    private SoundPool soundPool35;
    private SoundPool soundPool36;
    private SoundPool soundPool37;
    private SoundPool soundPool41;
    private SoundPool soundPool42;
    private SoundPool soundPool43;
    private SoundPool soundPool51;
    private SoundPool soundPool52;
    private SoundPool soundPool53;
    private SoundPool soundPool54;
    private SoundPool soundPool55;
    private SoundPool soundPool56;
    private SoundPool soundPool57;
    private SoundPool soundPool58;
    private SoundPool soundPool61;
    private SoundPool soundPool62;
    private SoundPool soundPool63;
    private SoundPool soundPool64;
    private SoundPool soundPool65;
    private SoundPool soundPool71;
    private SoundPool soundPool72;
    private SoundPool soundPool73;
    private SoundPool soundPool74;
    private SoundPool soundPool75;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.ginger.talktoyou.R.layout.chinese_alphabet);

        text = new int[100];
        soundPool11 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool11.load(this, com.ginger.talktoyou.R.mipmap.ca11, 1);
        soundPool12 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool12.load(this, com.ginger.talktoyou.R.mipmap.ca12, 1);
        soundPool13 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool13.load(this, com.ginger.talktoyou.R.mipmap.ca13, 1);
        soundPool14 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool14.load(this, com.ginger.talktoyou.R.mipmap.ca14, 1);
        soundPool15 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool15.load(this, com.ginger.talktoyou.R.mipmap.ca15, 1);
        soundPool16 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool16.load(this, com.ginger.talktoyou.R.mipmap.ca16, 1);
        soundPool17 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool17.load(this, com.ginger.talktoyou.R.mipmap.ca17, 1);
        soundPool18 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool18.load(this, com.ginger.talktoyou.R.mipmap.ca18, 1);
        soundPool21 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool21.load(this, com.ginger.talktoyou.R.mipmap.ca21, 1);
        soundPool22 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool22.load(this, com.ginger.talktoyou.R.mipmap.ca22, 1);
        soundPool23 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool23.load(this, com.ginger.talktoyou.R.mipmap.ca23, 1);
        soundPool24 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool24.load(this, com.ginger.talktoyou.R.mipmap.ca24, 1);
        soundPool25 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool25.load(this, com.ginger.talktoyou.R.mipmap.ca25, 1);
        soundPool26 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool26.load(this, com.ginger.talktoyou.R.mipmap.ca26, 1);
        soundPool31 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool31.load(this, com.ginger.talktoyou.R.mipmap.ca31, 1);
        soundPool32 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool32.load(this, com.ginger.talktoyou.R.mipmap.ca32, 1);
        soundPool33 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool33.load(this, com.ginger.talktoyou.R.mipmap.ca33, 1);
        soundPool34 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool34.load(this, com.ginger.talktoyou.R.mipmap.ca34, 1);
        soundPool35 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool35.load(this, com.ginger.talktoyou.R.mipmap.ca35, 1);
        soundPool36 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool36.load(this, com.ginger.talktoyou.R.mipmap.ca36, 1);
        soundPool37 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool37.load(this, com.ginger.talktoyou.R.mipmap.ca37, 1);
        soundPool41 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool41.load(this, com.ginger.talktoyou.R.mipmap.ca41, 1);
        soundPool42 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool42.load(this, com.ginger.talktoyou.R.mipmap.ca42, 1);
        soundPool43 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool43.load(this, com.ginger.talktoyou.R.mipmap.ca43, 1);
        soundPool51 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool51.load(this, com.ginger.talktoyou.R.mipmap.ca51, 1);
        soundPool52 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool52.load(this, com.ginger.talktoyou.R.mipmap.ca52, 1);
        soundPool53 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool53.load(this, com.ginger.talktoyou.R.mipmap.ca53, 1);
        soundPool54 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool54.load(this, com.ginger.talktoyou.R.mipmap.ca54, 1);
        soundPool55 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool55.load(this, com.ginger.talktoyou.R.mipmap.ca55, 1);
        soundPool56 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool56.load(this, com.ginger.talktoyou.R.mipmap.ca56, 1);
        soundPool57 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool57.load(this, com.ginger.talktoyou.R.mipmap.ca57, 1);
        soundPool58 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool58.load(this, com.ginger.talktoyou.R.mipmap.ca58, 1);
        soundPool61 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool61.load(this, com.ginger.talktoyou.R.mipmap.ca61, 1);
        soundPool62 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool62.load(this, com.ginger.talktoyou.R.mipmap.ca62, 1);
        soundPool63 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool63.load(this, com.ginger.talktoyou.R.mipmap.ca63, 1);
        soundPool64 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool64.load(this, com.ginger.talktoyou.R.mipmap.ca64, 1);
        soundPool65 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool65.load(this, com.ginger.talktoyou.R.mipmap.ca65, 1);
        soundPool71 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool71.load(this, com.ginger.talktoyou.R.mipmap.ca71, 1);
        soundPool72 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool72.load(this, com.ginger.talktoyou.R.mipmap.ca72, 1);
        soundPool73 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool73.load(this, com.ginger.talktoyou.R.mipmap.ca73, 1);
        soundPool74 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool74.load(this, com.ginger.talktoyou.R.mipmap.ca74, 1);
        soundPool75 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool75.load(this, com.ginger.talktoyou.R.mipmap.ca75, 1);

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
                intent.setClass(ChineseAlphabet.this, CAhelp.class);
                startActivity(intent);
                //MainActivity.this.finish();
            }
        });
    }

    private Button.OnClickListener Number = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {

            String keyin = num1.getText().toString();

            final EditText input = (EditText) findViewById(com.ginger.talktoyou.R.id.editText1);

            switch (v.getId()) {
                case com.ginger.talktoyou.R.id.button1: {
                    i++;
                    judge = 0;
                    text[i] = 5;
                    break;
                }
                case com.ginger.talktoyou.R.id.button2: {
                    i++;
                    judge = 0;
                    text[i] = 3;
                    break;
                }
                case com.ginger.talktoyou.R.id.button3: {
                    i++;
                    judge = 0;
                    text[i] = 7;
                    break;
                }
                case com.ginger.talktoyou.R.id.button4: {
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
                    i++;
                    judge = 0;
                    text[i] = 2;
                    break;
                }
                case com.ginger.talktoyou.R.id.button7: {
                    i++;
                    judge = 0;
                    text[i] = 6;
                    break;
                }
                case com.ginger.talktoyou.R.id.button8: {
                    i++;
                    judge = 0;
                    text[i] = 4;
                    break;
                }
                case com.ginger.talktoyou.R.id.button9: {
                    i++;
                    judge = 0;
                    text[i] = 8;
                    break;
                }
            }

            if(i % 2 == 0 && judge == 0) {
                if (text[i - 1] == 1 && text[i] == 1) {
                    Toast.makeText(ChineseAlphabet.this, "ㄅ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄅ");
                    soundPool11.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 2) {
                    Toast.makeText(ChineseAlphabet.this, "ㄆ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄆ");
                    soundPool12.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 3) {
                    Toast.makeText(ChineseAlphabet.this, "ㄇ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄇ");
                    soundPool13.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 4) {
                    Toast.makeText(ChineseAlphabet.this, "ㄈ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄈ");
                    soundPool14.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 5) {
                    Toast.makeText(ChineseAlphabet.this, "ㄉ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄉ");
                    soundPool15.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 6) {
                    Toast.makeText(ChineseAlphabet.this, "ㄊ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄊ");
                    soundPool16.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 7) {
                    Toast.makeText(ChineseAlphabet.this, "ㄋ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄋ");
                    soundPool17.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 8) {
                    Toast.makeText(ChineseAlphabet.this, "ㄌ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄌ");
                    soundPool18.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 1) {
                    Toast.makeText(ChineseAlphabet.this, "ㄍ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄍ");
                    soundPool21.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 2) {
                    Toast.makeText(ChineseAlphabet.this, "ㄎ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄎ");
                    soundPool22.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 3) {
                    Toast.makeText(ChineseAlphabet.this, "ㄏ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄏ");
                    soundPool23.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 4) {
                    Toast.makeText(ChineseAlphabet.this, "ㄐ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄐ");
                    soundPool24.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 5) {
                    Toast.makeText(ChineseAlphabet.this, "ㄑ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄑ");
                    soundPool25.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 6) {
                    Toast.makeText(ChineseAlphabet.this, "ㄒ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄒ");
                    soundPool26.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 1) {
                    Toast.makeText(ChineseAlphabet.this, "ㄓ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄓ");
                    soundPool31.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 2) {
                    Toast.makeText(ChineseAlphabet.this, "ㄔ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄔ");
                    soundPool32.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 3) {
                    Toast.makeText(ChineseAlphabet.this, "ㄕ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄕ");
                    soundPool33.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 4) {
                    Toast.makeText(ChineseAlphabet.this, "ㄖ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄖ");
                    soundPool34.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 5) {
                    Toast.makeText(ChineseAlphabet.this, "ㄗ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄗ");
                    soundPool35.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 6) {
                    Toast.makeText(ChineseAlphabet.this, "ㄘ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄘ");
                    soundPool36.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 7) {
                    Toast.makeText(ChineseAlphabet.this, "ㄙ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄙ");
                    soundPool37.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 4 && text[i] == 1) {
                    Toast.makeText(ChineseAlphabet.this, "ㄧ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄧ");
                    soundPool41.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 4 && text[i] == 2) {
                    Toast.makeText(ChineseAlphabet.this, "ㄨ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄨ");
                    soundPool42.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 4 && text[i] == 3) {
                    Toast.makeText(ChineseAlphabet.this, "ㄩ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄩ");
                    soundPool43.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 1) {
                    Toast.makeText(ChineseAlphabet.this, "ㄚ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄚ");
                    soundPool51.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 2) {
                    Toast.makeText(ChineseAlphabet.this, "ㄛ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄛ");
                    soundPool52.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 3) {
                    Toast.makeText(ChineseAlphabet.this, "ㄜ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄜ");
                    soundPool53.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 4) {
                    Toast.makeText(ChineseAlphabet.this, "ㄝ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄝ");
                    soundPool54.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 5) {
                    Toast.makeText(ChineseAlphabet.this, "ㄞ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄞ");
                    soundPool55.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 6) {
                    Toast.makeText(ChineseAlphabet.this, "ㄟ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄟ");
                    soundPool56.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 7) {
                    Toast.makeText(ChineseAlphabet.this, "ㄠ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄠ");
                    soundPool57.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 8) {
                    Toast.makeText(ChineseAlphabet.this, "ㄡ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄡ");
                    soundPool58.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 6 && text[i] == 1) {
                    Toast.makeText(ChineseAlphabet.this, "ㄢ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄢ");
                    soundPool61.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 6 && text[i] == 2) {
                    Toast.makeText(ChineseAlphabet.this, "ㄣ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄣ");
                    soundPool62.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 6 && text[i] == 3) {
                    Toast.makeText(ChineseAlphabet.this, "ㄤ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄤ");
                    soundPool63.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 6 && text[i] == 4) {
                    Toast.makeText(ChineseAlphabet.this, "ㄥ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄥ");
                    soundPool64.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 6 && text[i] == 5) {
                    Toast.makeText(ChineseAlphabet.this, "ㄦ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ㄦ");
                    soundPool65.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 7 && text[i] == 1) {
                    Toast.makeText(ChineseAlphabet.this, "-", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "-");
                    soundPool71.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 7 && text[i] == 2) {
                    Toast.makeText(ChineseAlphabet.this, "ˊ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ˊ");
                    soundPool72.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 7 && text[i] == 3) {
                    Toast.makeText(ChineseAlphabet.this, "ˇ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ˇ");
                    soundPool73.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 7 && text[i] == 4) {
                    Toast.makeText(ChineseAlphabet.this, "ˋ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "ˋ");
                    soundPool74.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 7 && text[i] == 5) {
                    Toast.makeText(ChineseAlphabet.this, "˙", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + "˙");
                    soundPool75.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 7 && text[i] == 7) {
                    Intent intent = new Intent();
                    intent.setClass(ChineseAlphabet.this, EnglishAlphabet.class);
                    startActivity(intent);
                }
            }
        }
    };
}