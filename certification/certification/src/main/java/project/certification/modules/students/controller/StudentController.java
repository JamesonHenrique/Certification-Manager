package project.certification.modules.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.certification.modules.students.dto.VerifyHasCertificationDTO;
import project.certification.modules.students.service.VerifyIfHasCertificationService;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private VerifyIfHasCertificationService verifyIfHasCertificationService;
    @PostMapping("/verifyIfHasCertification")
    public ResponseEntity<String> verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        var result = verifyIfHasCertificationService.execute(verifyHasCertificationDTO);
        if (result) {
            return new ResponseEntity<>("Usuário ja fez a prova",HttpStatus.OK);
        }
        return new ResponseEntity<>("Usuário pode fazer a prova",HttpStatus.OK);
    }
}
