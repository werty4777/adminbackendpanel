package com.zuta.adminpanel.domain;

import java.util.List;

public interface tipoTapasRepo {


    tipoTapa buscarTipo(int idTipo);

    List<tipoTapa> listaTipos();

}
