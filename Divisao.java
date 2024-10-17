package unidadeUm;

import javax.swing.JOptionPane;

public class Divisao {
	public static void main(String[] args) {
		
		String resposta;
		int numero1;
		int numero2;
		int quociente;
		
		resposta = JOptionPane.showInputDialog("Digite o primeiro número.");
		numero1 = Integer.parseInt(resposta);
		
		resposta = JOptionPane.showInputDialog("Digite o segundo número.");
		numero2 = Integer.parseInt(resposta);
		
		quociente = numero1 / numero2;
				
		JOptionPane.showMessageDialog(null, "O valor de " + numero1 + " ÷ " + numero2 + " é " + quociente + ".");
	}
}