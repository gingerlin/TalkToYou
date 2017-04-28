package com.ginger.talktoyou;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

public  class  MainActivity  extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.ginger.talktoyou.R.layout.activity_main);
        ImageButton c_alphabet = (ImageButton) findViewById(com.ginger.talktoyou.R.id.chinese_alphabet);
        ImageButton c_sentence = (ImageButton) findViewById(com.ginger.talktoyou.R.id.chinese_sentence);
        ImageButton e_alphabet = (ImageButton) findViewById(com.ginger.talktoyou.R.id.english_alphabet);
        ImageButton e_sentence = (ImageButton) findViewById(com.ginger.talktoyou.R.id.english_sentence);
        ImageButton help = (ImageButton) findViewById(com.ginger.talktoyou.R.id.help);
        c_alphabet.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ChineseAlphabet.class);
                startActivity(intent);
                //MainActivity.this.finish();
            }
        });
        c_sentence.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ChineseSentence.class);
                startActivity(intent);
                //MainActivity.this.finish();
            }
        });
        e_alphabet.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, EnglishAlphabet.class);
                startActivity(intent);
                //MainActivity.this.finish();
            }
        });
        e_sentence.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, EnglishSentence.class);
                startActivity(intent);
                //MainActivity.this.finish();
            }
        });
        help.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, help.class);
                startActivity(intent);
                //MainActivity.this.finish();
            }
        });
    }
}