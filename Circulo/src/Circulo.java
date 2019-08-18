import javax.swing.JOptionPane;

public class Circulo {

	// Atributos
	private double raio;

	// Getters, Setters e construtor
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	// Metodos especificos

	public void menuCirculo() {
		System.out.println("--------------------------------");
		System.out.println("1 - Cadastrar circulo");
		System.out.println("2 - Exibir diametro do circulo");
		System.out.println("3 - Exibir o perimetro do circulo");
		System.out.println("4 - Exibir a area do circulo");
		System.out.println("5 - Sair");
		System.out.println("--------------------------------");
		String option = JOptionPane.showInputDialog("Escolha uma das op��es:");
		switch (option) {
		case "1":
			cadastraCirculo();
			break;
		case "2":
			calculaDiametro();
			break;
		case "3":
			calculaPerimetro();
			break;
		case "4":
			calculaArea();
			break;
		case "5":
			System.exit(0);
		}

	}

	public void cadastraCirculo() {
		this.raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio do circulo!"));
		System.out.println("Valor atual do circulo: " + this.getRaio());
	}

	public void calculaDiametro() {
		if (this.getRaio() > 0) {
			System.out.println("O diametro do circulo �: " + this.getRaio() * 2);
		} else {
			// System.out.println("� Necessario realizar o cadastro do circulo antes de
			// calcular seu diametro.");
		}
	}

	public void calculaPerimetro() {
		double pi = 3.1416;
		if (this.getRaio() > 0) {
			System.out.println("O perimetro do circulo �: " + (pi * 2) * this.getRaio());
		} else {
			System.out.println("� Necessario realizar o cadastro do circulo antes de calcular seu perimetro.");
		}
	}

	public void calculaArea() {
		double pi = 3.1416;
		if (this.getRaio() > 0) {
			System.out.println("A area do circulo �: " + pi * (this.getRaio() * this.getRaio()));
		} else {
			System.out.println("� Necessario realizar o cadastro do circulo antes de calcular sua area.");
		}
	}
}
