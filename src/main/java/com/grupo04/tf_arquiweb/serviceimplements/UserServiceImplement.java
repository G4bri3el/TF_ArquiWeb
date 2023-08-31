package com.grupo04.tf_arquiweb.serviceimplements;


import com.grupo04.tf_arquiweb.entities.User;
import com.grupo04.tf_arquiweb.repositories.IUserRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;


    @Override
    public void insert(User user) {
        uR.save(user);
    }
}
