import atuendo.Atuendo;
import prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    /*
    5ta Iteracion:
    Anteriormente tenia una clase Ropero que modelaba el conjunto de Atuendos
    que el usuario generaba a partir de sus prendas, y ofrecia las sugerencias
    segun las condiciones climaticas

    Ahora con el requerimiento de guardarropas compartido, creo que la mejor alternativa
    sera borrar la clase ropero, y llevar los atuendos directamente al usuario, delegando
    el tema del clima a una nueva clase Asesor de Imagen, que lleve a cabo las sugerencias.
    Podria tomar mi clase Ropero como guardarropas, pero el tema ahi es que no estoy
    seguro de que cada guardarropas para su criterio especifico tenga sus atuendos especificos
    tambien. Prefiero que el usuario posea todos los atuendos separados de las ropas por
    categoria.
    De todas formas esta es una decision de diseño que se puede modificar mas adelante,
    pero con la informacion que tenemos ahora creo que tiene mas sentido modelarlo asi.
     */
    private List<Atuendo> atuendos;
    private List<Guardarropas> misGuardarropas;

    public Usuario() {
        atuendos = new ArrayList<>();
        misGuardarropas = new ArrayList<>();
    }

    public void agregarAtuendo(Atuendo atuendo){
        atuendos.add(atuendo);
    }

    public void agregarGuardarropas(Guardarropas guardarropas){
        misGuardarropas.add(guardarropas);
    }

    public void crearGuardarropasCompartido(Usuario usuarioACompartir, String tagGuardarropas){
        Guardarropas guardarropasCompartido = new Guardarropas(tagGuardarropas);

        this.agregarGuardarropas(guardarropasCompartido);
        usuarioACompartir.agregarGuardarropas(guardarropasCompartido);
    }
}

/*
Req, 5ta iteracion
-Otro usuario me proponga tentativamente poder agregar una prenda al guardarropas
-Otro usuario me proponga tentativamente poder quitar una prenda del guardarropas
-Debo poder ver todas las propuestas recibidas, para poder aceptarlas o rechazarlas
-Quiero poder deshacer las propuestas que haya aceptado
 */