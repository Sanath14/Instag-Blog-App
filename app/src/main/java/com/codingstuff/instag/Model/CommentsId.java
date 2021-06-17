package com.codingstuff.instag.Model;

import androidx.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

public class CommentsId {
    @Exclude
    public String ComentsId;

    public <T extends CommentsId>  T withId (@NonNull final String id){
        this.ComentsId = id;
        return (T) this;
    }

}
