package com.example.android.recyclerviewexample.screen.RecyclerView;

/**
 * Listens to user actions from the UI ({@link RecyclerViewActivity}), retrieves the data and updates
 * the UI as required.
 */
final class RecyclerViewPresenter implements RecyclerViewContract.Presenter {
    private static final String TAG = RecyclerViewPresenter.class.getName();

    private final RecyclerViewContract.ViewModel mViewModel;

    public RecyclerViewPresenter(RecyclerViewContract.ViewModel viewModel) {
        mViewModel = viewModel;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }
}
