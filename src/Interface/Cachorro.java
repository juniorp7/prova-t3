package Interface;

import Interface.Canino;
import Interface.Pet;

public class Cachorro implements Canino, Pet{

	private boolean estaCheio = false;

	@Override
	public void comer() {
		System.out.print("");
	}
	
	@Override
	public void brincar() {
		System.out.println("Cachorro está brincando");
	}
	
	public boolean isEstaCheio() {
		return estaCheio;
	}

	public void setEstaCheio(boolean estaCheio) {
		this.estaCheio = estaCheio;
	}
}