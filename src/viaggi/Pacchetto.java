package viaggi;

abstract public class Pacchetto {
	private String ID;
	private String descrizione;
	private int postiTotali;
	public Pacchetto(String ID, String descrizione, int postiTotali) {
		ID = ID;
		if(descrizione.length()==0){
			System.out.println("La lunghezza della descrizione non può essere 0");
		}
		else{
			this.descrizione = descrizione;
		}
		if(ID.length()==0){
			System.out.println("La lunghezza dell'ID non può essere 0");
		}
		else{
			this.postiTotali = postiTotali;
		}
		
	}
	public String getID() {
		return ID;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public int getPostiTotali() {
		return postiTotali;
	}

}
