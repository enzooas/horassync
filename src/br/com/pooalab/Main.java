package br.com.pooalab;

import br.com.pooalab.horassync.service.GestorHorasService;
import br.com.pooalab.horassync.ui.MenuConsole;

public class Main {
    public static void main(String[] args) {
        GestorHorasService gestorService = new GestorHorasService();
        MenuConsole menu = new MenuConsole(gestorService);
        menu.iniciar();
    }
}