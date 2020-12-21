package com.nando.funcional;

import com.nando.entidades.Persona;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@Log
public class Main {
    public static void main(String[] args) {
        Persona persona=Persona.builder().edad(17).build();
        Function<Persona,String> esMayorEdad=Persona->{
            if(Persona.getEdad()>18)
                return "Es mayor de edad";
            return "No es mayor de edad";
        };
        log.info(esMayorEdad.apply(persona));
    }

}
