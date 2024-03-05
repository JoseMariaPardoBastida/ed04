package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Contacto que representa la información de contacto de una persona.
 * Contiene el nombre del contacto y una lista de números de teléfono asociados.
 */
public class Persona {
    private String name; // Nombre del contacto
    private List<String> phones; // Lista de números de teléfono del contacto

    /**
     * Constructor para crear un nuevo contacto.
     *
     * @param name Nombre del contacto.
     * @param phone Número de teléfono inicial del contacto.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Devuelve el nombre del contacto.
     *
     * @return El nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Establece un nuevo nombre para el contacto.
     *
     * @param name El nuevo nombre del contacto.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la lista de números de teléfono del contacto.
     *
     * @return Una lista de números de teléfono asociados al contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * Añade un número de teléfono a la lista del contacto.
     *
     * @param phone El número de teléfono a añadir.
     */
    public void addPhone(String phone) {
        if (!this.phones.contains(phone)) { // Evita duplicados
            this.phones.add(phone);
        }
    }

    /**
     * Elimina un número de teléfono de la lista del contacto.
     *
     * @param phone El número de teléfono a eliminar.
     */
    public void removePhone(String phone) {
        this.phones.remove(phone);
    }

    /**
     * Modifica un número de teléfono existente del contacto.
     * Reemplaza un teléfono antiguo con uno nuevo en la lista.
     *
     * @param oldPhone El número de teléfono a reemplazar.
     * @param newPhone El nuevo número de teléfono.
     */
    public void modifyPhone(String oldPhone, String newPhone) {
        int index = this.phones.indexOf(oldPhone);
        if (index != -1) { // Si el teléfono antiguo existe
            this.phones.set(index, newPhone); // Reemplaza con el nuevo número
        }
    }
}
