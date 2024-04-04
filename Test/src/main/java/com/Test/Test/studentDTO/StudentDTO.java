package com.Test.Test.studentDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

    @Id
    private Integer stuid;
    private String stuname;
    private String stuphone;
    private String stuemail;
}
