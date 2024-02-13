package models


/*
* Clase que representa un empleado
*
* @param salarioUnico: Salario del empleado
* @param dependencia: Dependencia del empleado
* @param fechaIngreso: Fecha de ingreso del empleado
* @param empleadosSubordinados: Empleados subordinados del empleado
* @param cargo: Cargo del empleado
 */
class Empleado (nombre: String, documento: String, sexo: Char, correo: String,
                var salarioUnico: Int, var dependencia: String, var fechaIngreso: Int, var cargo: Cargo,
                var empleadosSubordinados: MutableList<Empleado> = mutableListOf()): Persona(nombre, documento, sexo, correo){

    fun registrarSubordinado(empleado: Empleado){
        empleadosSubordinados.add(empleado)
    }

    fun eliminarSubordinado(empleado: Empleado){
        empleadosSubordinados.remove(empleado)
    }

}