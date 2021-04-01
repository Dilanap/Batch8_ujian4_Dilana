package com.jpa.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.relation.entity.Admin;

public interface AdminRepository extends JpaRepository <Admin, Long> {

}
