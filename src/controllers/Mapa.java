package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHasMap() {
        Map<String, String> mapa = new HashMap();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String clave : mapa.keySet()) { /// muestra valores
            System.out.println("Valor: " + mapa.get(clave));
        }

        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));

    }

    public void runLinkedHashMap() {
        /// Crear un mapa con clave numeros y valor nombre de personas
        /// integer
        /// grgen 5 elementos e imprimir todos los Valores
        Map<Integer, String> mapita = new HashMap();

        mapita.put(111, "Juanita");
        mapita.put(112, "Pepe");
        mapita.put(113, "Domenica");
        mapita.put(114, "Sami");
        mapita.put(115, "Vale");

        for (String clave2 : mapita.values()) { /// muestra valores
            System.out.println(clave2);
        }
    }

    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        for (String valor : items.values()) {
            System.out.println(valor);
        }
    }

    public void runHashMapObj(){
        Map<Empleado, Integer> empleados = new HashMap();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);


        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + " - Salario: " + entry.getValue());
        }

    }

    public void runTreeMapObj(){
        Map<Empleado, Integer> empleados1 = new TreeMap<>();
        empleados1.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados1.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados1.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados1.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados1.put(new Empleado(1, "Juan", "Senior"), 3000);

        System.out.println(empleados1);

        

    }

}
