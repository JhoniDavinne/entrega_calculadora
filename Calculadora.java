package calculadora;

import javax.swing.*;

public class Calculadora2 {
 public static void main(String[] args){
	 int a,b;
	 
	 a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro para somar:"));
	 b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro"));
	 JOptionPane.showMessageDialog(null,a+" + "+b+" = "+(a+b));
	 
	 System.out.println(0);
 }
}