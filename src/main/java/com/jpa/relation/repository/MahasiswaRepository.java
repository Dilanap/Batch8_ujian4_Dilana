package com.jpa.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.relation.entity.Mahasiswa;


public interface MahasiswaRepository extends JpaRepository <Mahasiswa, Long> {

}