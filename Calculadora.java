package calculadora;

import javax.swing.*;

public class Calculadora2 {
 public static void main(String[] args){
	 int a,b,aux;
	 
	 aux = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tipo de opera��o que deseja realizar:\n(1) Soma \n(2)Subtra��o \n(0)Sair"));
	
	 	if(aux == 1){
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro para somar:"));
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro"));
			JOptionPane.showMessageDialog(null,a+" + "+b+" = "+(a+b));
		}else if(aux == 2){
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro para subtrair:"));
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro"));
			JOptionPane.showMessageDialog(null,a+" - "+b+" = "+(a-b));
		}else if(aux == 0){
		System.out.println(0);
		}
 }
}