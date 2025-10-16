package itson.org.examen_pagoluz;

import controlador.Controlador;
import controlador.IControlador;
import java.util.ArrayList;
import modelo.Banco;
import modelo.BaseDatos;
import modelo.Pago;
import vista.ControlVista;

/**
 *
 * @author daniel
 */
public class Examen_PagoLuz {

    public static void main(String[] args) {
        BaseDatos baseDatos = new BaseDatos();
        Pago modelo = new Pago(baseDatos, new Banco(), new ArrayList<>());
        IControlador control = new Controlador(modelo);
        ControlVista.getInstancia().setControl(control);
        ControlVista.getInstancia().setClientes(new ArrayList<>());
        ControlVista.getInstancia().mostrarFrmClientes();
        modelo.addSuscriptor(ControlVista.getInstancia());
    }
}
