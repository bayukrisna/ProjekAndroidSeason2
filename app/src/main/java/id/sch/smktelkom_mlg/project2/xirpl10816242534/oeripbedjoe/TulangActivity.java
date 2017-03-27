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
    ArrayList<Data> datasHead = getHeadList();
    ArrayList<Data> datasHand = getHandList();
    ArrayList<Data> datasBody = getBodyList();
    ArrayList<Data> datasFoot = getFootList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulang);

        RecyclerView rvChord = (RecyclerView) findViewById(R.id.mRecyclerTulang);
        rvChord.setLayoutManager(new LinearLayoutManager(this));

        Integer anggota = getIntent().getIntExtra(Fragment3.ANGT, 0);

        if (anggota == 1) {
            mAdapterTulang = new AdapterTulang(this, datasHead);
        } else if (anggota == 2 || anggota == 4) {
            mAdapterTulang = new AdapterTulang(this, datasHand);
        } else if (anggota == 3) {
            mAdapterTulang = new AdapterTulang(this, datasBody);
        } else if (anggota == 5) {
            mAdapterTulang = new AdapterTulang(this, datasFoot);
        }

        rvChord.setAdapter(mAdapterTulang);


    }

    //Mengisikan Data
    public ArrayList<Data> getHeadList() {
        ArrayList<Data> datas3 = new ArrayList<>();
        Data data = new Data("Kepala", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Kepala", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Kepala", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);

        return datas3;
    }

    public ArrayList<Data> getHandList() {
        ArrayList<Data> datas3 = new ArrayList<>();
        Data data = new Data("Tangan", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Tangan", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Tangan", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);

        return datas3;
    }

    public ArrayList<Data> getBodyList() {
        ArrayList<Data> datas3 = new ArrayList<>();
        Data data = new Data("Badan", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Badan", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Badan", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);

        return datas3;
    }

    public ArrayList<Data> getFootList() {
        ArrayList<Data> datas3 = new ArrayList<>();
        Data data = new Data("Kaki", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Kaki", R.drawable.sao2, R.drawable.asuna, "ASUNA", "ORDINAL SCALE");
        datas3.add(data);
        data = new Data("Kaki", R.drawable.sao1, R.drawable.kirito, "KIRITO", "ORDINAL SCALE");
        datas3.add(data);

        return datas3;
    }
}
