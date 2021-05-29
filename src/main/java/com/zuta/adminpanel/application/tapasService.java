package com.zuta.adminpanel.application;

import com.zuta.adminpanel.infrastructure.repository.types.tapaDO;

import java.util.List;

public interface tapasService {

    void guardarTapa(tapaDO tapa);

    void eliminarTapa(int idTapa);

    List listaTapas();

    List tiposTapas();


    tapaDO buscarTapa(int id);
}
