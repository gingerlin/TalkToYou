package com.ginger.talktoyou;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;
import android.media.SoundPool;
import android.media.AudioManager;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
public  class  ChineseSentence  extends  Activity {

    private EditText num1;
    int [] text;
    private static int i = 0;
    private static int judge = 0;
    private SoundPool soundPool11;
    private SoundPool soundPool21;
    private SoundPool soundPool31;
    private SoundPool soundPool41;
    private SoundPool soundPool51;
    private SoundPool soundPool61;
    private SoundPool soundPool71;
    private SoundPool soundPool81;

    private SoundPool soundPool12;
    private SoundPool soundPool22;
    private SoundPool soundPool32;
    private SoundPool soundPool42;
    private SoundPool soundPool52;
    private SoundPool soundPool62;
    private SoundPool soundPool72;
    private SoundPool soundPool82;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.ginger.talktoyou.R.layout.chinese_sentence);
        text = new int[100];
        soundPool51 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool51.load(this, com.ginger.talktoyou.R.mipmap.cs51, 1);
        soundPool31 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool31.load(this, com.ginger.talktoyou.R.mipmap.cs31, 1);
        soundPool71 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool71.load(this, com.ginger.talktoyou.R.mipmap.cs71, 1);
        soundPool11 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool11.load(this, com.ginger.talktoyou.R.mipmap.cs11, 1);
        soundPool21 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool21.load(this, com.ginger.talktoyou.R.mipmap.cs21, 1);
        soundPool61 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool61.load(this, com.ginger.talktoyou.R.mipmap.cs61, 1);
        soundPool41 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool41.load(this, com.ginger.talktoyou.R.mipmap.cs41, 1);
        soundPool81 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool81.load(this, com.ginger.talktoyou.R.mipmap.cs81, 1);
        soundPool52 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool52.load(this, com.ginger.talktoyou.R.mipmap.cs52, 1);
        soundPool32 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool32.load(this, com.ginger.talktoyou.R.mipmap.cs32, 1);
        soundPool72 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool72.load(this, com.ginger.talktoyou.R.mipmap.cs72, 1);
        soundPool12 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool12.load(this, com.ginger.talktoyou.R.mipmap.cs12, 1);
        soundPool22 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool22.load(this, com.ginger.talktoyou.R.mipmap.cs22, 1);
        soundPool62 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool62.load(this, com.ginger.talktoyou.R.mipmap.cs62, 1);
        soundPool42 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool42.load(this, com.ginger.talktoyou.R.mipmap.cs42, 1);
        soundPool82 = new SoundPool(1, AudioManager.STREAM_MUSIC, 5);
        soundPool82.load(this, com.ginger.talktoyou.R.mipmap.cs82, 1);

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
                intent.setClass(ChineseSentence.this, CShelp.class);
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
/*            JSONObject obj = new JSONObject();
            HashMap    list = new HashMap();
            JSONArray  listArray = new JSONArray();
            JSONArray  sound = new JSONArray();

            list.put("key", 51);
            list.put("sentence", "請幫我把腳移到踏板上");
            list.put("sound", soundPool51);
            listArray.put(list);
            obj.put("messages", listArray);

            obj   = new JSONObject(json);
            JSONArray  root  = obj.getJSONArray("messages");

            obj = (JSONObject) root.get(0);

            Toast.makeText(ChineseSentence.this, obj.get("sentence"), Toast.LENGTH_SHORT).show();
            obj.get("sound").play(1, 1, 1, 0, 0, 1);

*/

            if(i % 2 == 0 && judge == 0) {
                if (text[i - 1] == 5 && text[i] == 1) {
                    Toast.makeText(ChineseSentence.this, "請幫我把腳移到踏板上", Toast.LENGTH_SHORT).show();
                    soundPool51.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 1) {
                    Toast.makeText(ChineseSentence.this, "請幫我繫安全帶", Toast.LENGTH_SHORT).show();
                    soundPool31.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 7 && text[i] == 1) {
                    Toast.makeText(ChineseSentence.this, "請你自我介紹 謝謝", Toast.LENGTH_SHORT).show();
                    soundPool71.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 1) {
                    Toast.makeText(ChineseSentence.this, "讓我想一想", Toast.LENGTH_SHORT).show();
                    soundPool11.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 1) {
                    Toast.makeText(ChineseSentence.this, "讓我休息一下", Toast.LENGTH_SHORT).show();
                    soundPool21.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 6 && text[i] == 1) {
                    Toast.makeText(ChineseSentence.this, "謝謝你的鼓勵", Toast.LENGTH_SHORT).show();
                    soundPool61.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 4 && text[i] == 1) {
                    Toast.makeText(ChineseSentence.this, "現在幾點?", Toast.LENGTH_SHORT).show();
                    soundPool41.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 8 && text[i] == 1) {
                    Toast.makeText(ChineseSentence.this, "你決定就好", Toast.LENGTH_SHORT).show();
                    soundPool81.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 5 && text[i] == 2) {
                    Toast.makeText(ChineseSentence.this, "請幫我把腳移開腳踏板", Toast.LENGTH_SHORT).show();
                    soundPool52.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 3 && text[i] == 2) {
                    Toast.makeText(ChineseSentence.this, "可以這樣做嗎?", Toast.LENGTH_SHORT).show();
                    soundPool32.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 7 && text[i] == 2) {
                    Toast.makeText(ChineseSentence.this, "你有別的想法嗎?", Toast.LENGTH_SHORT).show();
                    soundPool72.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 1 && text[i] == 2) {
                    Toast.makeText(ChineseSentence.this, "請幫我叫媽媽", Toast.LENGTH_SHORT).show();
                    soundPool12.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 2 && text[i] == 2) {
                    Toast.makeText(ChineseSentence.this, "我想喝水，杯子在輪椅後面", Toast.LENGTH_SHORT).show();
                    soundPool22.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 6 && text[i] == 2) {
                    Toast.makeText(ChineseSentence.this, "很開心跟你聊天", Toast.LENGTH_SHORT).show();
                    soundPool62.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 4 && text[i] == 2) {
                    Toast.makeText(ChineseSentence.this, "我可以加你的Facebook嗎?", Toast.LENGTH_SHORT).show();
                    soundPool42.play(1, 1, 1, 0, 0, 1);
                } else if (text[i - 1] == 8 && text[i] == 2) {
                    Toast.makeText(ChineseSentence.this, "這個主意不錯", Toast.LENGTH_SHORT).show();
                    soundPool82.play(1, 1, 1, 0, 0, 1);
                }
            }
        }};
    }