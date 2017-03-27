package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment4 extends Fragment {


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

    }


    //Memberi Nama Tab
    public String toString() {
        return "Cek Ideal Tubuh";
    }
}




