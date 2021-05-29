package com.zuta.adminpanel.domain;

import javax.persistence.*;

@Entity(name = "tapas")
public class tapa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne(targetEntity = tipoTapa.class)
    @JoinColumn(name = "id_tipo")
    private tipoTapa idTipo;


    private String nombre;

    @Column(length = 500000)
    private String foto;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public tipoTapa getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(tipoTapa idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int cantidad) {
        this.stock = cantidad;
    }
}
