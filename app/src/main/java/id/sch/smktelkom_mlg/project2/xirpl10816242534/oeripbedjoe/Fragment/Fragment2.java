package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.DataAdapter;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment2;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.ViewActivity;

import static android.content.ContentValues.TAG;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment2 extends Fragment {
    public static final String LINK_FRA_2 = "link_fra_2";
    public static final String ID_FRA_2 = "id_fra_2";
    FirebaseRecyclerAdapter mAdapter;
    private AdapterFragment2 mAdapterFragment2;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessagesDatabaseReference;
    private ChildEventListener mChildEventListener;
    private ArrayList<DataAdapter> mDataMains = new ArrayList<>();

    //Menjadikan fragment_2 layout yang dimiliki oleh Fragment2.java
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, null);
        return v;
    }

    public ArrayList<DataAdapter> getmDataMains() {
        return mDataMains;
    }

    //Membuat RecyclerView
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mMessagesDatabaseReference = mFirebaseDatabase.getReference().child("berat");
        final RecyclerView mRecycler = (RecyclerView) getView().findViewById(R.id.mRecyclerFrag1);
        DatabaseReference mRef2 = FirebaseDatabase.getInstance().getReference().child("berat");

        mChildEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if (dataSnapshot != null && dataSnapshot.getValue() != null) {
                    try {
                        DataAdapter model = dataSnapshot.getValue(DataAdapter.class);

                        mDataMains.add(model);
                        mRecycler.scrollToPosition(mDataMains.size() - 1);
                        mAdapter.notifyItemInserted(mDataMains.size() - 1);
                    } catch (Exception ex) {
                        Log.e(TAG, ex.getMessage());
                    }
                }
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        mRef2.addChildEventListener(mChildEventListener);

        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        LinearLayoutManager mLayoutManager = (LinearLayoutManager) mRecycler.getLayoutManager();
        mAdapter = new FirebaseRecyclerAdapter<DataAdapter, BeratHolder>(DataAdapter.class, R.layout.fragment2list, BeratHolder.class, mRef2) {
            @Override
            protected void populateViewHolder(BeratHolder beratViewHolder, DataAdapter data, int position) {
                beratViewHolder.setName(data.getTitle());
                beratViewHolder.setText(data.getDesc());
                beratViewHolder.setAbjad(data.getTitle().substring(0, 1));
            }

            @Override
            public BeratHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                BeratHolder viewHolder = super.onCreateViewHolder(parent, viewType);
                viewHolder.setOnClickListener(new BeratHolder.ClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(getActivity(), ViewActivity.class);
                        intent.putExtra(LINK_FRA_2, mDataMains.get(position));
                        intent.putExtra(ID_FRA_2, 2);
                        startActivity(intent);
                    }
                });
                return viewHolder;
            }
        };
        mLayoutManager.scrollToPosition(0);
        mRecycler.setAdapter(mAdapter);
    }


    //Memberi Nama Tab
    public String toString() {
        return "Fragment 2";
    }

    private static class BeratHolder extends RecyclerView.ViewHolder {
        TextView tvFrag12;
        TextView tvFrag11;
        TextView tvTitle;
        private BeratHolder.ClickListener mClickListener;

        public BeratHolder(View itemView) {
            super(itemView);
            tvFrag12 = (TextView) itemView.findViewById(R.id.textViewFrag11);
            tvFrag11 = (TextView) itemView.findViewById(R.id.textViewFrag12);
            tvTitle = (TextView) itemView.findViewById(R.id.textViewTitle);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mClickListener.onItemClick(v, getAdapterPosition());
                }
            });
        }

        public void setOnClickListener(BeratHolder.ClickListener clickListener) {
            mClickListener = clickListener;
        }

        public void setName(String name) {
            tvFrag12.setText(name);
        }

        public void setText(String text) {
            tvFrag11.setText(text);
        }

        public void setAbjad(String title) {
            tvTitle.setText(title);
        }

        public interface ClickListener {
            void onItemClick(View view, int position);
        }

    }
}
