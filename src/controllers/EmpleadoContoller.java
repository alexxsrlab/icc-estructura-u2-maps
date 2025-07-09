package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    EmpleadoDao empleadoDao;

    public EmpleadoContoller(EmpleadoDao empleadoDao) {
        this.empleadoDao = empleadoDao;
    }

    public void agregarEmpleado(Empleado emp){
        empleadoDao.add(emp);
    }

    public void listarEmps(){
        empleadoDao.list();
    }

    public void removerEmps(int id){
        empleadoDao.delete(id);
    }
}