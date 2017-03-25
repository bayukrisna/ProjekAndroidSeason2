package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterTulang;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.Data;

public class TulangActivity extends AppCompatActivity {

    AdapterTulang mAdapterTulang;
    ArrayList<Data> datasTulang = getTulangList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulang);

        RecyclerView rvChord = (RecyclerView) findViewById(R.id.mRecyclerTulang);
        rvChord.setLayoutManager(new LinearLayoutManager(this));
        mAdapterTulang = new AdapterTulang(this, datasTulang);
        rvChord.setAdapter(mAdapterTulang);

        Integer anggota = getIntent().getIntExtra(Fragment3.ANGT, 0);
    }

    public ArrayList<Data> getTulangList() {
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
}
