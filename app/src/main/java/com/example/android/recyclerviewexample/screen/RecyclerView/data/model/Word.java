package com.example.android.recyclerviewexample.screen.RecyclerView.data.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by VinhTL on 09/10/2017.
 */

public class Word implements Parcelable {
    private String word;

    public Word() {
    }
    
    public Word(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    protected Word(Parcel in) {
        this.word = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(word);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Word> CREATOR = new Parcelable.Creator<Word>() {
        @Override
        public Word createFromParcel(Parcel in) {
            return new Word(in);
        }

        @Override
        public Word[] newArray(int size) {
            return new Word[size];
        }
    };
}
