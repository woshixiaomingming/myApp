package com.example.xiaomingming.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.xiaomingming.adapter.HorizonListviewAdapter;
import com.example.xiaomingming.model.Goods;
import com.example.xiaomingming.viewer.HorizontalListView;
import com.example.xiaomingming.viewer.MyListview;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private HorizontalListView mListView;
    private String[] str = { "小明" ,"小红","小新","小红","小新"};
    private HorizonListviewAdapter mAdapter;
    private List<Goods> data;
    private Goods goods;
    private MyListview mListView2;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        //initView();
        initView2();
    }

    private void initView2() {

        mListView2 = (MyListview) findViewById(R.id.mylist);
        data = new ArrayList<Goods>();
        goods = new Goods("5月22日   星期一", "魅族mx4", "￥1200", R.drawable.phone);
        data.add(goods);
        goods = new Goods("5月22日   星期一", "魅族mx4", "￥1200", R.drawable.phone);
        data.add(goods);
        goods = new Goods("5月22日   星期一", "魅族mx4", "￥1200", R.drawable.phone);
        data.add(goods);
        goods = new Goods("5月22日   星期一", "魅族mx4", "￥1200", R.drawable.phone);
        data.add(goods);
        goods = new Goods("5月22日   星期一", "魅族mx4", "￥1200", R.drawable.phone);
        data.add(goods);
        mAdapter = new HorizonListviewAdapter(this, data);
        adapter = new MyAdapter(str,mAdapter);
        mListView2.setAdapter(adapter);


    }

    private void initView() {
        //	mListView = (HorizontalVariableListView) findViewById(R.id.mylist);
        data = new ArrayList<Goods>();
        goods = new Goods("2015-09-29-星期一", "手机", "1000", R.drawable.ic_launcher);
        data.add(goods);
        goods = new Goods("2015-09-29-星期一", "手机", "1000", R.drawable.ic_launcher);
        data.add(goods);
        goods = new Goods("2015-09-29-星期一", "手机", "1000", R.drawable.ic_launcher);
        data.add(goods);
        mAdapter = new HorizonListviewAdapter(this, data);
        mListView.setAdapter(mAdapter);

    }

    public class MyAdapter extends BaseAdapter{

        private LayoutInflater inflater = null;
        private String [] data;
        private HorizonListviewAdapter adapter;
        public MyAdapter(String [] data,HorizonListviewAdapter adapter) {
            this.adapter =adapter;
            this.data = data;
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return data.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return data[position];
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //解析xml的文件
            inflater = LayoutInflater.from(getApplicationContext());
            convertView = inflater.inflate(R.layout.item_goods, null);
            TextView name = (TextView) convertView.findViewById(R.id.tv_name);
            name.setText(data[position]);
            HorizontalListView mListView = (HorizontalListView) convertView.findViewById(R.id.horizontal_listview);
            mListView.setAdapter(adapter);
            return convertView;
        }

    }
}
