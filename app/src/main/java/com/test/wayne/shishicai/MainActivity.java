package com.test.wayne.shishicai;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";


    private List<Integer> imagesString=new ArrayList<>();
    private ArrayList<MessageBean> dateList;


    private ImageButton button1_1,button1_2,button1_3,button1_4,button1_5,button1_6,button1_7,button1_8;
    private ImageButton button2_1,button2_2,button2_3,button2_4,button2_5;
    private ImageButton button3_1,button3_2,button3_3,button3_4,button3_5,button3_6,button3_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagesString.add(R.drawable.banner1);
        imagesString.add(R.drawable.banner2);
        Banner banner = findViewById(R.id.banner);
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(imagesString);
        banner.start();

        initView();
    }

    @SuppressLint("WrongViewCast")
    private void initView() {

        button1_1=findViewById(R.id.btn1_part1);
        button1_1.setOnClickListener(this);
        button1_2=findViewById(R.id.btn2_part1);
        button1_2.setOnClickListener(this);
        button1_3=findViewById(R.id.btn3_part1);
        button1_3.setOnClickListener(this);
        button1_4=findViewById(R.id.btn4_part1);
        button1_4.setOnClickListener(this);
        button1_5=findViewById(R.id.btn5_part1);
        button1_5.setOnClickListener(this);
        button1_6=findViewById(R.id.btn6_part1);
        button1_6.setOnClickListener(this);
        button1_7=findViewById(R.id.btn7_part1);
        button1_7.setOnClickListener(this);
        button1_8=findViewById(R.id.btn8_part1);
        button1_8.setOnClickListener(this);

        button2_1=findViewById(R.id.btn1_part2);
        button2_1.setOnClickListener(this);
        button2_2=findViewById(R.id.btn2_part2);
        button2_2.setOnClickListener(this);
        button2_3=findViewById(R.id.btn3_part2);
        button2_3.setOnClickListener(this);
        button2_4=findViewById(R.id.btn4_part2);
        button2_4.setOnClickListener(this);
        button2_5=findViewById(R.id.btn5_part2);
        button2_5.setOnClickListener(this);

        button3_1=findViewById(R.id.btn1_part3);
        button3_1.setOnClickListener(this);
        button3_2=findViewById(R.id.btn2_part3);
        button3_2.setOnClickListener(this);
        button3_3=findViewById(R.id.btn3_part3);
        button3_3.setOnClickListener(this);
        button3_4=findViewById(R.id.btn4_part3);
        button3_4.setOnClickListener(this);
        button3_5=findViewById(R.id.btn5_part3);
        button3_5.setOnClickListener(this);
        button3_6=findViewById(R.id.btn6_part3);
        button3_6.setOnClickListener(this);
        button3_7=findViewById(R.id.btn7_part3);
        button3_7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1_part1:
                startActivity(new Intent(MainActivity.this, OtherMessageActivity.class));

                break;
            case R.id.btn2_part1:
                startActivity(new Intent(MainActivity.this, OtherMessageActivity.class));
                break;
            case R.id.btn3_part1:
                startActivity(new Intent(MainActivity.this, OtherMessageActivity.class));
                break;
            case R.id.btn4_part1:
                startActivity(new Intent(MainActivity.this, OtherMessageActivity.class));
                break;
            case R.id.btn5_part1:
                startActivity(new Intent(MainActivity.this, OtherMessageActivity.class));
                break;
            case R.id.btn6_part1:
                startActivity(new Intent(MainActivity.this, OtherMessageActivity.class));
                break;
            case R.id.btn7_part1:
                startActivity(new Intent(MainActivity.this, OtherMessageActivity.class));
                break;
            case R.id.btn8_part1:
                startActivity(new Intent(MainActivity.this, OtherMessageActivity.class)
                );
                break;


            case R.id.btn1_part2:
                startActivity(new Intent(MainActivity.this, QueryActivity.class));
                break;
            case R.id.btn2_part2:
                startActivity(new Intent(MainActivity.this, QueryActivity.class));
                break;
            case R.id.btn3_part2:
                startActivity(new Intent(MainActivity.this, QueryActivity.class));
                break;
            case R.id.btn4_part2:
                startActivity(new Intent(MainActivity.this, QueryActivity.class));
                break;
            case R.id.btn5_part2:
                startActivity(new Intent(MainActivity.this, QueryActivity.class));
                break;

            case R.id.btn1_part3:
                startActivity(new Intent(MainActivity.this, BaseIntroductionActivity.class)
                        .putExtra("context",getString(R.string.test4))
                        .putExtra("title","2018.4.3 今日头条"));
                break;
            case R.id.btn2_part3:
                startActivity(new Intent(MainActivity.this, BaseIntroductionActivity.class)
                        .putExtra("context",getString(R.string.test5))
                        .putExtra("title","2018.4.2 今日头条"));
                break;
            case R.id.btn3_part3:
                startActivity(new Intent(MainActivity.this, BaseIntroductionActivity.class)
                        .putExtra("context",getString(R.string.test5))
                        .putExtra("title","2018.4.1 今日头条"));
                break;
            case R.id.btn4_part3:
                startActivity(new Intent(MainActivity.this, BaseIntroductionActivity.class)
                        .putExtra("context",getString(R.string.test4))
                        .putExtra("title","2018.3.31 今日头条"));
                break;
            case R.id.btn5_part3:
                startActivity(new Intent(MainActivity.this, BaseIntroductionActivity.class)
                        .putExtra("context",getString(R.string.test5))
                        .putExtra("title","2018.3.30 今日头条"));
                break;
            case R.id.btn6_part3:
                startActivity(new Intent(MainActivity.this, BaseIntroductionActivity.class)
                        .putExtra("context",getString(R.string.test4))
                        .putExtra("title","2018.3.29 今日头条"));
                break;
            case R.id.btn7_part3:
                startActivity(new Intent(MainActivity.this, BaseIntroductionActivity.class)
                        .putExtra("context",getString(R.string.test5))
                        .putExtra("title","2018.3.28 今日头条"));
                break;
        }
    }


}
