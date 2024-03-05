package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Contacto que representa la información de contacto de una persona
 * Contiene el nombre del contacto y una lista de numeros de telefono asociados
 */
public class Contacto {
    private String name; //Nombre del contacto
    private List<String> phones; //Lista de numeros de telefono del contacto

    /**
     * Constructor para crear un nuevo contacto
     *
     * @param name Nombre del contacto
     * @param phone Numero de telefono inicial del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Devuelve el nombre del contacto
     *
     * @return El nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Devuelve la lista de numeros de telefono del contacto
     *
     * @return una lista de numeros de telefono asociados al contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}