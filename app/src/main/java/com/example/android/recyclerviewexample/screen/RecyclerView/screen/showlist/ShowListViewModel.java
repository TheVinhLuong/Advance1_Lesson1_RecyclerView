package com.example.android.recyclerviewexample.screen.RecyclerView.screen.showlist;

import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;
import com.example.android.recyclerviewexample.screen.RecyclerView.data.model.Word;
import com.example.android.recyclerviewexample.screen.RecyclerView.screen.BaseRecyclerViewAdapter;


public class ShowListViewModel extends BaseObservable implements ShowListContract.ViewModel,
        BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Word>{
    
    private static final String TAG = ShowListViewModel.class.getSimpleName();
    private ShowListContract.Presenter mPresenter;

    public ShowListAdapter mAdapter;
    
    public ShowListViewModel(ShowListAdapter adapter) {
        mAdapter = adapter;
        mAdapter.setItemClickListener(this);
    }

    public ShowListAdapter getAdapter() {
        return mAdapter;
    }
    
    

    public void setAdapter(ShowListAdapter adapter) {
        mAdapter = adapter;
    }

    @Override
    public void onStart() {
        mPresenter.onStart();
    }

    @Override
    public void onStop() {
        mPresenter.onStop();
    }

    @Override
    public void setPresenter(ShowListContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onItemRecyclerViewClick(View v, Word item) {
        Log.d(TAG, item.getWord());
        mPresenter.onItemWordClicked(item);
    }
}
