package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.DataAdapter;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;

/**
 * Created by user on 20/11/2016.
 */

public class AdapterFragment1 extends RecyclerView.Adapter<AdapterFragment1.MyViewHolder> {

    ArrayList<DataAdapter> mDatas;
    IDataAdapter mIDataAdapterFrag1;

    public AdapterFragment1(Context context, ArrayList<DataAdapter> datas) {
        mIDataAdapterFrag1 = (IDataAdapter) context;
        mDatas = datas;
    }

    //menampilkan layout fragment1list kedalam fragment_1
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment1list, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    //merubah data pada fragment1list
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataAdapter data = mDatas.get(position);
        holder.tvFrag11.setText(data.getTitle());
        holder.tvFrag12.setText(data.getDesc());
        holder.tvTitle.setText(data.getTitle().substring(0, 1));
        //holder.ivFrag1.setImageResource(data.img1);

    }

    // mengatur berapa banyak data yang akan ditampilkan
    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    //membuat interface dari adapater
    public interface IDataAdapter {
        void doClickFrag1(int pos);
    }

    //deklarasi dan inisialisasi id dari item list
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvFrag12;
        TextView tvFrag11;
        TextView tvTitle;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvFrag12 = (TextView) itemView.findViewById(R.id.textViewFrag11);
            tvFrag11 = (TextView) itemView.findViewById(R.id.textViewFrag12);
            tvTitle = (TextView) itemView.findViewById(R.id.textViewTitle);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIDataAdapterFrag1.doClickFrag1(getAdapterPosition());
                }
            });
        }
    }
}
