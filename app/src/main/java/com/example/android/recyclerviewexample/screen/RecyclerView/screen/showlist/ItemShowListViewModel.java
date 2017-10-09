package com.example.android.recyclerviewexample.screen.RecyclerView.screen.showlist;

import android.databinding.BaseObservable;
import com.example.android.recyclerviewexample.screen.RecyclerView.data.model.Word;
import com.example.android.recyclerviewexample.screen.RecyclerView.screen.BaseRecyclerViewAdapter;

/**
 * Created by VinhTL on 09/10/2017.
 */

public class ItemShowListViewModel extends BaseObservable{
    private static final String TAG = ItemShowListViewModel.class.getSimpleName();
    private Word mWord;
    private BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Word> mItemClickListener;

    public ItemShowListViewModel(Word mWord, BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Word> mItemClickListener) {
        this.mWord = mWord;
        this.mItemClickListener = mItemClickListener;
    }
    
    public String getWord(){
        return mWord.getWord();
    }

    public BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Word> getItemClickListener() {
        return mItemClickListener;
    }

    public void setItemClickListener(
            BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Word> itemClickListener) {
        mItemClickListener = itemClickListener;
    }
    
}

