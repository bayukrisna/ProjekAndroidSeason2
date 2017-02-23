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
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment4;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment4 extends Fragment {

    AdapterFragment4 mIDataAdapterFrag4;

    //Menjadikan fragment_4 layout yang dimiliki oleh Fragment4.java
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_4, null);
        return v;
    }

    //Membuat RecyclerView
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        RecyclerView rvChord = (RecyclerView) getView().findViewById(R.id.mRecyclerFrag4);
        rvChord.setLayoutManager(new GridLayoutManager(this.getActivity(), 2));
        mIDataAdapterFrag4 = new AdapterFragment4(this.getActivity(), getFrag4List());
        rvChord.setAdapter(mIDataAdapterFrag4);

    }


    //Mengisikan Data
    public ArrayList<Data> getFrag4List() {
        ArrayList<Data> datas4 = new ArrayList<>();
        Data data = new Data("Fragment 4", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas4.add(data);
        data = new Data("Fragment 4", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas4.add(data);

        return datas4;
    }

    //Memberi Nama Tab
    public String toString() {
        return "Fragment 4";
    }
}




