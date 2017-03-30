package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.TulangModel;

/**
 * Created by Akbar on 20/03/2017.
 */

public class AdapterTulang extends RecyclerView.Adapter<AdapterTulang.ViewHolder> {

    ArrayList<TulangModel> datas;
    IDataAdapter mTulangAdapter;

    public AdapterTulang(Context context, ArrayList<TulangModel> datas) {
        this.datas = datas;
        mTulangAdapter = (IDataAdapter) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tulang_list, parent, false);
        AdapterTulang.ViewHolder holder = new AdapterTulang.ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TulangModel data = datas.get(position);
        holder.tvJudul.setText(data.getTitleTulang());
        holder.tvDefinisi.setText(data.getDescTulang());
        holder.tvAbjad.setText(data.getTitleTulang().substring(0, 1));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public interface IDataAdapter {
        void doClickTulang(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;
        TextView tvDefinisi;
        TextView tvAbjad;

        public ViewHolder(View itemView) {
            super(itemView);

            tvDefinisi = (TextView) itemView.findViewById(R.id.textViewFrag11ah);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewFrag12ah);
            tvAbjad = (TextView) itemView.findViewById(R.id.textViewTitleah);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mTulangAdapter.doClickTulang(getAdapterPosition());
                }
            });
        }
    }
}
