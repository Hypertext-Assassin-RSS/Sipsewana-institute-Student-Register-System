package bo.custom.impl;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *1/1/2022
 */

import bo.custom.Student_ProgramBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.Student_ProgramDAOImpl;
import dto.Student_ProgramDTO;
import entity.Student_Program;

public class Student_ProgramBOImpl implements Student_ProgramBO {

    Student_ProgramDAOImpl studentProgramDAO = DAOFactory.getInstance().getDAO(DAOType.STUDENT_PROGRAM);

    @Override
    public boolean add(Student_ProgramDTO studentProgramDTO) {
        return studentProgramDAO.add(new Student_Program(
                studentProgramDTO.getId(),
                studentProgramDTO.getsId(),
                studentProgramDTO.getsName(),
                studentProgramDTO.getpName()
        ));
    }
}
