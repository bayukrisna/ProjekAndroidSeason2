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
 * Created by user on 20/11/2016.
 */

public class AdapterFragment1 extends RecyclerView.Adapter<AdapterFragment1.MyViewHolder> {

    ArrayList<Data> datas;
    AdapterFragment1.IDataAdapter mIDataAdapterFrag1;

    public AdapterFragment1(Context context, ArrayList<Data> datas) {
        this.datas = datas;
        mIDataAdapterFrag1 = (AdapterFragment1.IDataAdapter) context;
    }

    //menampilkan layout fragment1list kedalam fragment_1
    @Override
    public AdapterFragment1.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment1list, parent, false);
        AdapterFragment1.MyViewHolder holder = new AdapterFragment1.MyViewHolder(v);
        return holder;
    }

    //merubah data pada fragment1list
    @Override
    public void onBindViewHolder(AdapterFragment1.MyViewHolder holder, int position) {
        Data data = datas.get(position);
        holder.tvFrag11.setText(data.text1);
        holder.tvFrag12.setText(data.text2);
        holder.ivFrag1.setImageResource(data.img1);

    }

    // mengatur berapa banyak data yang akan ditampilkan
    @Override
    public int getItemCount() {
        return datas.size();
    }

    //membuat interface dari adapater
    public interface IDataAdapter {
        void doClickFrag1(int pos);
    }

    //deklarasi dan inisialisasi id dari item list
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFrag1;
        TextView tvFrag12;
        TextView tvFrag11;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvFrag12 = (TextView) itemView.findViewById(R.id.textViewFrag11);
            ivFrag1 = (ImageView) itemView.findViewById(R.id.imageViewFrag1);
            tvFrag11 = (TextView) itemView.findViewById(R.id.textViewFrag12);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDataAdapterFrag1.doClickFrag1(getAdapterPosition());
                }
            });
        }
    }
}
