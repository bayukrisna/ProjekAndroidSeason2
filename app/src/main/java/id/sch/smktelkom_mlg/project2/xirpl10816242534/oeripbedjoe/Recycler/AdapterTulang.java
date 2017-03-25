package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.TulangActivity;

/**
 * Created by Akbar on 20/03/2017.
 */

public class AdapterTulang extends RecyclerView.Adapter<AdapterTulang.ViewHolder> {

    ArrayList<Data> datas;

    public AdapterTulang(TulangActivity tulangActivity, ArrayList<Data> datas) {
        this.datas = datas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tulang_list, parent, false);
        AdapterTulang.ViewHolder holder = new AdapterTulang.ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Data data = datas.get(position);
        holder.tvFrag11.setText(data.text1);
        holder.tvFrag12.setText(data.text2);
        holder.ivFrag1.setImageResource(data.img1);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFrag1;
        TextView tvFrag12;
        TextView tvFrag11;

        public ViewHolder(View itemView) {
            super(itemView);

            tvFrag12 = (TextView) itemView.findViewById(R.id.textViewFrag11);
            ivFrag1 = (ImageView) itemView.findViewById(R.id.imageViewFrag1);
            tvFrag11 = (TextView) itemView.findViewById(R.id.textViewFrag12);
        }
    }
}
