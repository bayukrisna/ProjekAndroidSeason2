package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment1;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.FragmentView1;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.FragmentView2;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.FragmentView3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

public class ViewActivity extends AppCompatActivity {

    public static final String LINK = "link";
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);



        int id = getIntent().getIntExtra(MainActivity.ID, 0);
        int idTulang = getIntent().getIntExtra(TulangActivity.ID_TULANG, 0);
        int idFra = getIntent().getIntExtra(Fragment1.ID_FRA_1, 0);

        //jika id nya 1 maka proses yang dijalankan
        if (idFra == 1) {
            //mendapatkan intent dari Main Activity dengan Constanta LINK_1
            DataAdapter data = (DataAdapter) getIntent().getSerializableExtra(Fragment1.LINK_FRA_1);
            setTitle(data.getTitle());
        } else if (id == 2) {
            //mendapatkan intent dari Main Activity dengan Constanta LINK_1
            Data data = (Data) getIntent().getSerializableExtra(MainActivity.LINK_2);
            setTitle(data.text1);
        } else if (idTulang == 3) {
            //mendapatkan intent dari Main Activity dengan Constanta LINK_1
            Data data = (Data) getIntent().getSerializableExtra(TulangActivity.LINK_TULANG);
            setTitle(data.text1);
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_view, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;


        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new FragmentView1();
            } else if (position == 1)
                return new FragmentView2();
            else if (position == 2)
                return new FragmentView3();
            else
                return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Deskripsi";
                case 1:
                    return "Gejala";
                case 2:
                    return "Pengobatan";
            }
            return null;
        }
    }
}
