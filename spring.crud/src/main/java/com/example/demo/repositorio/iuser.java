package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.user;


public interface iuser  extends JpaRepository<user,Long>{

}
