package com.nando.entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder(toBuilder = true)
public class Persona {
    private final int edad;
}
