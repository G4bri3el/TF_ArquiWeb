package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Resena;

import java.util.List;

public interface IResenaService {
    public void insert(Resena resena);
    public List<Resena> list();
    public void delete(int resena);

}
