package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela_Pessoa implements ActionListener{

	JFrame tela = new JFrame("Cadastrar Pessoa");
	JPanel painel = new JPanel();
	// labels
	JLabel lbnome = new JLabel("Nome: ");
	JLabel lbidade = new JLabel("Idade: ");
	JLabel lbsal = new JLabel("Sal�rio: ");
	//campos texto
	JTextField txtnome = new JTextField();
	JTextField txtidade = new JTextField();
	JTextField txtsal = new JTextField();
	//bot�es
	JButton btsalvar = new JButton("Salvar");
	JButton btlistar = new JButton("Listar");
	JButton btcancelar = new JButton("Cancelar");
	
	String nome = "";
	Double sal = 0.0;
	Integer idade = 0;
	
	Pessoa pes = new Pessoa();
	
	void criarTela() {
		tela.setSize(350, 250); // tam da tela
		tela.setLocation(250, 250);
		painel.setLayout(null);
		
		lbnome.setBounds(30, 10, 100, 30);
		txtnome.setBounds(110, 10, 140, 30);
		lbidade.setBounds(30, 50, 100, 30);
		txtidade.setBounds(110, 50, 140, 30);
		lbsal.setBounds(30, 90, 100, 30);
		txtsal.setBounds(110, 90, 140, 30);
		
		btsalvar.setBounds(10, 150, 90, 30);
		btsalvar.addActionListener(this);//a��o
		btlistar.setBounds(120, 150, 90, 30);
		btlistar.addActionListener(this);//a��o
		btcancelar.setBounds(230, 150, 90, 30);
		btcancelar.addActionListener(this);//a��o
		
		painel.add(lbnome);
		painel.add(txtnome);
		painel.add(lbidade);
		painel.add(txtidade);
		painel.add(lbsal);
		painel.add(txtsal);
		painel.add(btsalvar);
		painel.add(btlistar);
		painel.add(btcancelar);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true); // tornar a teka vis�vel
	}//fim criar tela
	
	public static void main(String[] args) {
		Tela_Pessoa tp = new Tela_Pessoa();
		tp.criarTela();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btsalvar) {
			nome = txtnome.getText();
			idade = Integer.parseInt(txtidade.getText());
			sal = Double.parseDouble(txtsal.getText());
			pes.setNome(nome);
			pes.setIdade(idade);
			pes.setSalario(sal);
			
			JOptionPane.showMessageDialog(null, "Dados Salvo com Sucesso !!");
			
			txtnome.setText("");
			txtidade.setText("");
			txtsal.setText("");
		}//if do salvar
		
		if(e.getSource() == btlistar) {
			JOptionPane.showMessageDialog(null, "##LISTANDO OS DADOS ##\n"
					+ "O nome: "+pes.getNome()
					+ "\nA idade: "+pes.getIdade()
					+ "\nO sal�rio: "+pes.getSalario());
		}//fim do listar
		
		if(e.getSource() == btcancelar) {
			tela.dispose();
		}
	}


}