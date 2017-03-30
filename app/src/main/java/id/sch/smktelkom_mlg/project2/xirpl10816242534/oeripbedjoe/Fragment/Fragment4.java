package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment4 extends Fragment {
    EditText etNama;
    EditText etBerat;
    EditText etTinggi;
    RadioGroup radioyaa;
    Button bCek;
    TextView tvHasil;
    TextView tvSaran;

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
        etNama = (EditText) getView().findViewById(R.id.editTextNama);
        etBerat = (EditText) getView().findViewById(R.id.editTextBerat);
        etTinggi = (EditText) getView().findViewById(R.id.editTextTinggi);
        radioyaa = (RadioGroup) getView().findViewById(R.id.radioya);
        bCek = (Button) getView().findViewById(R.id.buttonCek);
        tvHasil = (TextView) getView().findViewById(R.id.textViewHasil);
        tvSaran = (TextView) getView().findViewById(R.id.textViewSaran);
        getView().findViewById(R.id.buttonCek).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });

    }

    private void doClick() {
        String nama = etNama.getText().toString();
        int a = etBerat.getText().toString().isEmpty() ? 0 : Integer.parseInt(etBerat.getText().toString());
        int b = etTinggi.getText().toString().isEmpty() ? 0 : Integer.parseInt(etTinggi.getText().toString());

        tvHasil.setText(a + "-" + b + "=" + (a - b));

        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi");
        } else if (nama.length() <= 2) {
            etNama.setError("Nama minimal 3 karakter");
        } else {
            etNama.setError(null);
        }

    }




    //Memberi Nama Tab
    public String toString() {
        return "Cek Ideal Tubuh";
    }
}

