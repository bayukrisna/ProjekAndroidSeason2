package id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.DataAdapter;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.R;
import id.sch.smktelkom_mlg.project2.xirpl10816242534.oeripbedjoe.Recycler.AdapterFragment2;

import static android.content.ContentValues.TAG;

/**
 * Created by user on 17/11/2016.
 */

public class Fragment2 extends Fragment {

    AdapterFragment2 mIDataAdapterFrag2;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessagesDatabaseReference;
    private ChildEventListener mChildEventListener;
    private List<DataAdapter> mDataMains;

    //Menjadikan fragment_2 layout yang dimiliki oleh Fragment2.java
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, null);
        return v;
    }

    public List<DataAdapter> getmDataMains() {
        return mDataMains;
    }

    //Membuat RecyclerView
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mMessagesDatabaseReference = mFirebaseDatabase.getReference().child("berat");

        mDataMains = new ArrayList<>();
        final RecyclerView mRecycler = (RecyclerView) getView().findViewById(R.id.mRecyclerFrag1);
        mRecycler.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mIDataAdapterFrag2 = new AdapterFragment2(this.getActivity(), mDataMains);
        mRecycler.setAdapter(mIDataAdapterFrag2);

        mChildEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if (dataSnapshot != null && dataSnapshot.getValue() != null) {
                    try {
                        DataAdapter model = dataSnapshot.getValue(DataAdapter.class);

                        mDataMains.add(model);
                        mRecycler.scrollToPosition(mDataMains.size() - 1);
                        mIDataAdapterFrag2.notifyItemInserted(mDataMains.size() - 1);
                    } catch (Exception ex) {
                        Log.e(TAG, ex.getMessage());
                    }
                }
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
        mMessagesDatabaseReference.addChildEventListener(mChildEventListener);
    }


    //Mengisikan Data


    //Memberi Nama Tab
    public String toString() {
        return "Fragment 2";
    }
}
