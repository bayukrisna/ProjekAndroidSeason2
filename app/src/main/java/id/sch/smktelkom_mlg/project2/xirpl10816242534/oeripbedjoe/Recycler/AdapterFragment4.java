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

public class AdapterFragment4 extends RecyclerView.Adapter<AdapterFragment4.MyViewHolder> {

    ArrayList<Data> datas;
    IDataAdapter mIDataAdapterFrag4;

    public AdapterFragment4(Context context, ArrayList<Data> datas) {
        this.datas = datas;
        mIDataAdapterFrag4 = (IDataAdapter) context;
    }

    //menampilkan layout fragment1list kedalam layout fragment_2
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment4list, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    //merubah data pada item list
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = datas.get(position);
        holder.tvFrag4.setText(data.text1);
        holder.ivFrag4.setImageResource(data.img1);
    }

    //mengatur berapa data yang ditampilkan
    @Override
    public int getItemCount() {
        return datas.size();
    }

    //membuat interface
    public interface IDataAdapter {
        void doClickFrag4(int pos);
    }

    //deklarasi dan inisialisasi dari layout
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFrag4;
        TextView tvFrag4;

        public MyViewHolder(View itemView) {
            super(itemView);

            ivFrag4 = (ImageView) itemView.findViewById(R.id.imageViewFrag4);
            tvFrag4 = (TextView) itemView.findViewById(R.id.textViewFrag4);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDataAdapterFrag4.doClickFrag4(getAdapterPosition());
                }
            });
        }
    }
}
