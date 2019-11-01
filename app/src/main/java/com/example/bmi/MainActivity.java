package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        EditText height,weight;
        Button submit;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            height = (EditText)findViewById(R.id.editText_Height);                            // 取得身高物件
            weight = (EditText)findViewById(R.id.editText_Weight);                           // 取得體重物件
            Button submit = (Button)findViewById(R.id.button_math); // 取得按鈕物件


            // 按下按鈕 觸發事件
            submit.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View arg0) {

                    if ( !("".equals(height.getText().toString())
                            || "".equals(weight.getText().toString())) )
                    {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,countBMI.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("height",height.getText().toString());
                        bundle.putString("width",weight.getText().toString());
                        intent.putExtras(bundle);

                        startActivity(intent);
                    }
                }
            });

        }
    }
