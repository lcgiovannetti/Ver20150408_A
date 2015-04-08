package viaggi;

public class ViaggioDiNozze extends Pacchetto{
int divorzi;
	
	public ViaggioDiNozze(String ID, String descrizione, int postiTotali, int divorzi){
		super(ID, descrizione, postiTotali);
		if(divorzi>=0){
			this.divorzi=divorzi;
		}
		else{
			System.out.println("Il numero dei divorzi non deve essere negativo");
		}
	}
	
	public int getDivorzi() {
		return divorzi;
	}

}
