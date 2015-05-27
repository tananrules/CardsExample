package com.example.tanan.cardsexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

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
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, parent, false);
        UserListRowHolder rh = new UserListRowHolder(v);
        return rh;
    }

    @Override
    public void onBindViewHolder(UserListRowHolder holder, int position) {
        User user = userList.get(position);

        Picasso.with(mContext).load(user.avatar_url).into(holder.ivAvatarUrl);
        holder.tvLogin.setText(user.login);
    }

    @Override
    public int getItemCount() {
        return (userList != null ? userList.size() : 0);
    }
}
