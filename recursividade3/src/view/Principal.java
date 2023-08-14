package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fatCont = new FatorialController();
		
		do {
			try {
				String input = JOptionPane.showInputDialog("digite um número até 12: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				int num = Integer.parseInt(input);
				if (num <= 12) {
					JOptionPane.showMessageDialog(null, "fatorial de " + num + " = " + fatCont.fatorial(num));
				} else {
					JOptionPane.showMessageDialog(null, "numéro maior que o limite de entrada");
					continue;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "número inválido");
				continue;
			}
			break;
		} while(true);
	}
}