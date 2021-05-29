package com.zuta.adminpanel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_tapas")
public class tipoTapa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String tipoTapa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoTapa() {
        return tipoTapa;
    }

    public void setTipoTapa(String tipoTapa) {
        this.tipoTapa = tipoTapa;
    }
}
