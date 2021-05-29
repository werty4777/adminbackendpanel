package com.zuta.adminpanel;

import com.zuta.adminpanel.domain.tipoTapa;
import com.zuta.adminpanel.infrastructure.repository.jpa.TipoTapasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminpanelApplication implements CommandLineRunner {


    @Autowired
    private TipoTapasRepository tipoTapasRepository;


    public static void main(String[] args) {
        SpringApplication.run(AdminpanelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        this.tipoTapasRepository.deleteAll();

        tipoTapa tipo = new tipoTapa();
        tipo.setTipoTapa("corchos");
        tipoTapa tipo2 = new tipoTapa();
        tipo2.setTipoTapa("chapas");

        this.tipoTapasRepository.save(tipo);
        this.tipoTapasRepository.save(tipo2);

    }
}
