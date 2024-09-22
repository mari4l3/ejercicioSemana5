package com.example;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
  private String nombre;
    private String tipoCocina;
    private String direccion;
    private int capacidad;
    private String horarioApertura;
    private String horarioCierre;
    private int mesasDisponibles;
    private List<String> menu;

    // Constructor por defecto
    public Restaurante() {
        this.nombre = "Restaurante";
        this.tipoCocina = " Indefindo";
        this.direccion = "Indefinido";
        this.capacidad = 0;
        this.horarioApertura = "00:00";
        this.horarioCierre = "00:00";
        this.mesasDisponibles = 0;
        this.menu = new ArrayList<>();
    }

    // Constructor completo
    public Restaurante(String nombre, String tipoCocina, String direccion, int capacidad, 
                       String horarioApertura, String horarioCierre, int mesasDisponibles, 
                       List<String> menu) {
        this.nombre = nombre;
        this.tipoCocina = tipoCocina;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.mesasDisponibles = mesasDisponibles;
        this.menu = menu;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public int getMesasDisponibles() {
        return mesasDisponibles;
    }

    public void setMesasDisponibles(int mesasDisponibles) {
        this.mesasDisponibles = mesasDisponibles;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }
    
    // Métodos públicos
    public void mostrarMenu() {
        System.out.println("Menú del restaurante " + nombre + ":");
        for (String plato : menu) {
            System.out.println("- " + plato);
        }
    }

    public void reservarMesa(int numeroPersonas) {
        if (mesasDisponibles > 0 && capacidad >= numeroPersonas) {
            mesasDisponibles--;
            System.out.println("Reserva confirmada para " + numeroPersonas + " personas.");
        } else {
            System.out.println("No hay mesas disponibles o la capacidad es insuficiente.");
        }
    }

    public double calcularFactura(List<String> platosPedido) {
        double total = 0;
        for (String plato : platosPedido) {
            total += calcularPrecioPlato(plato);
        }
        System.out.println("Factura del restaurante " + nombre + ":");
        for (String plato : platosPedido) {
            System.out.println(plato + " - Precio: " + calcularPrecioPlato(plato));
        }
        System.out.println("Total: " + total);
        return total;
        }


    // Método privado
    private double calcularPrecioPlato(String nombrePlato) {
        
        switch (nombrePlato.toLowerCase()) {
            case "pizza":
                return 10000.0;
            case "hamburguesa":
                return 35000.0;
            case "pasta":
                return 250000.0;
            default:
                return 0.0;
        

        }
        }
        }
    