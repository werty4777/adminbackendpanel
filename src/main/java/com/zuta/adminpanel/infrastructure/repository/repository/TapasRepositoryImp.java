package com.zuta.adminpanel.infrastructure.repository.repository;

import com.zuta.adminpanel.domain.TapasRepo;
import com.zuta.adminpanel.domain.tapa;
import com.zuta.adminpanel.infrastructure.repository.jpa.TapasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class TapasRepositoryImp implements TapasRepo {



    private final TapasRepository tapasRepository;

    @Autowired
    public TapasRepositoryImp(TapasRepository tapasRepository) {
        this.tapasRepository = tapasRepository;
    }


    @Override
    public void guardarTapa(tapa tapa) {

        this.nonNull(tapa);


        this.tapasRepository.save(tapa);


    }


    private void nonNull(Object ob) {
        if (ob == null) {
            throw new RuntimeException("error objeto no puede ser nulo");
        }
    }


    @Transactional(rollbackOn = Exception.class)
    @Override
    public void eliminarTapa(int idTapa) {


        try {
            this.tapasRepository.deleteById(idTapa);
        } catch (Exception exception) {
            throw new RuntimeException("error al eliminar tapa");
        }


    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public void actualizarTapa(int idTapa) {

    }

    @Override
    public List listaTapas() {


        return this.tapasRepository.findAll();

    }

    @Override
    public tapa buscarTapa(int idTapa) {
        return this.tapasRepository.findById(idTapa).get();
    }
}
