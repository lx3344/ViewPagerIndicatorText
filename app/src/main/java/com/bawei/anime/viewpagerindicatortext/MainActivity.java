package com.bawei.anime.viewpagerindicatortext;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.viewpagerindicator.TabPageIndicator;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TabPageIndicator indicator;
    private String[] arr = new String[]{"分类1","分类2","分类3","分类4","分类5","分类6","分类7","分类8","分类9","分类10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.ViewPager);
        indicator = (TabPageIndicator) findViewById(R.id.TabPageIndicator);
        mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        indicator.setViewPager(mViewPager);
    }
    //构建适配器
    class MyAdapter extends FragmentPagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = new MyFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title",arr[position]);
            fragment.setArguments(bundle);
            return fragment;
        }

        @Override
        public int getCount() {
            return arr.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return arr[position];
        }
    }
}
