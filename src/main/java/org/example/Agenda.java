package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase Agenda que representa una agenda telefónica
 * Contiene operaciones para añadir, eliminar y modificar contactos
 */
public class Agenda {
    // Lista de contactos en la agenda
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor para crear una nueva Agenda
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un nuevo contacto a la agenda o un nuevo teléfono a un contacto existente
     * @param name Nombre del contacto a añadir
     * @param phone Telefono del contacto a añadir
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda basandose en el nombre
     *
     * @param name Nombre del contacto a eliminar
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifina el numero de telefono de un contacto existente
     *
     * @param name Nombre del contacto cuyo número se desea modificar
     * @param oldPhone El numero de telefono antiguo que se desea remplazar
     * @param newPhone El nuevo numero de telefono que se desea establecer
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
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
     * Obtiene la lista de todos los contactos en la agenda
     *
     * @return Lista de todos los contactos
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}