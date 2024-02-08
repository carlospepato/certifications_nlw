package br.com.carlospepato.certification_nlw.modules.students.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifyHasCertificationDTO {
    
    private String email;
    private String technology;
}
