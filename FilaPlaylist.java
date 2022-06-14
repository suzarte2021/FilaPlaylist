package Fila;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*Dadas uma fila simplesmente encadeada F e
uma pilha encadeada P, construa um programa para ler uma série dos
dados de nome e sexo de pessoas (F-Feminino/M-Masculino), de acordo
com os critérios:
se o sexo lido for feminino, inseri-lo na
fila;
- se o sexo lido for masculino, inseri-lo
na pilha;
- se o sexo lido for R, remover uma pessoa
(se houver) de cada lista e imprimir seus nomes.
O programa deve terminar ao usuário informar a opção que finalize a sua execução.
/*/

public class FilaPlaylist {
	static Stack<String> P = new Stack<String>();
	static Queue<String> F = new LinkedList<String>();
	static Scanner entrada = new Scanner(System.in);
	static int num = 0;
	public static void main(String[] args) {
		if(num == 0) {
			System.out.println("Tela de Inicio Escolha a opção");
			System.out.println("A - Inserir");
			System.out.println("F - Listar a Fila");
			System.out.println("P - Listar a Pilhas inseridas");
			System.out.println("R - Remover");
			System.out.println("S - Sair do Programa");
		}
		num++;
		String outro = entrada.next();
		//Adicionando 
		switch (outro) {
		case "A", "a": {
			addNome();
			break;
		}
		case "F", "f": {
			ListandoFilaF();
			break;
		}
		case "P", "p": {
			ListandoPilha();
			break;
		}
		case "R", "r": {
			RemovendodaListaFila();
			break;
		}
		case "S", "s": {
			System.out.println("Programa finalizado");
			break;
		}
		}
	}
	public static void addNome() {
		String Nome ;
		String Masculino = "";
		String Feminino = "";
		String Sexo;
		System.out.println("Digite o Nome Desejado");
		Nome = entrada.next();
		System.out.println("Se for Feminino digite (F) se for Masculino digite (M)");
		Sexo = entrada.next();
		switch (Sexo) {
		case "M", "m": {
			System.out.println("Este sexo é Masculino");
			Masculino = entrada.next();
			AdicionandonaPilha(Masculino);
			break;
		}
		case "F" , "f": {
			System.out.println("Este sexo é Femino");
			Feminino = entrada.next();
			AdicionarFila(Feminino);
			break;
		}
		}
	}   //Adicionando na Pilha
	public static void AdicionandonaPilha(String Masculino) {//Adicionando o sexo Masculino na Fila
		P.add(Masculino);
		main(null);
	}
	//Adicionando na Fila
	public static void AdicionarFila(String Feminino) { 
		F.add(Feminino); //Adicionando o sexo Feminino na Fila
		main(null);
	} //Listando na Pilha
	public static void ListandoPilha() {
		if(P.isEmpty()) {
			System.out.println("Essa pilha se encontra vazia!!");//Imprimindo a pinha Vazia
			System.out.println("Voltando ao Menu"); // Retornando a tela de Menu
			System.out.println();
			main(null); // Determinando um, valor Vazio
		}else {
			Iterator <String> ListaPilha = P.iterator(); // Imprimindo com Iterator
			System.out.println();
			System.out.print("Pilha: ");
			while (ListaPilha.hasNext()) {
				System.out.print( " " + ListaPilha.next());
				System.out.println();
				main(null); // Determinando um, valor Vazio
			}
		}
	}
	public static void ListandoFilaF() {
		if(F.isEmpty()) {
			System.out.println("Essa Fila  se encontra vazia!!");
			System.out.println("Voltando ao Menu!!");
			System.out.println("");
			main(null);
		}else {
			Iterator <String> ListandoFilaF = F.iterator();
			System.out.println("");
			System.out.print(" Imprimindo a Fila!!");
			while (ListandoFilaF.hasNext()) {
				System.out.print( " " + ListandoFilaF.next());
				System.out.println("");
				main(null); // Determinando um, valor Vazio
			}
		}
	}
	public static void RemovendodaListaFila() {
		P.pop();
		F.poll();
		main(null); // Determinando um, valor Vazio
	}
}





