package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface IAgenda {
    void addContact(String name, String phone);
    void removeContact(String name);
    void modifyPhoneNumber(String name, String oldPhone, String newPhone);
    List<Persona> getContacts();
}

/**
 * Clase Agenda que representa una agenda telefónica.
 * Contiene operaciones para añadir, eliminar y modificar contactos.
 */
public class Agenda implements IAgenda {
    // Lista de contactos en la agenda
    private List<Persona> contacts; // Lista de Personas

    /**
     * Constructor para crear una nueva Agenda.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un nuevo contacto a la agenda o un nuevo teléfono a un contacto existente.
     * @param name Nombre del contacto a añadir.
     * @param phone Teléfono del contacto a añadir.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda basándose en el nombre.
     * @param name Nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica el número de teléfono de un contacto existente.
     * @param name Nombre del contacto cuyo número se desea modificar.
     * @param oldPhone El número de teléfono antiguo que se desea reemplazar.
     * @param newPhone El nuevo número de teléfono que se desea establecer.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de todos los contactos en la agenda.
     * @return Lista de todos los contactos.
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}
