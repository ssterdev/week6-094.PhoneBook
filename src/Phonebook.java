import java.util.*;

public class Phonebook {

	private ArrayList<Person> phonebook = new ArrayList<Person>();	

	public void Add (String name, String number) {
		Person test = new Person(name,number);
		this.phonebook.add(test);		
	}	

	public void printAll() {
		for (Person i : phonebook){
			System.out.println(i);
		}
	}

}

