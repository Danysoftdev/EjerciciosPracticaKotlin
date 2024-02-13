package models

/*
* Clase que representa un cliente
*
* @param direccion: Dirección del cliente
* @param telefono: Teléfono del cliente
 */
class Cliente (nombre: String, documento: String, sexo: Char, correo: String, var direccion: String,
               var telefono: String): Persona(nombre, documento, sexo, correo) {
}