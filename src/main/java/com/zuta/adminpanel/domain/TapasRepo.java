package com.zuta.adminpanel.domain;

import java.util.List;

public interface TapasRepo {


    void guardarTapa(tapa tapa);

    void eliminarTapa(int idTapa);

    void actualizarTapa(int idTapa);

    List<tapa> listaTapas();

    tapa buscarTapa(int idTapa);

}
