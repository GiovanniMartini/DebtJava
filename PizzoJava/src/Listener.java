import java.awt.*;
import java.awt.event.*;
import java.util.Collections;

import javax.swing.*;

public class Listener implements ActionListener{
	
	GuiPizzoJava Grafica;
	

	public Listener(GuiPizzoJava grafica) {
		this.Grafica = grafica;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==this.Grafica.aggiungi){
			Persona p = new Persona(this.Grafica.nome.getText(),this.Grafica.cognome.getText(),Integer.parseInt(this.Grafica.debito.getText()));
			this.Grafica.default_model.addElement(p);
			System.out.println("aggiungi");
			//if(this.Grafica.switcher == 1){
				//Collections.sort(this.Grafica.default_model);
			//}
			int i;
			int somma = 0;
			for(i=0;i<this.Grafica.default_model.getSize();i++){
				somma = somma + this.Grafica.default_model.getElementAt(i).getBebito();
			}
			this.Grafica.totale.setText(String.valueOf(somma));
		} else if(e.getSource()==this.Grafica.rimuovi){
			this.Grafica.default_model.removeElement(this.Grafica.lista_Persona.getSelectedValue());
			System.out.println("rimuovi");
			int i;
			int somma = 0;
			for(i=0;i<this.Grafica.default_model.getSize();i++){
				somma = somma + this.Grafica.default_model.getElementAt(i).getBebito();
			}
			this.Grafica.totale.setText(String.valueOf(somma));
		}
		if(e.getSource()==this.Grafica.radio_nome){
			this.Grafica.switcher = 1;
		}
		
	}
	
}
