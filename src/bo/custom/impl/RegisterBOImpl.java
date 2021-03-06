package bo.custom.impl;

/*
 *@author Rajith Sanjayan
 *Sipsewana-institute-Student-Register-System
 *12/23/2021
 */

import bo.custom.RegisterBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.RegisterDAOImpl;
import dto.ProgramDTO;
import dto.StudentDTO;
import entity.Program;
import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class RegisterBOImpl implements RegisterBO {
    RegisterDAOImpl registerDAOImpl = DAOFactory.getInstance().getDAO(DAOType.REGISTER);


    @Override
    public List<ProgramDTO> findAll() throws Exception {
        List<Program> all = registerDAOImpl.findAll();
        ArrayList<ProgramDTO> dtoList = new ArrayList<>();

        ProgramDTO programDTO = null;

        for (Program program : all) {
            dtoList.add(new ProgramDTO(
                    program.getId(),
                    program.getName(),
                    program.getDuration(),
                    program.getFee()
            ));
        }
        return dtoList;
    }

    @Override
    public boolean add(StudentDTO studentDTO) {
        return registerDAOImpl.add(new Student(
                studentDTO.getId(),
                studentDTO.getName(),
                studentDTO.getbDay(),
                studentDTO.getSex(),
                studentDTO.getAddress(),
                studentDTO.getSchool(),
                studentDTO.getProgram(),
                studentDTO.getContact()
        ));
    }
}
