import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;


public class GuiPizzoJava extends JFrame{

	/**
	 * @param args
	 */
	
	public int somma = 0;
	
	public static int switcher = 0;
	
	public static void main(String[] args) {
		GuiPizzoJava gui = new GuiPizzoJava();

	}
	
	//Creo la lista di Persona
	public DefaultListModel<Persona> default_model = new DefaultListModel<Persona>();
	//public DefaultLis default_model = new ArrayList();
	public JList<Persona> lista_Persona = new JList<Persona>(default_model);
	
	//Label e TextField
	public JLabel label_nome = new JLabel("Nome");
	public TextField nome = new TextField(10);
	public JLabel label_cognome = new JLabel("Cognome");
	public TextField cognome = new TextField(10);
	public JLabel label_debito = new JLabel("Debito");
	public TextField debito = new TextField(10);
	public JLabel label_totale = new JLabel("Debito Totale");
	public TextField totale = new TextField(10);
	
	
	//Panel
	public JPanel text_panel = new JPanel( new GridLayout(6,1));
	public JPanel radio_panel = new JPanel( new GridLayout(3,1));
	public JPanel top_panel = new JPanel( new BorderLayout());
	public JPanel down_panel = new JPanel();

	
	//RadioButton
	public JRadioButton radio_nome = new JRadioButton("Ordina per Nome");
	public JRadioButton radio_cognome = new JRadioButton("Ordina per Cognome");
	public JRadioButton radio_debito = new JRadioButton("Ordina per Debito");
	public ButtonGroup sort_group = new ButtonGroup();
	
	//Button
	public JButton aggiungi = new JButton("Aggiungi");
	public JButton rimuovi = new JButton("Rimuovi");
	
	GridBagLayout GridBaglayout = new GridBagLayout();
	GridBagConstraints coor_aggiungi = new GridBagConstraints();
	GridBagConstraints coor_rimuovi = new GridBagConstraints();
	GridBagConstraints coor_jlist = new GridBagConstraints();
	
	JScrollPane scrollPane = new JScrollPane();
	
	public Listener Azione = new Listener(this);
	
	public GuiPizzoJava(){
		
		super("Pizzo Calculator Lite");
		setLayout(new BorderLayout());
		
		this.setSize( 500, 500);
		
		text_panel.add(label_nome);
		text_panel.add(nome);
		text_panel.add(label_cognome);
		text_panel.add(cognome);
		text_panel.add(label_debito);
		text_panel.add(debito);
		
		sort_group.add(radio_nome);
		sort_group.add(radio_cognome);
		sort_group.add(radio_debito);
		
		radio_panel.add(radio_nome);
		radio_panel.add(radio_cognome);
		radio_panel.add(radio_debito);
		
		
		top_panel.add(text_panel, BorderLayout.WEST);
		top_panel.add(radio_panel, BorderLayout.EAST);
			
		//Grid Bag Layout
		down_panel.setLayout(GridBaglayout);
		coor_aggiungi.gridx = 0;
		coor_aggiungi.gridy = 0;
		coor_rimuovi.gridx = 4;
		coor_rimuovi.gridy = 0;
		
		down_panel.add(aggiungi, coor_aggiungi);
		down_panel.add(rimuovi, coor_rimuovi);
		
		
		this.aggiungi.addActionListener(Azione);
		this.rimuovi.addActionListener(Azione);
		
		scrollPane.setViewportView(lista_Persona);
		
		
		this.getContentPane().add(top_panel, BorderLayout.NORTH);
		this.getContentPane().add(down_panel,BorderLayout.CENTER);
		this.getContentPane().add(scrollPane,BorderLayout.SOUTH);
		this.getContentPane().add(totale, BorderLayout.EAST);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	

}
