package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> menu = new ArrayList<>();
        menu.add("Pizza");
        menu.add("Hamburguesa");
        menu.add("Pasta");

        Restaurante miRestaurante = new Restaurante("Buena mesa", "Comidas Rapidas", "Carrera 57a 22 -35", 50, "09:00", "23:00", 10, menu);

        miRestaurante.mostrarMenu();
        miRestaurante.reservarMesa(2);

        List<String> pedido = new ArrayList<>();
        pedido.add("Pizza");
        pedido.add("Hamburguesa");
        miRestaurante.calcularFactura(pedido);
    }
}
    