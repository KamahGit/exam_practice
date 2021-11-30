package exam_practice;
class Menus{
	String name;
	int age;
}

public class MenuPracticals {
	public static void main(String[] args) {
		Menus menu = new Menus();
		System.out.println("menu object address "+ menu);
		menu.age = 11;
		menu.name = "John";
		System.out.println("Name: "+menu.name+"\nAge :"+menu.age);
		
	}
	
}
