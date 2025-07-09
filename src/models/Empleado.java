package models;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Empleado empleado = (Empleado) o;
        return id == empleado.id && Objects.equals(name, empleado.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int compareTo(Empleado otro) {
        int comparacionId = Integer.compare(id, otro.id);
        if (comparacionId != 0) {
            return comparacionId;
        }
        return name.compareTo(otro.getName());
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

}