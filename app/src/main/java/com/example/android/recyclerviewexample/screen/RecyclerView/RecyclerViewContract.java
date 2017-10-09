package com.example.android.recyclerviewexample.screen.RecyclerView;


import com.example.android.recyclerviewexample.screen.RecyclerView.base.BasePresenter;
import com.example.android.recyclerviewexample.screen.RecyclerView.screen.BaseViewModel;

/**
 * This specifies the contract between the view and the presenter.
 */
interface RecyclerViewContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel<Presenter> {
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter {
    }
}
