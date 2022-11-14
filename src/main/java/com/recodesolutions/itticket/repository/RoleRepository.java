package com.recodesolutions.itticket.repository;

import com.recodesolutions.itticket.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {


    Set<Role> findByNameIn(List<String> roles);


}