package com.example.superbad.domain.user.model;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String userId;
    private final String nickname;
    private final String password;

    public User(UUID id, String userId, String nickname, String password){
        this.id = id;
        this.userId = userId;
        this.nickname = nickname;
        this.password = password;
    }
}
