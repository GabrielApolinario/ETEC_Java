
public class Carro {

	// Declarando atributos

	private String modelo;
	private String marca;
	private int nroPortas;
	private int marchaAtual;

	// Metodos Getters, Setters e Construtor

	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 * @param marca
	 * @param nroPortas
	 * @param marchaAtual
	 */
	public Carro(String modelo, String marca, int nroPortas, int marchaAtual) {
		this.modelo = modelo;
		this.marca = marca;
		this.nroPortas = nroPortas;
		this.marchaAtual = marchaAtual;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNroPortas() {
		return nroPortas;
	}

	public void setNroPortas(int nroPortas) {
		this.nroPortas = nroPortas;
	}

	public int getMarchaAtual() {
		return marchaAtual;
	}

	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}

	// Metodos especificos da classe
	public void ligar() {
		System.out.println("O " + getModelo() + " está ligado!");
	}

	public void desligar() {
		System.out.println("O " + getModelo() + " está desligado!");
	}

	public void subirMarcha(int subirMarchas) {
		if (marchaAtual < 5) {
			marchaAtual = marchaAtual + subirMarchas;
			System.out.println("O carro está na marcha " + this.marchaAtual);
		} else {
			System.out.println("Nao foi possivel subir a marcha");
		}

	}

	public void descerMarcha(int descerMarchas) {
		if (marchaAtual >= 0) {
			marchaAtual = marchaAtual - descerMarchas;
			System.out.println("O carro está na marcha " + this.marchaAtual);

		} else {
			System.out.println("Nao foi possivel descer a marcha");
		}
	}
	public void status() {
		System.out.println("--------------------------");
		System.out.println("Detalhes sobre o carro:");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Numero de portas: " + this.nroPortas);
		System.out.println("Marcha atual: " + this.marchaAtual);
		System.out.println("--------------------------");
	}

}
