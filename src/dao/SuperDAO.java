package dao;


import entity.SuperEntity;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

public interface SuperDAO <Entity extends SuperEntity>{
    public boolean add (Entity entity);

}
