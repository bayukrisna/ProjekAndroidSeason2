package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment.Fragment3;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.MainActivity;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //mendapatkan id intent
        int id = getIntent().getIntExtra(MainActivity.ID, 0);
        Integer anggota = getIntent().getIntExtra(Fragment3.ANGT, 0);

        //jika id nya 1 maka proses yang dijalankan
        if (id == 1) {
            //mendapatkan intent dari Main Activity dengan Constanta LINK_1
            Data data = (Data) getIntent().getSerializableExtra(MainActivity.LINK_1);
            setTitle(data.text1);
            ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
            TextView tv1 = (TextView) findViewById(R.id.textView1);
            TextView tv2 = (TextView) findViewById(R.id.textView2);
            ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
            TextView tv3 = (TextView) findViewById(R.id.textView3);
            //merubah data
            iv1.setImageResource(data.img1);
            tv1.setText(data.text1);
            tv2.setText(data.text2);
            iv2.setImageResource(data.img2);
            tv3.setText(data.text3);
        }

        //jika id yang didapatkan 2 maka proses yang dilakukan
        else if (id == 2) {
            //mendapatkan intent dari Main Activity dengan Constanta LINK_2
            Data data = (Data) getIntent().getSerializableExtra(MainActivity.LINK_2);
            setTitle(data.text1);
            ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
            TextView tv1 = (TextView) findViewById(R.id.textView1);
            TextView tv2 = (TextView) findViewById(R.id.textView2);
            ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
            TextView tv3 = (TextView) findViewById(R.id.textView3);
            //merubah data
            iv1.setImageResource(data.img1);
            tv1.setText(data.text1);
            tv2.setText(data.text2);
            iv2.setImageResource(data.img2);
            tv3.setText(data.text3);
        }

        //jika id yang didapatkan 3 maka proses yang dilakukan
        else if (id == 3) {
            //mendapatkan intent dari Main Activity dengan Constanta LINK_3
            Data data = (Data) getIntent().getSerializableExtra(MainActivity.LINK_3);
            setTitle(data.text1);
            ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
            TextView tv1 = (TextView) findViewById(R.id.textView1);
            TextView tv2 = (TextView) findViewById(R.id.textView2);
            ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
            TextView tv3 = (TextView) findViewById(R.id.textView3);
            //merubah data
            iv1.setImageResource(data.img1);
            tv1.setText(data.text1);
            tv2.setText(data.text2);
            iv2.setImageResource(data.img2);
            tv3.setText(data.text3);
        }

        //jika id yang didapatkan 4 maka proses yang dilakukan
        else if (id == 4) {
            //mendapatkan intent dari Main Activity dengan Constanta LINK_4
            Data data = (Data) getIntent().getSerializableExtra(MainActivity.LINK_4);
            setTitle(data.text1);
            ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
            TextView tv1 = (TextView) findViewById(R.id.textView1);
            TextView tv2 = (TextView) findViewById(R.id.textView2);
            ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
            TextView tv3 = (TextView) findViewById(R.id.textView3);
            //merubah data
            iv1.setImageResource(data.img1);
            tv1.setText(data.text1);
            tv2.setText(data.text2);
            iv2.setImageResource(data.img2);
            tv3.setText(data.text3);
        }
    }
}
