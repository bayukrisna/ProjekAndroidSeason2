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
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment2;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment2 extends Fragment {

    AdapterFragment2 mIDataAdapterFrag2;

    //Menjadikan fragment_2 layout yang dimiliki oleh Fragment2.java
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, null);
        return v;
    }

    //Membuat RecyclerView
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        RecyclerView rvChord = (RecyclerView) getView().findViewById(R.id.mRecyclerFrag1);
        rvChord.setLayoutManager(new GridLayoutManager(this.getActivity(), 2));
        mIDataAdapterFrag2 = new AdapterFragment2(this.getActivity(), getFrag2List());
        rvChord.setAdapter(mIDataAdapterFrag2);

    }


    //Mengisikan Data
    public ArrayList<Data> getFrag2List() {
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
        return "Fragment 2";
    }
}
