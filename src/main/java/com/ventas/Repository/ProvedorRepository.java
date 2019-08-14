package com.ventas.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.Entity.ProvedorEntity;

public interface ProvedorRepository extends JpaRepository<ProvedorEntity, Serializable> {

}
