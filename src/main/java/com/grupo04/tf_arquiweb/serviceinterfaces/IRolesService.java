package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Roles;

import java.util.List;

public interface IRolesService {

    public void insert(Roles roles);
    public List<Roles> list();

    public void delete(int rolesId);

}
