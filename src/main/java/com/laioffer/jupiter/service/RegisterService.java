package com.laioffer.jupiter.service;

import com.laioffer.jupiter.dao.RegisterDao;
import com.laioffer.jupiter.entity.database.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RegisterService {

    @Autowired
    private RegisterDao registerDao;

    public boolean register(User user) throws IOException {
        return registerDao.register(user);
    }
}
