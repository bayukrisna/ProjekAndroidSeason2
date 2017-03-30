package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TulangModel data = (TulangModel) getIntent().getSerializableExtra(TulangActivity.LINK_TULANG);
        setTitle(data.getTitleTulang());
        ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
        ivFoto.setImageDrawable(getResources().getDrawable(data.getImgTulang()));
        TextView tvDeskripsi = (TextView) findViewById(R.id.definisi_tulang);
        tvDeskripsi.setText(data.getDescTulang());
        TextView tvGejala = (TextView) findViewById(R.id.gejala_tulang);
        tvGejala.setText(data.getIndicationTulang());
        TextView tvPenangan = (TextView) findViewById(R.id.penanganan_tulang);
        tvPenangan.setText(data.getCureTulang());
    }
}
