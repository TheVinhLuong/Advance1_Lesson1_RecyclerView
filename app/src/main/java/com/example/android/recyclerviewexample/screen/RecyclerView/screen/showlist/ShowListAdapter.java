package com.example.android.recyclerviewexample.screen.RecyclerView.screen.showlist;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.android.recyclerviewexample.R;
import com.example.android.recyclerviewexample.databinding.ItemShowListBinding;
import com.example.android.recyclerviewexample.screen.RecyclerView.data.model.Word;
import com.example.android.recyclerviewexample.screen.RecyclerView.screen.BaseRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VinhTL on 09/10/2017.
 */

public class ShowListAdapter extends BaseRecyclerViewAdapter<ShowListAdapter.ItemViewHolder> {
    private List<Word> mWords;
    private BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Word> mItemClickListener;
    
    protected ShowListAdapter(Context context, List<Word> words){
        super(context);
        mWords = new ArrayList<>();
        if(words != null){
            mWords.addAll(words);
        }
    }

    public void setItemClickListener(OnRecyclerViewItemClickListener<Word> itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemShowListBinding binding = 
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_show_list,parent, false);
        return new ItemViewHolder(binding, mItemClickListener);
    }

  
    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bind(mWords.get(position));
    }
    
    @Override
    public int getItemCount() {
        return mWords.size();
    }
    


    class ItemViewHolder extends RecyclerView.ViewHolder{
        private ItemShowListBinding mBinding;
        private BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Word> mItemClickListener;
       
        public ItemViewHolder (ItemShowListBinding binding,
                BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Word> listener) {
            super(binding.getRoot());
            mBinding = binding;
            mItemClickListener = listener;
        }
        
        void bind(Word word){
            mBinding.setItem(word);
            mBinding.setItemListener(mItemClickListener);
            mBinding.executePendingBindings();
        }
    }
}
