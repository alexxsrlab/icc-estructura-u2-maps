package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDao{

    private Map<Empleado, Empleado> empleadosTreeMap;
    
    public EmpleadoDAOTreeMap() {
        this.empleadosTreeMap = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleadosTreeMap.put(emp, emp);
    }

    @Override
    public void list() {
        for (Empleado e : empleadosTreeMap.values()){ 
            System.out.println(e);
        }
    }

    @Override
    public void delete(int id) {
        Empleado temp = new Empleado(id);
        empleadosTreeMap.remove(temp);
    }
    
}
