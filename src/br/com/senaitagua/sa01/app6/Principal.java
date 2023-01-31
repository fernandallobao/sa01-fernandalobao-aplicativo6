package br.com.senaitagua.sa01.app6;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa01.bo.PrecoTotalBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resp1 = JOptionPane.showInputDialog("Informe o valor unitario da peça:");
		String resp2 = JOptionPane.showInputDialog("Informe o quantidade de peças:");
		
		double valorUnitario = Double.parseDouble(resp1);
		double nPecas = Double.parseDouble(resp2);
		
		PrecoTotalBO pbo = new PrecoTotalBO();
		
		JOptionPane.showMessageDialog(null, "O valor total sera de R$" + pbo.precoTotal(valorUnitario, nPecas));
	}

}
