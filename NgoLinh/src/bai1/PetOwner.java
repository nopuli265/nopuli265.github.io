package bai1;
 class Pet {
	int age;
	float weight;
	float height;
	String color;
	public void sleep() {
		System.out.println("спокойной ночи! До завтра");
	}
	public void eat() {
		System.out.println("я очень голоден, дай поесть!");
	}
	public String say(String aWord){
	String petResponse = " Ну ладно !!"+ aWord;
	return petResponse;
	}
}

public class PetOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String petReaction;
		Pet myPet= new Pet();
		myPet.eat();
		petReaction=myPet.say(" кот");
		System.out.println(petReaction);
		myPet.sleep();
	}

}
