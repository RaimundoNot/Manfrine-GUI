package entities;

import java.util.ArrayList;

public class Pessoa_vetor {
	public static void main(String[] args) {

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		Pessoa p1 = new Pessoa("Maria", 3000.0, 23);
		Pessoa p2 = new Pessoa("Francisca", 7000.0, 30);
		Pessoa p3 = new Pessoa("Marcos", 4000.0, 25);
		Pessoa p4 = new Pessoa("Maria Joaquina", 6000.0, 27);
		Pessoa p5 = new Pessoa("Raimundo Mota", 7500.0, 51);

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);

		System.out.println("Total de dados: " + lista.size());

		System.out.println("\n###A lista de Dados adicionados ###");
		for (Pessoa p : lista) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Salario: R$ " + p.getSalario());
			System.out.println("-------------------------");
		}

		System.out.println("\n\nExibindo o 3o nome informado: " + lista.get(2).getNome());
		lista.remove(1);

		System.out.println("\n###A lista de Dados adicionados ap�s remover o 2o elemento ###");
		for (Pessoa p : lista) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Salario: R$ " + p.getSalario());
			System.out.println("-------------------------");
		}

	}
}
