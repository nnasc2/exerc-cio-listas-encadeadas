public class No{
	//No noEsquerda;
	Pessoa pessoa;
	No noDireta;
	
	No (No no, Pessoa pessoa){
		this.noDireta = no;
		this.pessoa = pessoa;
	}
}


