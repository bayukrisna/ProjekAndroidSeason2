package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;

import static id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R.id.radioya;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment4 extends Fragment {

    EditText etnama;
    EditText etBerat;
    EditText etTinggi;
    RadioButton radioyaa;
    RadioButton radioyaa1;
    Button bCek;
    TextView tvHasil;
    TextView tvSaran;
    TextView tvBerat;
    TextView jenkel;
    RadioGroup radiogrup;

    Double ti, bt, hi;
    String temp = "";

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

        etnama = (EditText) getView().findViewById(R.id.editTextNama);
        etBerat = (EditText) getView().findViewById(R.id.editTextBerat);
        etTinggi = (EditText) getView().findViewById(R.id.editTextTinggi);
        radioyaa = (RadioButton) getView().findViewById(R.id.radioButton);
        radioyaa1 = (RadioButton) getView().findViewById(R.id.radioButton2);
        bCek = (Button) getView().findViewById(R.id.buttonCek);
        tvHasil = (TextView) getView().findViewById(R.id.textViewHasil);
        tvSaran = (TextView) getView().findViewById(R.id.textViewSaran);
        tvBerat = (TextView) getView().findViewById(R.id.textViewBerat);
        jenkel = (TextView) getView().findViewById(R.id.JK);
        radiogrup = (RadioGroup) getView().findViewById(radioya);


        getView().findViewById(R.id.buttonCek).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });
    }

    private void doClick() {


        if (isvalid()) {


        }
    }

    private boolean isvalid() {
        boolean valid = true;

        String nama = etnama.getText().toString();
        String beratS = etBerat.getText().toString();
        String tinggiS = etTinggi.getText().toString();
        int berat = etBerat.getText().toString().isEmpty() ? 0 : Integer.parseInt(etBerat.getText().toString());
        int tinggi = etTinggi.getText().toString().isEmpty() ? 0 : Integer.parseInt(etTinggi.getText().toString());

        //ti = Double.valueOf(String.valueOf(etTinggi.getText()));
        //bt = Double.valueOf(String.valueOf(etBerat.getText()));

        if (nama.isEmpty()) {
            etnama.setError("Nama Belum Diisi");
            valid = false;
        } else {
            etnama.setError(null);
            tvHasil.setText("Hai" + nama);
        }

        if (beratS.isEmpty()) {
            etBerat.setError("Berat Badan Harus Diisi");
            valid = false;
        }

        if (tinggiS.isEmpty()) {
            etTinggi.setError("Tinggi Badan Harus Diisi");
            valid = false;
        }

        if (radiogrup.getCheckedRadioButtonId() == -1) {
            jenkel.setText("Pilih Jenis Kelamin (Anda Belum Mengisi)");
            jenkel.setTextColor(getResources().getColor(R.color.red));
            valid = false;
        } else {
            
        }

        /*if (radioyaa.isChecked()) {
            hi = (ti - 100) * 1;
        } else if (radioyaa1.isChecked()) {
            hi = (ti - 104) * 1;
        }
        temp = hi.toString();

        if (hi < bt) {
            tvBerat.setText(temp);
            tvHasil.setText("Sepertinya Anda OverWeight");
            tvSaran.setText("Banyaklah Berolahraga dan hindari makanan berkoresterol tinggi");
        } else if (hi > bt) {
            tvBerat.setText(temp);
            tvHasil.setText("Sepertinya Kamu Underweight");
            tvSaran.setText("Banyaklah Makan - Makanan Berkarbohidrat");
        } else {
            tvBerat.setText(temp);
            tvHasil.setText("Berat Badan Sudah Ideal");
            tvSaran.setText("Lanjutkan pola makan anda, serta gaya hidup sehat anda");
        }*/

        return valid;
    }


    //Memberi Nama Tab
    public String toString() {
        return "Cek Ideal Tubuh";
    }
}




