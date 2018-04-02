package com.test.wayne.shishicai;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by paocai on 2018/3/31.
 */

public class OtherMessageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdapter myAdapter;
    public ArrayList<MessageBean> dateList;
    private String title, context;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_base);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        recyclerView = findViewById(R.id.recyclerView);


        dateList = new ArrayList<>();
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);

        dateList.add(new MessageBean(getString(R.string.title1), getString(R.string.test5)));
        dateList.add(new MessageBean(getString(R.string.title2), getString(R.string.test4)));
        dateList.add(new MessageBean(getString(R.string.title1), getString(R.string.test5)));

        dateList.add(new MessageBean(getString(R.string.title1), getString(R.string.test5)));

        dateList.add(new MessageBean(getString(R.string.title2), getString(R.string.test4)));

        dateList.add(new MessageBean(getString(R.string.title1), getString(R.string.test5)));
        dateList.add(new MessageBean(getString(R.string.title1), getString(R.string.test4)));


        myAdapter = new MyAdapter(dateList);
        recyclerView.setAdapter(myAdapter);
        //添加Android自带的分割线
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        myAdapter.setItemClickListener(new MyAdapter.MyItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                startActivity(new Intent(OtherMessageActivity.this, BaseIntroductionActivity.class)
                        .putExtra("context", getString(R.string.test5))
                        .putExtra("title", "今日大奖" + position));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish(); // back button
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
