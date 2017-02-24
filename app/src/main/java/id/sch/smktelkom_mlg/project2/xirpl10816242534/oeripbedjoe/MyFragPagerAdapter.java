package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by user on 18/11/2016.
 */

public class MyFragPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> pages = new ArrayList<>();

    //constructor
    public MyFragPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //mendapatkan item
    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }

    //mengatur berapa banyak item yang akan ditampilkan
    @Override
    public int getCount() {
        return pages.size();
    }

    //menambahkan page baru
    public void addPage(Fragment f) {
        pages.add(f);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //return pages.get(position).toString();
        return null;
    }
}
