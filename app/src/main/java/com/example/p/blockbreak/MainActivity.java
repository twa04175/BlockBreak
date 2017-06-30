package com.example.p.blockbreak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout root = new RelativeLayout(this);
        root.setLayoutParams(new RelativeLayout.LayoutParams(100,100));

        Button btn = new Button(this);
        btn.setLayoutParams(new RelativeLayout.LayoutParams(20,20));

        root.addView(btn);

        setContentView(root);
    }
}

