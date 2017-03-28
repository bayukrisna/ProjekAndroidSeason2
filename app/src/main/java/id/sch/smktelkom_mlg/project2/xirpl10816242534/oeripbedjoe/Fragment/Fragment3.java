package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.TulangActivity;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment3 extends Fragment {

    public static final String ANGT = "angt";
    AdapterFragment3 mIDataAdapterFrag3;

    //Menjadikan fragment_3 layout yang dimiliki oleh Fragment3.java
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_3, container, false);
        return rootView;
    }

    //Membuat RecyclerView
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getView().findViewById(R.id.head).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilIntent(1);
            }
        });

        getView().findViewById(R.id.hand).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilIntent(2);
            }
        });

        getView().findViewById(R.id.body).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilIntent(3);
            }
        });

        getView().findViewById(R.id.hand2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilIntent(4);
            }
        });

        getView().findViewById(R.id.leg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilIntent(5);
            }
        });
    }

    private void hasilIntent(int i) {
        Intent intent = new Intent(getActivity().getApplication(), TulangActivity.class);
        intent.putExtra(ANGT, i);
        startActivity(intent);
    }




    //Memberi Nama Tab
    public String toString() {
        return "Fragment 3";
    }
}
