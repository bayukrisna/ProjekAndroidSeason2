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
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment1;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.ViewActivity;

import static android.content.ContentValues.TAG;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment1 extends Fragment {

    public static final String LINK_FRA_1 = "link_fra_1";
    public static final String ID_FRA_1 = "id_fra_1";
    FirebaseRecyclerAdapter mAdapter;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessagesDatabaseReference;
    private ChildEventListener mChildEventListener;
    private ArrayList<DataAdapter> mDataMains = new ArrayList<>();
    private AdapterFragment1 mAdapterFragment1;

    //menjadikan fragment_1 layout yang dimiliki oleh Fragment1.java
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, null);
        return v;
    }


    public ArrayList<DataAdapter> getmDataMains() {
        return mDataMains;
    }

    //Membuat RecyclerView ketika activity dibuat
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mMessagesDatabaseReference = mFirebaseDatabase.getReference().child("ringan");
        final RecyclerView mRecycler = (RecyclerView) getView().findViewById(R.id.mRecyclerFrag1);
        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child("ringan");

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
        mRef.addChildEventListener(mChildEventListener);

        mRecycler.setHasFixedSize(true);
        mRecycler.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        LinearLayoutManager mLayoutManager = (LinearLayoutManager) mRecycler.getLayoutManager();
        mAdapter = new FirebaseRecyclerAdapter<DataAdapter, RingantHolder>(DataAdapter.class, R.layout.fragment1list, RingantHolder.class, mRef) {
            @Override
            public void populateViewHolder(RingantHolder ringanViewHolder, DataAdapter data, int position) {
                ringanViewHolder.setName(data.getTitle());
                ringanViewHolder.setText(data.getDesc());
                ringanViewHolder.setAbjad(data.getTitle().substring(0, 1));
            }

            @Override
            public RingantHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                RingantHolder viewHolder = super.onCreateViewHolder(parent, viewType);
                viewHolder.setOnClickListener(new RingantHolder.ClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(getActivity(), ViewActivity.class);
                        intent.putExtra(LINK_FRA_1, mDataMains.get(position));
                        intent.putExtra(ID_FRA_1, 1);
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
        return "Fragment 1";
    }

    public static class RingantHolder extends RecyclerView.ViewHolder {
        public RingantHolder.ClickListener mClickListener;
        TextView tvFrag12;
        TextView tvFrag11;
        TextView tvTitle;

        public RingantHolder(View itemView) {
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

        public void setOnClickListener(RingantHolder.ClickListener clickListener) {
            mClickListener = clickListener;
        }

        public void setName(String name) {
            tvFrag12.setText(name);
        }

        public void setAbjad(String title) {
            tvTitle.setText(title);
        }

        public void setText(String text) {
            tvFrag11.setText(text);
        }

        public interface ClickListener {
            void onItemClick(View view, int position);
        }
    }


}
