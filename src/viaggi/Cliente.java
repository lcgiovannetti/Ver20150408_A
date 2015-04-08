package viaggi;

public class Cliente {
	private String nome;
	private String cognome;
	private String email;
	public Cliente(String nome, String cognome, String email) {
		if(nome.length()<=0){
			System.out.println("La lunghezza del nome deve essere maggiore di 0");
		}
		else{
			this.nome = nome;
		}
		if(cognome.length()<=0){
			System.out.println("La lunghezza della descrizione deve essere maggiore di 0");
		}
		else{
			this.cognome = cognome;
		}
		if(email.length()<=0){
			System.out.println("La lunghezza della descrizione deve essere maggiore di 0");
		}
		else{
			this.email = email;
		}

	}
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + "]";
	}
	
}
