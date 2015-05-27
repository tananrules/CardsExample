package com.example.tanan.cardsexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserListRowHolder> {

    private List<User> userList;
    private Context mContext;

    public UserAdapter(Context mContext, List<User> userList) {
        this.userList = userList;
        this.mContext = mContext;
    }

    @Override
    public UserListRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, null);
        UserListRowHolder rh = new UserListRowHolder(v);
        return rh;
    }

    @Override
    public void onBindViewHolder(UserListRowHolder holder, int position) {
        User user = userList.get(position);
        holder.login.setText(user.login);
    }

    @Override
    public int getItemCount() {
        return (userList != null ? userList.size() : 0);
    }
}
