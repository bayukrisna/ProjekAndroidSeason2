package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment3 extends Fragment {

    AdapterFragment3 mIDataAdapterFrag3;

    //Menjadikan fragment_3 layout yang dimiliki oleh Fragment3.java
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_3, null);
        return v;
    }

    //Membuat RecyclerView
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        RecyclerView rvChord = (RecyclerView) getView().findViewById(R.id.mRecyclerFrag3);
        rvChord.setLayoutManager(new GridLayoutManager(this.getActivity(), 2));
        mIDataAdapterFrag3 = new AdapterFragment3(this.getActivity(), getFrag3List());
        rvChord.setAdapter(mIDataAdapterFrag3);

    }


    //Mengisikan Data
    public ArrayList<Data> getFrag3List() {
        ArrayList<Data> datas3 = new ArrayList<>();
        Data data = new Data("Fragment 3", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Fragment 3", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);

        return datas3;
    }

    //Memberi Nama Tab
    public String toString() {
        return "Fragment 3";
    }
}
