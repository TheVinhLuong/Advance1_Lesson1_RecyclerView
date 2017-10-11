package com.example.android.recyclerviewexample.screen.RecyclerView.screen.showlist;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.example.android.recyclerviewexample.R;
import com.example.android.recyclerviewexample.databinding.ActivityShowListBinding;
import com.example.android.recyclerviewexample.screen.RecyclerView.data.model.Word;
import com.example.android.recyclerviewexample.screen.RecyclerView.screen.BaseActivity;
import java.util.ArrayList;

/**
 * RecyclerView Screen.
 */
public class ShowListActivity extends BaseActivity {
    private static final String TAG = ShowListActivity.class.getSimpleName();
    private ShowListViewModel mViewModel;
    private ShowListContract.Presenter presenter;
    private ShowListAdapter showListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("a"));
        words.add(new Word("b"));
        words.add(new Word("c"));
        words.add(new Word("d"));
        words.add(new Word("e"));
        showListAdapter = new ShowListAdapter(this, words);
        mViewModel = new ShowListViewModel(showListAdapter);

        presenter =
                new ShowListPresenter(mViewModel);
        mViewModel.setPresenter(presenter);

        ActivityShowListBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_show_list);
        binding.setViewModel(mViewModel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mViewModel.onStart();
    }

    @Override
    protected void onStop() {
        mViewModel.onStop();
        super.onStop();
    }
}
