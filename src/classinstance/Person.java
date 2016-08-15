package classinstance;

public class Person {
	
	int age;
	
	public Person(int initialAge) {
		if (initialAge >= 0){
			this.age = initialAge;	
		}else{
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}
	
	public int yearPasses (int age){
		age = age +1;
		return age;
	}
	
	public void amIOld(int age){
		if (age < 13){
			System.out.println("You are young.");
		}else if (age >= 13 && age < 18){
			System.out.println("You are teenager.");
		}else {
			System.out.println("You are old.");
		}
	}

}
