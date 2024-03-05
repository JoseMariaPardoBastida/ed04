package org.example;

public class agendaContactos {

    private static Agenda agendaContactos; // Variable para almacenar la agenda de contactos

    public static void main(String[] args) {
        initAgenda(); // Inicializa y manipula la agenda de contactos

        // Imprimir todos los contactos de la agenda después de las operaciones.
        System.out.println("Todos los contactos: ");
        for (Persona c : agendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente y realizar otras modificaciones.
        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : agendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    public static void initAgenda() {
        // Crear una nueva agenda.
        agendaContactos = new Agenda();

        // Añadir contactos a la agenda.
        agendaContactos.addContact("John Doe", "1234567890");
        agendaContactos.addContact("Jane Doe", "9876543210");
        agendaContactos.addContact("Mary Jane", "1122334455");

        // Modificaciones adicionales para mostrar el cambio en el estado de la agenda:
        // Añadir un nuevo teléfono a un contacto existente.
        agendaContactos.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agendaContactos.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agendaContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");
    }
}
