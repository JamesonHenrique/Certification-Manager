package project.certification.modules.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.certification.modules.students.dto.VerifyHasCertificationDTO;
import project.certification.modules.students.repository.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationService {
    @Autowired
    private CertificationStudentRepository certificationStudentRepository;
    public boolean execute(VerifyHasCertificationDTO dto) {
        var result = certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(),
                dto.getTechnology());
        if (!result.isEmpty()) {
            return true;
        }
        return false;
    }

}
