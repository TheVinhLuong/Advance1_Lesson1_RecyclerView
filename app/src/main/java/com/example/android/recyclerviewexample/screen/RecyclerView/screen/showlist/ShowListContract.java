package com.example.android.recyclerviewexample.screen.RecyclerView.screen.showlist;


import com.example.android.recyclerviewexample.screen.RecyclerView.data.model.Word;
import com.example.android.recyclerviewexample.screen.RecyclerView.screen.BasePresenter;
import com.example.android.recyclerviewexample.screen.RecyclerView.screen.BaseViewModel;

/**
 * This specifies the contract between the view and the presenter.
 */
interface ShowListContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel<Presenter> {
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter {
        void onItemWordClicked(Word word);
    }
}
