package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.MainActivity;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

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

    public void goToAttract(View v) {
        Intent intent = new Intent(getActivity().getApplication(), MainActivity.class);
        startActivity(intent);
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
    }

    private void hasilIntent(int i) {
        Intent intent = new Intent(getActivity().getApplication(), Fragment4.class);
        intent.putExtra(ANGT, i);

        startActivity(intent);
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
