package com.example.android.recyclerviewexample.screen.RecyclerView;


/**
 * Exposes the data to be used in the RecyclerView screen.
 */

public class RecyclerViewViewModel implements RecyclerViewContract.ViewModel {

    private RecyclerViewContract.Presenter mPresenter;

    public RecyclerViewViewModel() {
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
    public void setPresenter(RecyclerViewContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
