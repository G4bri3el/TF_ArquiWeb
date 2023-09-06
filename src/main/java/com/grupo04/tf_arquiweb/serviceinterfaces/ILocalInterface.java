package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Local;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface ILocalInterface {

    public void insert(Local local);
    public List<Local> list();
    public void delete(int LocalID);


}
