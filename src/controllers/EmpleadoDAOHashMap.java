package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDao {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void list() {
        for (Empleado e : empleados.values()){ 
            System.out.println(e);
        }
    }

    @Override
    public void delete(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }
    
}
