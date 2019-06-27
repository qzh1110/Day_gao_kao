package com.example.day_gao_kao;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.day_gao_kao.adpter.Fragment_adpter;
import com.example.day_gao_kao.fragment.Afragment;
import com.example.day_gao_kao.fragment.Bfragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewpage;
    private TabLayout mTab;
    private ArrayList<String> stringArrayList;
    private ArrayList<Fragment> fragmentArrayList;
    private Fragment_adpter adpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mViewpage = (ViewPager) findViewById(R.id.viewpage);
        mTab = (TabLayout) findViewById(R.id.tab);

        stringArrayList = new ArrayList<>();
        fragmentArrayList = new ArrayList<>();


        stringArrayList.add("图册");
        stringArrayList.add("收藏");

        fragmentArrayList.add(new Afragment());
        fragmentArrayList.add(new Bfragment());

        adpter = new Fragment_adpter(getSupportFragmentManager(), stringArrayList, fragmentArrayList);

        mViewpage.setAdapter(adpter);
        mTab.setupWithViewPager(mViewpage);

    }
}
