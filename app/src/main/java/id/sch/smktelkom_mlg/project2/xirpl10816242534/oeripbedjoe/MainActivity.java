package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment1;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment2;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment4;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment1;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment2;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment4;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

public class MainActivity extends AppCompatActivity implements AdapterFragment2.IDataAdapter, AdapterFragment1.IDataAdapter, AdapterFragment3.IDataAdapter, AdapterFragment4.IDataAdapter {

    public static final String LINK_1 = "link1";
    public static final String LINK_2 = "link2";
    public static final String LINK_3 = "link3";
    public static final String LINK_4 = "link4";
    public static final String ID = "id";

    //mengambil metode untuk pengambilan data
    Fragment1 f1list = new Fragment1();
    ArrayList<Data> datas1 = f1list.getFrag1List();
    Fragment2 f2list = new Fragment2();
    ArrayList<Data> datas2 = f2list.getFrag2List();
    Fragment3 f3list = new Fragment3();
    ArrayList<Data> datas3 = f3list.getFrag3List();
    Fragment4 f4list = new Fragment4();
    ArrayList<Data> datas4 = f4list.getFrag4List();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.mViewPager);
        this.addPages(vp);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_drafts_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_insert_chart_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_crop_original_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_group_black_24dp);
        tabLayout.setOnTabSelectedListener(listener(vp));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);

        return true;
    }

    //menambahkan fragment kedalam view pager
    private void addPages(ViewPager pager) {
        MyFragPagerAdapter adapter = new MyFragPagerAdapter(getSupportFragmentManager());
        adapter.addPage(new Fragment1());
        adapter.addPage(new Fragment2());
        adapter.addPage(new Fragment3());
        adapter.addPage(new Fragment4());

        pager.setAdapter(adapter);
    }


    private TabLayout.OnTabSelectedListener listener(final ViewPager pager) {
        return new TabLayout.OnTabSelectedListener() {
            //mengatur apa yang akan terjadi jika tab di pilih
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    setTitle("Fragment 1");
                } else if (tab.getPosition() == 1) {
                    setTitle("Fragment 2");
                } else if (tab.getPosition() == 2) {
                    setTitle("Fragment 3");
                } else if (tab.getPosition() == 3) {
                    setTitle("Fragment 4");
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }

    //mengatur ketika item di klik (untuk Chord Adapter)
    @Override
    public void doClickFrag1(int pos) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra(LINK_1, datas1.get(pos));
        intent.putExtra(ID, 1);
        startActivity(intent);
    }

    //mengatur ketika item di klik (untuk Lagu Adapter)
    @Override
    public void doClickFrag2(int pos) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra(LINK_2, datas2.get(pos));
        intent.putExtra(ID, 2);
        startActivity(intent);
    }

    @Override
    public void doClickFrag3(int pos) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra(LINK_3, datas3.get(pos));
        intent.putExtra(ID, 3);
        startActivity(intent);
    }

    @Override
    public void doClickFrag4(int pos) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra(LINK_4, datas4.get(pos));
        intent.putExtra(ID, 4);
        startActivity(intent);
    }
}
