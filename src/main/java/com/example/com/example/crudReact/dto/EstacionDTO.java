package com.example.com.example.crudReact.dto;

import com.example.com.example.crudReact.model.Espacio;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;


public class EstacionDTO {

    @Setter
    @Getter
    private Long idEstacion;

    @NotEmpty(message = "Nombre de estacion requerido")
    @Size(max = 100, message = "Nombre de estacion excedido (max: 100)")
    @Getter
    @Setter
    private String nombre;

    @Setter
    @Getter
    private Long lineaPadre;

    @Getter
    @Setter
    private List<Espacio> espacios;

    public EstacionDTO(){}

    public EstacionDTO(Long idEstacion, String nombre, Long lineaPadre, List<Espacio> espacios){
        this.idEstacion = idEstacion;
        this.nombre = nombre;
        this.lineaPadre = lineaPadre;
        this.espacios = espacios;
    }

}