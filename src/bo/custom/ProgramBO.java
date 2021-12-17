package bo.custom;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import bo.SuperBO;
import dto.ProgramDTO;

public interface ProgramBO extends SuperBO {
    public boolean add(ProgramDTO programDTO);
}
