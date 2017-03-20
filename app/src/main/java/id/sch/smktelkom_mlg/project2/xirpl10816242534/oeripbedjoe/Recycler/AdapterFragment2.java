package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;

/**
 * Created by user on 17/11/2016.
 */

public class AdapterFragment2 extends RecyclerView.Adapter<AdapterFragment2.MyViewHolder> {

    ArrayList<Data> datas;
    IDataAdapter mIDataAdapterFrag2;

    public AdapterFragment2(Context context, ArrayList<Data> datas) {
        this.datas = datas;
        mIDataAdapterFrag2 = (IDataAdapter) context;
    }

    //menampilkan layout fragment1list kedalam layout fragment_2
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment2list, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    //merubah data pada item list
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = datas.get(position);
        holder.tvFrag2.setText(data.text1);
        holder.ivFrag2.setImageResource(data.img1);
    }

    //mengatur berapa data yang ditampilkan
    @Override
    public int getItemCount() {
        return datas.size();
    }

    //membuat interface
    public interface IDataAdapter {
        void doClickFrag2(int pos);
    }

    //deklarasi dan inisialisasi dari layout
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFrag2;
        TextView tvFrag2;

        public MyViewHolder(View itemView) {
            super(itemView);

            ivFrag2 = (ImageView) itemView.findViewById(R.id.imageViewFrag2);
            tvFrag2 = (TextView) itemView.findViewById(R.id.textViewFrag2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDataAdapterFrag2.doClickFrag2(getAdapterPosition());
                }
            });
        }
    }
}