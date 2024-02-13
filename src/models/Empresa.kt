package models

class Empresa (var nombre: String, var nit: Int, var direccion: String,
               var empleados: MutableList<Empleado> = mutableListOf(),
               var clientes: MutableList<Cliente> = mutableListOf()){

    //CRUD de los empleados

    fun registrarEmpleado(empleado: Empleado){
        empleados.add(empleado)
    }

    fun buscarEmpleado(documento: String): Empleado?{
        for (empleado in empleados){
            if (empleado.documento == documento){
                return empleado
            }
        }
        return null
    }

    fun editarEmpleado(empleado: Empleado, nombre: String, salario: Int, dependencia: String, fechaIngreso: Int,
                       cargo: Cargo){
        empleado.nombre = nombre
        empleado.salarioUnico = salario
        empleado.dependencia = dependencia
        empleado.fechaIngreso = fechaIngreso
        empleado.cargo = cargo
    }

    fun eliminarEmpleado(empleado: Empleado){
        empleados.remove(empleado)
    }

    //CRUD de los clientes

    fun registrarCliente(cliente: Cliente){
        clientes.add(cliente)
    }

    fun buscarCliente(documento: String): Cliente?{
        for (cliente in clientes){
            if (cliente.documento == documento){
                return cliente
            }
        }
        return null
    }

    fun editarCliente(cliente: Cliente, nombre: String, direccion: String, telefono: String){
        cliente.nombre = nombre
        cliente.direccion = direccion
        cliente.telefono = telefono
    }

    fun eliminarCliente(cliente: Cliente){
        clientes.remove(cliente)
    }

    //Funciones de la empresa

    fun obtenerNominaEmpresa(): Int{
        return empleados.sumBy { it.salarioUnico }
    }

    fun obtenerNominaDependencia(dependencia: String): Int{
        return empleados.filter { it.dependencia == dependencia }.sumBy { it.salarioUnico }
    }

    fun obtenerPorcentajeClientesHombres(): Double{
        val totalClientes = clientes.size
        val clientesHombres = clientes.filter { it.sexo == 'M' }.size
        return (clientesHombres.toDouble() / totalClientes.toDouble()) * 100
    }

    fun obtenerPorcentajeClientesMujeres(): Double{
        val totalClientes = clientes.size
        val clientesMujeres = clientes.filter { it.sexo == 'F' }.size
        return (clientesMujeres.toDouble() / totalClientes.toDouble()) * 100
    }

    fun obtenerCantEmpleadosCargo(cargo: Cargo): Int{
        return empleados.filter { it.cargo == cargo }.size
    }

    fun obtenerEmpleadoMasAntiguo(): Empleado?{
        return empleados.minByOrNull { it.fechaIngreso }
    }

}