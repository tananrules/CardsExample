package com.example.tanan.cardsexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UserListRowHolder extends RecyclerView.ViewHolder {

    protected ImageView ivAvatarUrl;
    protected TextView tvLogin;

    public UserListRowHolder(View itemView) {
        super(itemView);
        this.tvLogin = (TextView) itemView.findViewById(R.id.tvLogin);
        this.ivAvatarUrl = (ImageView) itemView.findViewById((R.id.ivAvatarUrl));
    }
}
