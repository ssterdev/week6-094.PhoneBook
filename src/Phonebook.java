import java.util.*;

public class Phonebook {

	private ArrayList<Person> phonebook = new ArrayList<Person>();	

	public void add (String name, String number) {
		Person test = new Person(name,number);
		this.phonebook.add(test);		
	}	

	public void printAll() {
		for (Person i : phonebook){
			System.out.println(i);
		}
	}
        
        public String searchNumber (String name) {
            for (Person members : phonebook){
                if (members.getName() == name){
                    return members.getNumber();
                }
                
            }
            return "number not known";
        }

}

