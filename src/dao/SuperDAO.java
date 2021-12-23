package dao;


import entity.SuperEntity;

import java.util.List;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

public interface SuperDAO <Entity extends SuperEntity>{
    public boolean add (Entity entity);

    public List<Entity> findAll() throws Exception;
}
