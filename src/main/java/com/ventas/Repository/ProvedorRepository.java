package com.ventas.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventas.Entity.ProvedorEntity;

@Repository("ProvedorRepository")
public interface ProvedorRepository extends JpaRepository<ProvedorEntity, Serializable> {

}
