/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Project {
    
    private int id;
    private String nombre;
    private List<String> tareas;

    public Project(String nombre) {
        
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    // Métodos para obtener los valores de los atributos
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getTareas() {
        return tareas;
    }

    // Método para agregar una tarea a la lista
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    // Método para mostrar la información del proyecto
    @Override
    public String toString() {
        return "Proyect{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tareas=" + tareas +
                '}';
    }

    }
   

