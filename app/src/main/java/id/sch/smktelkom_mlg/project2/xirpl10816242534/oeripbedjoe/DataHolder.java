package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Smktelkom on 0029, 3/29/2017.
 */

public class DataHolder extends RecyclerView.ViewHolder {
    private final TextView mTextDesc;
    private final TextView mTextCure;
    private final TextView mTextIndication;

    public DataHolder(View itemView) {
        super(itemView);
        mTextDesc = (TextView) itemView.findViewById(R.id.textView1);
        mTextCure = (TextView) itemView.findViewById(R.id.textView2);
        mTextIndication = (TextView) itemView.findViewById(R.id.textView3);
    }

    public void setmTextDesc(String desc) {
        mTextDesc.setText(desc);
    }

    public void setmTextIndication(String indication) {
        mTextIndication.setText(indication);
    }

    public void setmTextCure(String cure) {
        mTextCure.setText(cure);
    }
}
