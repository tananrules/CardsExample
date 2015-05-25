package com.example.tanan.cardsexample;

import java.util.List;

import retrofit.http.GET;

public interface GithubUserService {
    @GET("/users")
    public List<User> getUsers();
}
