package com.zuta.adminpanel.application.Imp;

import com.zuta.adminpanel.application.tapasService;
import com.zuta.adminpanel.domain.TapasRepo;
import com.zuta.adminpanel.domain.tapa;
import com.zuta.adminpanel.domain.tipoTapasRepo;
import com.zuta.adminpanel.infrastructure.repository.repository.TapasRepositoryImp;
import com.zuta.adminpanel.infrastructure.repository.types.tapaDO;
import com.zuta.adminpanel.infrastructure.repository.types.tiposTapaDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TapasServiceImp implements tapasService {


    private final TapasRepo tapasRepository;
    private final tipoTapasRepo tipoTapasRepositor;

    @Autowired
    public TapasServiceImp(TapasRepositoryImp tapasRepositoryImp, tipoTapasRepo tipoTapasRepositoryImp) {
        this.tapasRepository = tapasRepositoryImp;
        this.tipoTapasRepositor = tipoTapasRepositoryImp;
    }

    @Override
    public void guardarTapa(tapaDO tapaDO) {


        tapa tapa = new tapa();
        tapa.setIdTipo(this.tipoTapasRepositor.buscarTipo(tapaDO.getIdTipo()));
        tapa.setStock(tapaDO.getCantidad());
        tapa.setFoto(tapaDO.getFoto());
        tapa.setNombre(tapaDO.getNombre());
        tapa.setColor(tapaDO.getColor());

        this.tapasRepository.guardarTapa(tapa);


    }

    @Override
    public void eliminarTapa(int idTapa) {

        this.tapasRepository.eliminarTapa(idTapa);


    }

    @Override
    public List listaTapas() {
        return this.tapasRepository.listaTapas().stream().map(o -> {
            tapaDO tapaDO = new tapaDO();

            tapaDO.setFoto(o.getFoto());
            tapaDO.setNombre(o.getNombre());

            tapaDO.setId(o.getId());
            return tapaDO;
        }).collect(Collectors.toList());
    }

    @Override
    public List tiposTapas() {
        return this.tipoTapasRepositor.listaTipos().stream().map(o -> {
            tiposTapaDO tiposTapaDO = new tiposTapaDO();
            tiposTapaDO.setId(o.getId());
            tiposTapaDO.setTipo(o.getTipoTapa());
            return tiposTapaDO;
        }).collect(Collectors.toList());
    }

    @Override
    public tapaDO buscarTapa(int id) {

        tapa o = this.tapasRepository.buscarTapa(id);

        tapaDO tapaDO = new tapaDO();
        tapaDO.setCantidad(o.getStock());
        tapaDO.setColor(o.getColor());
        tapaDO.setFoto(o.getFoto());
        tapaDO.setNombre(o.getNombre());
        tapaDO.setTipo(o.getIdTipo().getTipoTapa());
        tapaDO.setId(o.getId());
        return tapaDO;



    }
}
