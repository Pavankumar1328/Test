package com.Test.Test.DAO;

import com.Test.Test.Entity.DTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DAO extends JpaRepository<DTO,Integer> {

 @Modifying
 @Transactional
 @Query(value = "update dto set empname=?1,empphone=?2,empemail=?3 where empid=?4",nativeQuery = true)
 public void updateByempId(String empname,String empphone,String empemail,int empid);

}
