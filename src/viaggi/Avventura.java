package viaggi;

public class Avventura extends Pacchetto{
	
	int dispersi;
	public Avventura(String ID, String descrizione, int postiTotali, int dispersi){
		super(ID, descrizione, postiTotali);
		if(dispersi>=0){
			this.dispersi=dispersi;
		}
		else{
			System.out.println("Il numero dei dispersi non deve essere negativo");
		}
		
	}
	
	
	public int getDispersi() {
		return dispersi;
	}

}
