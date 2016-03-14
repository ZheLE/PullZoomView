package com.lzy.pullzoomview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("PullScrollViewActivity");
        strings.add("PullListViewActivity");
        strings.add("PullGridViewActivity");
        strings.add("PullWebViewActivity");
        strings.add("PullRecyclerViewActivity");
        strings.add("TestActivity");

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strings));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, PullScrollViewActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, PullListViewActivity.class));
                break;
            case 2:
                startActivity(new Intent(this, PullGridViewActivity.class));
                break;
            case 3:
                startActivity(new Intent(this, PullWebViewActivity.class));
                break;
            case 4:
                startActivity(new Intent(this, PullRecyclerViewActivity.class));
                break;
            case 5:
                startActivity(new Intent(this, TestActivity.class));
                break;
        }
    }
}
