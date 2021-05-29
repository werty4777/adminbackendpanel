package com.zuta.adminpanel.infrastructure.repository.repository;

import com.zuta.adminpanel.domain.tipoTapa;
import com.zuta.adminpanel.domain.tipoTapasRepo;
import com.zuta.adminpanel.infrastructure.repository.jpa.TipoTapasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TipoTapasRepositoryImp implements tipoTapasRepo {


    private final TipoTapasRepository tipoTapasRepository;

    @Autowired
    public TipoTapasRepositoryImp(TipoTapasRepository tipoTapasRepository) {
        this.tipoTapasRepository = tipoTapasRepository;
    }

    @Override
    public tipoTapa buscarTipo(int idTipo) {
        return this.tipoTapasRepository.findById(idTipo).get();
    }

    @Override
    public List listaTipos() {
        return this.tipoTapasRepository.findAll();
    }
}
