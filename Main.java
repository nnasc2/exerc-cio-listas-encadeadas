public class Main {
	
		static void ler(No no) {
			if(no != null) {
				System.out.println(no.pessoa.nome);
				ler(no.noDireta);
			}
		}

	public static void main(String[] args) {
		
		No no1 = new No(null, new Pessoa("João Carlos"));
		No no5 = new No(null, new Pessoa("João Eduardo"));
		No no3 = new No(null, new Pessoa("João Lucas"));
		No no2 = new No(null, new Pessoa("João Pedro"));
		No no4 = new No(null, new Pessoa("João Vitor"));

		
		no1.noDireta = no2;
		no1.noDireta.noDireta = no3;
		no1.noDireta.noDireta.noDireta = no4;
		no1.noDireta.noDireta.noDireta.noDireta = no5;
		
		ler(no1);
	}

}

