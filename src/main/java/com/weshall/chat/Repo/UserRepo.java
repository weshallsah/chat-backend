package com.weshall.chat.Repo;

import com.weshall.chat.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<user,Integer> {

}
