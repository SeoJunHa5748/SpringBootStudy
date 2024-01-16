package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SiteUser;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {

}
