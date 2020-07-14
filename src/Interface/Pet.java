package Interface;

public interface Pet extends Animal {

	public default void brincar() {
		System.out.println("Pet está brincando.");
	}
}