package com.example.css111600.atylesandthemes;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview = (TextView) findViewById(R.id.textView6);
        LinearGradient lineargradient = new LinearGradient(0,0,0, textview.getTextSize(), Color.RED,Color.GREEN, Shader.TileMode.MIRROR);
        textview.getPaint().setShader(lineargradient);
    }


    public void moveToSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this  ,SecondActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
            startActivity(intent, options.toBundle());
        }else{
            startActivity(intent);
        }
    }
}
