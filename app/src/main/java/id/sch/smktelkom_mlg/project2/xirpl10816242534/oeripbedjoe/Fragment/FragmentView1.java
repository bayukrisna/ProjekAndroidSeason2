package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.DataAdapter;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.MainActivity;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentView1 extends Fragment {


    public FragmentView1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_view1, container, false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        int id = getActivity().getIntent().getIntExtra(MainActivity.ID, 0);
        int idFra = getActivity().getIntent().getIntExtra(Fragment1.ID_FRA_1, 0);
        int idFra2 = getActivity().getIntent().getIntExtra(Fragment2.ID_FRA_2, 0);
        TextView tvDescription;

        //jika id nya 1 maka proses yang dijalankan
        if (idFra == 1) {
            //mendapatkan intent dari Main Activity dengan Constanta LINK_1
            DataAdapter data = (DataAdapter) getActivity().getIntent().getSerializableExtra(Fragment1.LINK_FRA_1);
            tvDescription = (TextView) getView().findViewById(R.id.textViewDescription);
            tvDescription.setText(data.getDesc());
        }

        if (idFra2 == 2) {
            DataAdapter data = (DataAdapter) getActivity().getIntent().getSerializableExtra(Fragment2.LINK_FRA_2);
            tvDescription = (TextView) getView().findViewById(R.id.textViewDescription);
            tvDescription.setText(data.getDesc());
        }
    }
}
