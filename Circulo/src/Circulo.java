import javax.swing.JOptionPane;

public class Circulo {

	// Atributos
	private double raio;
	private double diametro;
	private double perimetro;
	private double area;

	// Getters, Setters e construtor
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

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
		String option = JOptionPane.showInputDialog("Escolha uma das opções:");
		switch (option) {
		case "1":
			cadastraCirculo();
			menuCirculo();
			break;
		case "2":
			calculaDiametro();
			menuCirculo();
			break;
		case "3":
			calculaPerimetro();
			menuCirculo();
			break;
		case "4":
			calculaArea();
			menuCirculo();
			//StatusCirculo();
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
			System.out.println("O diametro do circulo é: " + (this.getRaio() * 2));
		} else {
			// System.out.println("É Necessario realizar o cadastro do circulo antes de
			// calcular seu diametro.");
		}
	}

	public void calculaPerimetro() {
		double pi = 3.1416;
		if (this.getRaio() > 0) {
			System.out.println("O perimetro do circulo é: " + ((pi * 2) * this.getRaio()));
		} else {
			System.out.println("É Necessario realizar o cadastro do circulo antes de calcular seu perimetro.");
		}
	}

	public void calculaArea() {
		double pi = 3.1416;
		if (this.getRaio() > 0) {
			System.out.println("A area do circulo é: " + pi * (this.getRaio() * this.getRaio()));
		} else {
			System.out.println("É Necessario realizar o cadastro do circulo antes de calcular sua area.");
		}
	}

//	public void StatusCirculo() {
//		System.out.println("Raio do Circulo: " + this.getRaio());
//		System.out.println("Diametro: " + this.getDiametro());
//		System.out.println("Perimetro: " + this.getPerimetro());
//		System.out.println("Area: " + this.getArea());
		
	}

