package br.com.carlospepato.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.carlospepato.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute(VerifyHasCertificationDTO dto) {
        if(dto.getEmail().equals("carlos.pepato@gmail.com") && dto.getTechnology().equals("JAVA")){
           return true;
        }
        return false;
    }
}
