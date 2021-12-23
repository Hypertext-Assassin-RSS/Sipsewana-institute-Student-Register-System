package bo.custom.impl;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/17/2021
 */

import bo.custom.ProgramBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.ProgramDAOImpl;
import dto.ProgramDTO;
import entity.Program;

public class ProgramBOImpl implements ProgramBO {

    ProgramDAOImpl programDAO = DAOFactory.getInstance().getDAO(DAOType.PROGRAM);

    @Override
    public boolean add(ProgramDTO programDTO) {
        return  programDAO.add(new Program(
                programDTO.getId(),
                programDTO.getName(),
                programDTO.getDuration(),
                programDTO.getFee()
        ));
    }
}
