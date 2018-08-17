package com.example.xiaomingming.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.example.xiaomingming.viewer.HorizontalListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OneMainActivity extends AppCompatActivity {
;


    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        //使用spinner
        /*Spinner spinner = (Spinner) findViewById(R.id.mySpinner);
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("上海");
        list.add("南京");
        list.add("重庆");
        list.add("长沙");
        list.add("广州");
        list.add("深圳");
        list.add("深圳1");
        list.add("深圳2");
        list.add("深圳3");
        list.add("深圳4");
        list.add("深圳5");
        list.add("深圳6");
        list.add("深圳7");
        list.add("深圳8");
        list.add("深圳9");
        list.add("深圳10");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        //安卓本身的样式
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //放入适配器
        spinner.setAdapter(arrayAdapter);*/
        //使用listview
        ListView listView = (ListView)findViewById(R.id.list_view);
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("username", "xmm");
        //map.put("password", "123123");
        list.add(map);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("username", "xmm1");
        map1.put("password", "123123");
        list.add(map1);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("username", "xmm2");
        map2.put("password", "123123");
        list.add(map2);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("username", "xmm3");
        map3.put("password", "123123");
        list.add(map3);
        Map<String, Object> map4 = new HashMap<>();
        map4.put("username", "xmm4");
        map4.put("password", "123123");
        list.add(map4);
        Map<String, Object> map5 = new HashMap<>();
        map5.put("username", "xmm5");
        map5.put("password", "123123");
        list.add(map5);
        System.out.println(list.toString());
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list, R.layout.listview_items,
                new String[]{"username", "password"}, new int[]{R.id.items_textView1, R.id.items_textView2});
        listView.setAdapter(simpleAdapter);
    }

    public void getUserinfo (View view) {

    }


}
