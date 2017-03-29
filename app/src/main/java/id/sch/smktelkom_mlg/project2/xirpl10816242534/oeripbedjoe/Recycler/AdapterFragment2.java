package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.DataAdapter;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;

/**
 * Created by user on 17/11/2016.
 */

public class AdapterFragment2 extends RecyclerView.Adapter<AdapterFragment2.MyViewHolder> {

    List<DataAdapter> mDatas;
    IDataAdapter mIDataAdapterFrag2;

    public AdapterFragment2(Context context, List<DataAdapter> datas) {
        mIDataAdapterFrag2 = (IDataAdapter) context;
        mDatas = datas;
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
        DataAdapter data = mDatas.get(position);
        holder.tvFrag11.setText(data.getTitle());
        holder.tvFrag12.setText(data.getDesc());
        holder.tvTitle.setText(data.getTitle().substring(0, 1));
    }

    //mengatur berapa data yang ditampilkan
    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    //membuat interface
    public interface IDataAdapter {
        void doClickFrag2(int pos);
    }

    //deklarasi dan inisialisasi dari layout
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
                    mIDataAdapterFrag2.doClickFrag2(getAdapterPosition());
                }
            });
        }
    }
}
