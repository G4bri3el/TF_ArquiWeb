package com.grupo04.tf_arquiweb.serviceimplements;


import com.grupo04.tf_arquiweb.entities.Roles;
import com.grupo04.tf_arquiweb.repositories.IRolesRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImplement implements IRolesService {
    @Autowired
    private IRolesRepository rR;

    @Override
    public void insert(Roles roles) {
        rR.save(roles);
    }

    @Override
    public List<Roles> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int RolesId) {
        rR.deleteById(RolesId);
    }
}
