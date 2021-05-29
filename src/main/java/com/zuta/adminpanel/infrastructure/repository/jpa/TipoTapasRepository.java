package com.zuta.adminpanel.infrastructure.repository.jpa;

import com.zuta.adminpanel.domain.tipoTapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTapasRepository extends JpaRepository<tipoTapa, Integer> {
}
