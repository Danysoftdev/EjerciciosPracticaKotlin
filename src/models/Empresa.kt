package models

class Empresa (var nombre: String, var nit: Int, var direccion: String,
               var empleados: MutableList<Empleado> = mutableListOf(),
               var clientes: MutableList<Cliente> = mutableListOf()){
}