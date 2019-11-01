package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;

public class countBMI extends AppCompatActivity {
    TextView BMIcount,level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_bmi);
        BMIcount =(TextView)findViewById(R.id.textView_BMI);
        level =(TextView)findViewById(R.id.textView_Level);
        Bundle bundle = getIntent().getExtras();
        String height = bundle.getString("height" );
        String weight = bundle.getString("width");

        float height_math = Float.parseFloat(height);
        float weight_math = Float.parseFloat(weight);
        float fresult;
        BMIcount  = (TextView)findViewById(R.id.textView_BMI);
        height_math = height_math/100;
        height_math = height_math*height_math;
        fresult = weight_math/height_math;
        BMIcount.setText(String.format("%.2f",fresult));
        if (fresult<18.5)
           level.setText("體重過輕");
        else if (18.5 <= fresult && fresult< 24)
            level.setText("正常範圍");
        else if (24 <=fresult && fresult < 27)
            level.setText("過    重");
        else if (27 <=fresult && fresult < 30)
            level.setText("輕度肥胖");
        else if (30 <= fresult && fresult < 35)
            level.setText("中度肥胖");
        else if (fresult >= 35)
            level.setText("重度肥胖        ");
    }
}
