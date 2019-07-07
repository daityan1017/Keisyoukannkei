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

        AddNumberSub addNumberSub = new AddNumberSub();

        addNumberSub.add(30);
        addNumberSub.recorder();
        addNumberSub.add(100);

        text1.setText("親クラス" + addNumberSub.getNumber());
        text2.setText("サブクラス" + addNumberSub.getRecord());


    }
}
