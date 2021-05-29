package com.zuta.adminpanel.infrastructure.repository.jpa;

import com.zuta.adminpanel.domain.tapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TapasRepository extends JpaRepository<tapa,Integer> {
}
