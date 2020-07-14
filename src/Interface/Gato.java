package Interface;

import Interface.Felino;
import Interface.Pet;

public class Gato implements Felino, Pet {
	
	private boolean estaCheio = false;

	@Override
	public void comer() {
		System.out.print("");
	}
	
	@Override
	public void brincar() {
		System.out.println("Gato está brincando");
	}
	
	public boolean isEstaCheio() {
		return estaCheio;
	}

	public void setEstaCheio(boolean estaCheio) {
		this.estaCheio = estaCheio;
	}
	
	
}