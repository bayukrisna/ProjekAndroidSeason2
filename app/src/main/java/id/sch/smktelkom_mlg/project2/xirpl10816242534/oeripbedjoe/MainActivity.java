package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment1;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment2;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment4;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment2;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

public class MainActivity extends AppCompatActivity implements AdapterFragment2.IDataAdapter {

    public static final String LINK_1 = "link1";
    public static final String LINK_2 = "link2";
    public static final String LINK_3 = "link3";
    public static final String LINK_4 = "link4";
    public static final String ID = "id";

    //mengambil metode untuk pengambilan data
    Fragment1 f1list = new Fragment1();
    ArrayList<DataAdapter> datas1 = f1list.getmDataMains();
    Fragment2 f2list = new Fragment2();
    ArrayList<Data> datas2 = f2list.getFrag2List();
    ArrayList<DataAdapter> mListAll = new ArrayList<>();
    boolean isFiltered;
    ArrayList<Integer> mListMapFilter = new ArrayList<>();
    String mQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        DatabaseReference ringanRef = FirebaseDatabase.getInstance().getReference("ringan");
        ringanRef.keepSynced(true);
        DatabaseReference beratRef = FirebaseDatabase.getInstance().getReference("berat");
        beratRef.keepSynced(true);

        ViewPager vp = (ViewPager) findViewById(R.id.mViewPager);
        this.addPages(vp);

        setTitle("Penyakit Ringan");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        //tabLayout.getTabAt(0).setIcon(R.drawable.ic_drafts_black_24dp);
        //tabLayout.getTabAt(1).setIcon(R.drawable.ic_insert_chart_black_24dp);
        //tabLayout.getTabAt(2).setIcon(R.drawable.ic_crop_original_black_24dp);
        //tabLayout.getTabAt(3).setIcon(R.drawable.ic_group_black_24dp);
        tabLayout.getTabAt(0).setIcon(R.drawable.stetoskop);
        tabLayout.getTabAt(1).setIcon(R.drawable.suntikyaa);
        tabLayout.getTabAt(2).setIcon(R.drawable.tulangicon);
        tabLayout.getTabAt(3).setIcon(R.drawable.kalori);
        tabLayout.setOnTabSelectedListener(listener(vp));

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
                    setTitle("Penyakit Ringan");
                } else if (tab.getPosition() == 1) {
                    setTitle("Penyakit Berat");
                } else if (tab.getPosition() == 2) {
                    setTitle("Penyakit Tulang");
                } else if (tab.getPosition() == 3) {
                    setTitle("Cek Ideal Tubuh");
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
  /* @Override
    public void doClickFrag1(int pos) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra(LINK_1, datas1.get(pos));
        intent.putExtra(ID, 1);
        startActivity(intent);
    }*/

    //mengatur ketika item di klik (untuk Lagu Adapter)
    @Override
    public void doClickFrag2(int pos) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra(LINK_2, datas2.get(pos));
        intent.putExtra(ID, 2);
        startActivity(intent);
    }
/*
    @Override
    public void doClickFrag3(int pos) {
        Intent intent = new Intent(this, TulangActivity.class);
        intent.putExtra(LINK_3, datasHead.get(pos));
        intent.putExtra(ID, 3);
        startActivity(intent);
    }*/
}
