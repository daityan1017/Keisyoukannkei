package com.example.keisyoukannkei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = findViewById(R.id.text1) , text2 = findViewById(R.id.text2);

        SubtractNumber subtractNumber = new SubtractNumber();

        subtractNumber.add(30);
        subtractNumber.recorder();
        subtractNumber.subtract(20);

        text1.setText("おじいちゃんクラス" + String.valueOf(subtractNumber.getNumber()));
        text2.setText("親クラス" + String.valueOf(subtractNumber.getRecord()));





    }
}
