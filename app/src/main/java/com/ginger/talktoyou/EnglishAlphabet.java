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

public class EnglishAlphabet extends  Activity {
    private EditText num1;
    int[] text;
    private static int i = 0;
    private int judge = 0;
    private int big = 0;
    private SoundPool soundPool11;
    private SoundPool soundPool12;
    private SoundPool soundPool13;
    private SoundPool soundPool14;
    private SoundPool soundPool15;
    private SoundPool soundPool16;
    private SoundPool soundPool17;
    private SoundPool soundPool21;
    private SoundPool soundPool22;
    private SoundPool soundPool23;
    private SoundPool soundPool24;
    private SoundPool soundPool25;
    private SoundPool soundPool26;
    private SoundPool soundPool27;
    private SoundPool soundPool31;
    private SoundPool soundPool32;
    private SoundPool soundPool33;
    private SoundPool soundPool34;
    private SoundPool soundPool35;
    private SoundPool soundPool41;
    private SoundPool soundPool42;
    private SoundPool soundPool43;
    private SoundPool soundPool44;
    private SoundPool soundPool45;
    private SoundPool soundPool46;
    private SoundPool soundPool47;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.ginger.talktoyou.R.layout.english_alphabet);
        text = new int[100];
        soundPool11 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool11.load(this, com.ginger.talktoyou.R.mipmap.ea11, 1);
        soundPool12 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool12.load(this, com.ginger.talktoyou.R.mipmap.ea12, 1);
        soundPool13 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool13.load(this, com.ginger.talktoyou.R.mipmap.ea13, 1);
        soundPool14 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool14.load(this, com.ginger.talktoyou.R.mipmap.ea14, 1);
        soundPool15 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool15.load(this, com.ginger.talktoyou.R.mipmap.ea15, 1);
        soundPool16 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool16.load(this, com.ginger.talktoyou.R.mipmap.ea16, 1);
        soundPool17 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool17.load(this, com.ginger.talktoyou.R.mipmap.ea17, 1);
        soundPool21 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool21.load(this, com.ginger.talktoyou.R.mipmap.ea21, 1);
        soundPool22 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool22.load(this, com.ginger.talktoyou.R.mipmap.ea22, 1);
        soundPool23 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool23.load(this, com.ginger.talktoyou.R.mipmap.ea23, 1);
        soundPool24 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool24.load(this, com.ginger.talktoyou.R.mipmap.ea24, 1);
        soundPool25 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool25.load(this, com.ginger.talktoyou.R.mipmap.ea25, 1);
        soundPool26 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool26.load(this, com.ginger.talktoyou.R.mipmap.ea26, 1);
        soundPool27 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool27.load(this, com.ginger.talktoyou.R.mipmap.ea27, 1);
        soundPool31 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool31.load(this, com.ginger.talktoyou.R.mipmap.ea31, 1);
        soundPool32 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool32.load(this, com.ginger.talktoyou.R.mipmap.ea32, 1);
        soundPool33 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool33.load(this, com.ginger.talktoyou.R.mipmap.ea33, 1);
        soundPool34 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool34.load(this, com.ginger.talktoyou.R.mipmap.ea34, 1);
        soundPool35 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool35.load(this, com.ginger.talktoyou.R.mipmap.ea35, 1);
        soundPool41 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool41.load(this, com.ginger.talktoyou.R.mipmap.ea41, 1);
        soundPool42 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool42.load(this, com.ginger.talktoyou.R.mipmap.ea42, 1);
        soundPool43 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool43.load(this, com.ginger.talktoyou.R.mipmap.ea43, 1);
        soundPool44 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool44.load(this, com.ginger.talktoyou.R.mipmap.ea44, 1);
        soundPool45 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool45.load(this, com.ginger.talktoyou.R.mipmap.ea45, 1);
        soundPool46 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool46.load(this, com.ginger.talktoyou.R.mipmap.ea46, 1);
        soundPool47 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool47.load(this, com.ginger.talktoyou.R.mipmap.ea47, 1);

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
                intent.setClass(EnglishAlphabet.this, EAhelp.class);
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

            if (i % 2 == 0 && judge == 0) {
                if (text[i - 1] == 1 && text[i] == 1) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "A", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "A");
                        soundPool11.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "a", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "a");
                        soundPool11.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 1 && text[i] == 2) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "B", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "B");
                        soundPool12.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "b", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "b");
                        soundPool12.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 1 && text[i] == 3) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "C", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "C");
                        soundPool13.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "c", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "c");
                        soundPool13.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 1 && text[i] == 4) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "D", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "D");
                        soundPool14.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "d", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "d");
                        soundPool14.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 1 && text[i] == 5) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "E", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "E");
                        soundPool15.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "e", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "e");
                        soundPool15.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 1 && text[i] == 6) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "F", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "F");
                        soundPool16.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "f", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "f");
                        soundPool16.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 1 && text[i] == 7) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "G", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "G");
                        soundPool17.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "g", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "g");
                        soundPool17.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 2 && text[i] == 1) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "H", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "H");
                        soundPool21.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "h", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "h");
                        soundPool21.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 2 && text[i] == 2) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "I", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "I");
                        soundPool22.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "i", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "i");
                        soundPool22.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 2 && text[i] == 3) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "J", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "J");
                        soundPool23.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "j", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "j");
                        soundPool23.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 2 && text[i] == 4) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "K", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "K");
                        soundPool24.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "k", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "k");
                        soundPool24.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 2 && text[i] == 5) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "L", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "L");
                        soundPool25.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "l", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "l");
                        soundPool25.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 2 && text[i] == 6) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "M", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "M");
                        soundPool26.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "m", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "m");
                        soundPool26.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 2 && text[i] == 7) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "N", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "N");
                        soundPool27.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "n", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "n");
                        soundPool27.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 3 && text[i] == 1) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "O", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "O");
                        soundPool31.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "o", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "o");
                        soundPool31.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 3 && text[i] == 2) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "P", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "P");
                        soundPool32.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "p", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "p");
                        soundPool32.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 3 && text[i] == 3) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "Q", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "Q");
                        soundPool33.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "q", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "q");
                        soundPool33.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 3 && text[i] == 4) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "R", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "R");
                        soundPool34.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "r", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "r");
                        soundPool34.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 3 && text[i] == 5) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "S", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "S");
                        soundPool35.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "s", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "s");
                        soundPool35.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 3 && text[i] == 6) {
                    Toast.makeText(EnglishAlphabet.this, " ", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + " ");
                } else if (text[i - 1] == 3 && text[i] == 7) {
                    Toast.makeText(EnglishAlphabet.this, "Block letter", Toast.LENGTH_SHORT).show();
                    big = 1;
                } else if (text[i - 1] == 4 && text[i] == 1) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "T", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "T");
                        soundPool41.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "t", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "t");
                        soundPool41.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 4 && text[i] == 2) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "U", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "U");
                        soundPool42.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "u", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "u");
                        soundPool42.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 4 && text[i] == 3) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "V", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "V");
                        soundPool43.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "v", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "v");
                        soundPool43.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 4 && text[i] == 4) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "W", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "W");
                        soundPool44.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "w", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "w");
                        soundPool44.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 4 && text[i] == 5) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "X", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "X");
                        soundPool45.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "x", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "x");
                        soundPool45.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 4 && text[i] == 6) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "Y", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "Y");
                        soundPool46.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "y", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "y");
                        soundPool46.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 4 && text[i] == 7) {
                    if(big == 1) {
                        Toast.makeText(EnglishAlphabet.this, "Z", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "Z");
                        soundPool47.play(1, 1, 1, 0, 0, 1);
                        big = 0;
                    } else {
                        Toast.makeText(EnglishAlphabet.this, "z", Toast.LENGTH_SHORT).show();
                        num1.setText(keyin + "z");
                        soundPool47.play(1, 1, 1, 0, 0, 1);
                    }
                } else if (text[i - 1] == 4 && text[i] == 8) {
                    Toast.makeText(EnglishAlphabet.this, "abbreviation", Toast.LENGTH_SHORT).show();
                } else if (text[i - 1] == 7 && text[i] == 1) {
                    Toast.makeText(EnglishAlphabet.this, ",", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + ",");
                } else if (text[i - 1] == 7 && text[i] == 2) {
                    Toast.makeText(EnglishAlphabet.this, ".", Toast.LENGTH_SHORT).show();
                    num1.setText(keyin + ".");
                } else if (text[i - 1] == 7 && text[i] == 7) {
                    Intent intent = new Intent();
                    intent.setClass(EnglishAlphabet.this, ChineseAlphabet.class);
                    startActivity(intent);
                }
            }
        }
    };
}