import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.EmpleadoDao;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Ariel Badillo"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        
    }
/* 
    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();

        System.out.println("HASMAP");
        mapa.runHasMap();
        System.out.println("LINKED HASHMAP");
        mapa.runLinkedHashMap();
        System.out.println("TREEMAP");
        mapa.runTreeMap();
        System.out.println("HASHMAPOBJ");
        mapa.runHashMapObj();
        System.out.println("RUNTREEMAPOBJ");
        mapa.runTreeMapObj();
    }
*/

    private static void runEmpleadoExample() {
        EmpleadoDao empDaoHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empControllerHash = new EmpleadoContoller(empDaoHash);
        EmpleadoDao empDaoTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empControllerTree = new EmpleadoContoller(empDaoTree);

        Empleado emp1 = new Empleado(4,"Pedro", "DEV");
        Empleado emp2 = new Empleado(2,"Pedro", "DEV");
        Empleado emp3 = new Empleado(5,"Juan", "DEV");
        Empleado emp4 = new Empleado(3,"Maria", "DEV");
        Empleado emp5 = new Empleado(1,"Juan", "DEV");

        empControllerHash.agregarEmpleado(emp1);
        empControllerHash.agregarEmpleado(emp2);
        empControllerHash.agregarEmpleado(emp3);
        empControllerHash.agregarEmpleado(emp4);
        empControllerHash.agregarEmpleado(emp5);
        empControllerTree.agregarEmpleado(emp1);
        empControllerTree.agregarEmpleado(emp2);
        empControllerTree.agregarEmpleado(emp3);
        empControllerTree.agregarEmpleado(emp4);
        empControllerTree.agregarEmpleado(emp5);

        System.out.println();
        System.out.println("LISTADO DE EMPLEADOS USANDO HASHMAP");
        empControllerHash.listarEmps();
        System.out.println("SE REMOVIO EL EMPLEADO CON ID 2");
        empControllerHash.removerEmps(2);
        empControllerHash.listarEmps();
        System.out.println();
        System.out.println("LISTADO DE EMPLEADOS USANDO TREEMAP");
        empControllerTree.listarEmps();
        System.out.println("SE REMOVIO EL EMPLEADO CON ID 2");
        empControllerTree.removerEmps(2);
        empControllerTree.listarEmps();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
