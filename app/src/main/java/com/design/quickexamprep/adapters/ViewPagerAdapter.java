package com.design.quickexamprep.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.design.quickexamprep.SplashPager1;
import com.design.quickexamprep.SplashPager2;
import com.design.quickexamprep.SplashPager3;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0)
            return new SplashPager1();
        else if (position == 1)
            return new SplashPager2();
        else return new SplashPager3();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
