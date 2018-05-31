package com.backrt.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.backrt.mvp.demo.DemoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        View v = this.findViewById(R.id.demo01);
        v.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.demo01:
                Intent intent = new Intent();
                intent.setClass(this, DemoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
