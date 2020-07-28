package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.Fragment.DailyFragment;
import com.example.myapplication.Fragment.HourlyFragment;
import com.example.myapplication.Fragment.WeeklyFragment;

public class MyAdapter extends FragmentStatePagerAdapter {

    private int pageCounter;

    public MyAdapter(@NonNull FragmentManager fm, int pageCounter) {
        super(fm);
        this.pageCounter = pageCounter;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HourlyFragment hourlyFragment = new HourlyFragment();
                return hourlyFragment;
            case 1:
                DailyFragment dailyFragment = new DailyFragment();
                return dailyFragment;
            case 2:
                WeeklyFragment weeklyFragment = new WeeklyFragment();
                return weeklyFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return pageCounter;
    }
}
