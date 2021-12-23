package bo.custom;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */

import bo.SuperBO;
import dto.ProgramDTO;

import java.util.List;

public interface RegisterBO extends SuperBO {
    public List<ProgramDTO> findAll() throws Exception;
}
