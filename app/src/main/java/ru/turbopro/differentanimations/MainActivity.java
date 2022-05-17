package ru.turbopro.differentanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, c11 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);
        btn8 = (Button)findViewById(R.id.button8);
        btn9 = (Button)findViewById(R.id.button9);
        btn10 = (Button)findViewById(R.id.button10);
        btn11 = (Button)findViewById(R.id.button11);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1++;
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.blink_anim);
                if (c1%2 == 1) btn1.startAnimation(animation);
                else btn1.clearAnimation();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.bounce);
                btn2.startAnimation(animation);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.fadein);
                btn3.startAnimation(animation);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4++;
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.fadeout);
                if (c4%2 == 1) btn4.startAnimation(animation);
                else btn4.clearAnimation();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.lefttoright);
                btn5.startAnimation(animation);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c6++;
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.mixed_anim);
                if (c6%2 == 1) btn6.startAnimation(animation);
                else btn6.clearAnimation();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.righttoleft);
                btn7.startAnimation(animation);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c8++;
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.rotate);
                if (c8%2 == 1) btn8.startAnimation(animation);
                else btn8.clearAnimation();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.sample_anim);
                btn9.startAnimation(animation);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn10.clearAnimation();
            }
        });
        btn10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.zoomin);
                btn10.startAnimation(animation);
                return true;
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn11.clearAnimation();
            }
        });
        btn11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,  R.anim.zoomout);
                btn11.startAnimation(animation);
                return true;
            }
        });
    }
}