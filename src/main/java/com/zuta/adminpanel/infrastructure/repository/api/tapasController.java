package com.zuta.adminpanel.infrastructure.repository.api;

import com.zuta.adminpanel.application.tapasService;
import com.zuta.adminpanel.infrastructure.repository.types.tapaDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/tapa")
public class tapasController {

    private final tapasService tapasService;


    @Autowired
    public tapasController(com.zuta.adminpanel.application.tapasService tapasService) {
        this.tapasService = tapasService;
    }


    @PostMapping("")
    public ResponseEntity<?> crearTapa(@RequestBody tapaDO tapaDO) {

        this.tapasService.guardarTapa(tapaDO);

        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTapa(@PathVariable("id") int id) {

        this.tapasService.eliminarTapa(id);

        return ResponseEntity.ok().build();

    }


    @GetMapping("")
    public ResponseEntity<?> listaTapas() {

        return ResponseEntity.ok(this.tapasService.listaTapas());

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarTapa(@PathVariable("id") int id){

        return ResponseEntity.ok(this.tapasService.buscarTapa(id));

    }

    @GetMapping("/tipos")
    public List listaTipos() {

        return this.tapasService.tiposTapas();
    }


}
