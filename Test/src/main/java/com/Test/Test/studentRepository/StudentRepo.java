package com.Test.Test.studentRepository;

import com.Test.Test.studentDTO.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<StudentDTO,Integer> {
    public StudentDTO findBystuname(String stuname);

    @Modifying
    @Transactional
    @Query(value = "delete from studentdto where stuname=?1",nativeQuery = true)
    public void deleteBystuname(String stuname);

    @Modifying
    @Transactional
    @Query(value = "update studentdto set stuid=?1,stuphone=?2,stuemail=?3 where stuname=?4",nativeQuery = true)
    public void updateBystuname(int stuid,String stuphone,String stuemail,String stuname);

    public List<StudentDTO> findBystunameEndingWith(String stuname);
}
