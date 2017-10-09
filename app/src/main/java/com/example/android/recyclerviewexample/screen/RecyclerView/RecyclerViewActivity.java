package com.example.android.recyclerviewexample.screen.RecyclerView;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.recyclerviewexample.R;
import com.example.android.recyclerviewexample.databinding.ActivityRecyclerviewBinding;

/**
 * RecyclerView Screen.
 */
public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerViewContract.ViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = new RecyclerViewViewModel();

        RecyclerViewContract.Presenter presenter =
                new RecyclerViewPresenter(mViewModel);
        mViewModel.setPresenter(presenter);

        ActivityRecyclerviewBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_recyclerview);
        binding.setViewModel((RecyclerViewViewModel) mViewModel);
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
