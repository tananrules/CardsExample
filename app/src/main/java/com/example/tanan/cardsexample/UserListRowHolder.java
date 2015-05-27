package com.example.tanan.cardsexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class UserListRowHolder extends RecyclerView.ViewHolder {

    protected TextView login;

    public UserListRowHolder(View itemView) {
        super(itemView);
        this.login = (TextView) itemView.findViewById(R.id.login);
    }
}
