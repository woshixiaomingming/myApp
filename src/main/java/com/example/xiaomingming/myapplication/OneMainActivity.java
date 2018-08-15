package com.example.xiaomingming.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class OneMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Spinner spinner = (Spinner) findViewById(R.id.mySpinner);
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("上海");
        list.add("南京");
        list.add("重庆");
        list.add("长沙");
        list.add("广州");
        list.add("深圳");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        //安卓本身的样式
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //放入适配器
        spinner.setAdapter(arrayAdapter);
    }

    public void getUserinfo (View view) {

    }
}
