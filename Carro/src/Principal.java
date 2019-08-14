public class Principal {

	public static void main(String[] args) {
		Carro car = new Carro("Gol", "Volkswagen", 4, 0);
		
		car.ligar();
		car.subirMarcha(2);
		car.descerMarcha(2);
		car.status();
	}

}
