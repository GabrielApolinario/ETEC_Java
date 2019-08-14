import javax.swing.JOptionPane;

public class Calc {

	private int valor1;
	private int valor2;

	public Calc()	{

	}

	public Calc(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public void Somar () {
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo valor"));
		System.out.println("O resultado da Soma entre " + valor1 + " e " + valor2 + " é = " + (valor1+valor2));
	}

	public void Subtracao () {
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo valor"));
		System.out.println("O resultado da Subtração entre  " + valor1 + " e " + valor2 + " é  = " + (valor1-valor2));

	}

	public void Multiplicacao () {
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo valor"));
		System.out.println("O resultado da Multiplicação entre " + valor1 + " e " + valor2 + " é = " + (valor1*valor2));

	}	

	public void Divisao () {
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo valor"));
		System.out.println("O resultado da Divisão entre " + valor1 + " e " + valor2 + " é = "  + (valor1/valor2));
	}

}




