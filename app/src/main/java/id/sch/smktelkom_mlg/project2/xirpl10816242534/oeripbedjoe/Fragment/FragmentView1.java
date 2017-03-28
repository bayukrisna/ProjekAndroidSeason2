package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        if (id == 1) {
            /*//mendapatkan intent dari Main Activity dengan Constanta LINK_1
            Data data = (Data) getActivity().getIntent().getSerializableExtra(MainActivity.LINK_1);
            ImageView iv1 = (ImageView) getActivity().findViewById(R.id.imageView1F1);
            TextView tv1 = (TextView) getActivity().findViewById(R.id.textView1F1);
            TextView tv2 = (TextView) getActivity().findViewById(R.id.textView2F1);
            ImageView iv2 = (ImageView) getActivity().findViewById(R.id.imageView2F1);
            TextView tv3 = (TextView) getActivity().findViewById(R.id.textView3F1);
            //merubah data
            iv1.setImageResource(data.img1);
            tv1.setText(data.text1);
            tv2.setText(data.text2);
            iv2.setImageResource(data.img2);
            tv3.setText(data.text3);*/
        }
    }
}
