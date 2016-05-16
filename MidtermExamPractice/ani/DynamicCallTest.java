class Animal {
	void sound(){
		System.out.println("animal Å¬·¡½ºÀÇ sounds()");
	}
}
class Dog extends Animal{
	void sound(){
		System.out.println("¸í¸Û");
	}
class Cat extends Animal {
	void sound() {
		System.out.println("¾ß¿Ë");
	}
}
}
public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal obj;
		
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();

	}

}
