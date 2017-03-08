package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment1;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment1 extends Fragment {

    AdapterFragment1 mIDataAdapterFrag1;

    //menjadikan fragment_1 layout yang dimiliki oleh Fragment1.java
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, null);
        return v;
    }

    //Membuat RecyclerView ketika activity dibuat
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView rvChord = (RecyclerView) getView().findViewById(R.id.mRecyclerFrag1);
        rvChord.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mIDataAdapterFrag1 = new AdapterFragment1(this.getActivity(), getFrag1List());
        rvChord.setAdapter(mIDataAdapterFrag1);
    }

    //Menambahkan Data
    public ArrayList<Data> getFrag1List() {
        ArrayList<Data> datas = new ArrayList<>();
        Data data = new Data("Fragment 1", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Judul Penyakit", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Judul Penyakit", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Judul Penyakit", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Judul Penyakit", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);
        data = new Data("Fragment 1", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas.add(data);


        return datas;
    }

    //Memberi Nama Tab
    public String toString() {
        return "Fragment 1";
    }
}
