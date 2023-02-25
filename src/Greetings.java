public class Greetings {
	@DevAnnotation(DevName = "Jhon", DevSurname = "Walker")
	public void sayWelcome() {
		System.out.println("Welcome!");
	}

	@DevAnnotation(DevName = "Mark", DevSurname = "Brown")
	public void sayGoodbye(){
		System.out.println("Goodbye!");
	}
}
