import models.Cargo
import models.Cliente
import models.Empleado
import models.Empresa

fun main() {

    //Datos de la empresa

    val nombreEmpresa: String = "Café Quindío"
    val nit: Int = 123456789
    val direccion: String = "Calle 123"

    val empresa = Empresa(nombreEmpresa, nit, direccion)


    //Datos de los cargos

    val gerente = Cargo("Gerente", 1)
    val vendedor = Cargo("Vendedor", 2)
    val maquinista = Cargo("Maquinista", 3)

    //Datos de los empleados

    var empleado1 = Empleado("Juan", "123", 'M', "juan@gmail.com", 2000000, "gerencia", 2020, gerente)
    var empleado2 = Empleado("Dina", "456", 'F', "dina@gmail.com", 1500000, "ventas", 2000, vendedor)
    var empleado3 = Empleado("Pedro", "789", 'M', "pedro@gmail.com", 1000000, "operativo", 2005, maquinista)

    //Registro de subordinados

    empleado1.registrarSubordinado(empleado2)
    empleado2.registrarSubordinado(empleado3)

    //Registro de empleados

    empresa.registrarEmpleado(empleado1)
    empresa.registrarEmpleado(empleado2)
    empresa.registrarEmpleado(empleado3)

    //Registro de clientes

    var cliente1 = Cliente("Ana", "111", 'F', "ana@gmail.com", "Calle 123", "1234567")
    var cliente2 = Cliente("Luis", "222", 'M', "luis@gmail.com", "Calle 456", "7654321")
    var cliente3 = Cliente("María", "333", 'F', "maria@gmail.com", "Calle 789", "9876543")

    //Registro de clientes

    empresa.registrarCliente(cliente1)
    empresa.registrarCliente(cliente2)
    empresa.registrarCliente(cliente3)

    //Obtener valor nómina empresa

    println("La nómina de la empresa es: ${empresa.obtenerNominaEmpresa()}")

    //Obtener valor nómina dependencia

    println("La nómina de la dependencia es: ${empresa.obtenerNominaDependencia("gerencia")}")

    //Obtener porcentaje clientes por sexo

    println("El porcentaje de clientes según el sexo elegido es: ${empresa.obtenerPorcentajeClientesSexo('F')}%")

    //Obtener empleados según el cargo

    println("Los empleados con el cargo de gerente son: ${empresa.obtenerCantEmpleadosCargo(gerente)}")

    //Obtener el empleado más antiguo

    println("El empleado más antiguo es: ${empresa.obtenerEmpleadoMasAntiguo()}")




}