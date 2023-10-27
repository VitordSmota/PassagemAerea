package View;
import Model.*;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private Aviao[] aeronaves = new Aviao[10];
    private int aeronavesCounts = 0;

    private Voo[] voos = new Voo[10];
    private int voosCounts = 0;

    JMenuBar barra = new JMenuBar();

    // barra
    JMenu parametroSistema = new JMenuBar("Parâmetros do Sistema");
    JMenu ticketReservation = new JMenuBar("Reserva de Passagens");
    JMenu end = new JMenu("Sair");

    // representam os submenus
    JMenuItem cadastrarAeronaveItem = new JMenuItem("Cadastrar Aeronave");
    JMenuItem cadastrarVooItem = new JMenuItem("Cadastrar Voo");
    JMenuItem voltarItem = new JMenuItem("Voltar");

    JMenuItem fazerReserva = new JMenuItem("Fazer reserva");
    JMenuItem consultarLugaresVaziosReserva = new JMenuItem("Consultar lugares vazios");
    JMenuItem consultarReservas = new JMenuItem("Consultar reservas realizadas");
    JMenuItem voltarReserva = new JMenuItem("Voltar");

    JMenuItem fecharReserva = new JMenuItem("Fechar");

    Menu menu = this;

    JPanel panelAeronave = new JPanel();
    JPanel panelVoo = new JPanel();
    JPanel panelReserva = new JPanel();
    JPanel panelConsultaLugares = new JPanel();
    JPanel panelConsultaReservas = new JPanel();

    private void hideAllPanels() {
        panelAeronave.setVisible(false);
        panelVoo.setVisible(false);
        panelReserva.setVisible(false);
        panelConsultaLugares.setVisible(false);
        panelConsultaReservas.setVisible(false);
    }

    public Menu() {
        setJMenuBar(barra);
        barra.add(parametroSistema);
        barra.add(ticketReservation);
        barra.add(end);
    }

    // cadastrar aeronave
    parametroSistema.add(cadastrarAeronaveItem);
    cadastrarAeronaveItem.addActionListener(new ActionListener(){
       public void actionPerformed(java.awt.event.ActionEvent event){
           hideAllPanels();
           panelAeronave = new JPanel();
           JLabel labelModelo = new JLabel();
           labelModelo.setText("Modelo da Aeronave: ");
           JText

        }
    });





}