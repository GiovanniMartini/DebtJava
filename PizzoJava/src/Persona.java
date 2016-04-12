
public class Persona{

	private String nome;
	private String cognome;
	private int debito;
	
	
	public Persona(String nome, String cognome, int bebito) {
		this.nome = nome;
		this.cognome = cognome;
		this.debito = bebito;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getBebito() {
		return debito;
	}


	public void setBebito(int bebito) {
		this.debito = bebito;
	}


	@Override
	public String toString() {
		return nome + " " + cognome + " "  + debito + "\n" ;
	}

	/**
	@Override
	public int compareTo(Object o) {
		if(get)
		return 0;
	}
	*/
	/**
	public static void main(String[] args) {
		Persona p = new Persona( "Giovani", "Martini", 100);
		
		System.out.println(p);

	}
	*/
	
	
}
