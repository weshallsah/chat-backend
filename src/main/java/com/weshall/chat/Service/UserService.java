package com.weshall.chat.Service;

import com.weshall.chat.Repo.UserRepo;
import com.weshall.chat.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public user Register(user user){
        return repo.save(user);
    }

//    public user Login(user user){
//
//    }
}
