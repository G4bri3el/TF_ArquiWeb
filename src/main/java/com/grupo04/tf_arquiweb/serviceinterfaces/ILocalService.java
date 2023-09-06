package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Local;

import java.util.List;

public interface ILocalService {

    public void insert(Local local);
    public List<Local> list();
    public void delete(int LocalId);


}
