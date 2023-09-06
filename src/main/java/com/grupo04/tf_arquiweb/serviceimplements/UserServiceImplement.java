package com.grupo04.tf_arquiweb.serviceimplements;


import com.grupo04.tf_arquiweb.entities.Usuarios;
import com.grupo04.tf_arquiweb.repositories.IUserRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;


    @Override
    public void insert(Usuarios user) {
        uR.save(user);
    }

    @Override
    public List<Usuarios> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int UserID) {
        uR.deleteById(UserID);
    }
}
