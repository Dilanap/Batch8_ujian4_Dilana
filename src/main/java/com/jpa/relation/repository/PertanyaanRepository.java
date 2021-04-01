package com.jpa.relation.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.relation.entity.Pertanyaan;


public interface PertanyaanRepository extends JpaRepository <Pertanyaan, Long> {

}