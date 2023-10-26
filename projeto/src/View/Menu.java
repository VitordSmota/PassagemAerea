package View;
import Model.*;

import javax.swing.*;
public class Menu extends JFrame{
    private Aviao[] aeronaves = new Aviao[10];
    private int aeronavesCounts = 0;

    private Voo[] voos = new Voo[10];
    private int voosCounts = 0;

    JMenuBar barra = new JMenuBar();

    JMenuBar systemParameter = new JMenuBar("Parâmetros do Sistema");
    JMenuBar ticketReservation= new JMenuBar("Reserva de Passagens");



}
