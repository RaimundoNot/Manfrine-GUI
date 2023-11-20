package entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vetor {

	public static ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

	void inserir(Pessoa pessoa) {
		Pessoa p1 = new Pessoa();
		p1.setNome(pessoa.getNome());
		p1.setIdade(pessoa.getIdade());
		p1.setSalario(pessoa.getSalario());
		JOptionPane.showMessageDialog(null, "Dados Salvo com Sucesso !!");
		lista.add(p1);
	}

	void listar() {
		if (lista.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lista Vazia !!");
		} else {
			for (Pessoa p : lista) {
				JOptionPane.showMessageDialog(null,
						"Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nSalario: R$ " + p.getSalario());
			}
		}
	}
}
