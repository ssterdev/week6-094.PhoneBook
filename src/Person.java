public class Person {
	
	private String name;
	private String number;

	
	public Person (String nm,String nmbr){
		this.name = nm;
		this.number = nmbr;
	}	
	
	public String toString() {
		return this.name + "number: "+ this.number;
	}
	
	public String getName() {
		return this.name;
	}		
	
	public String getNumber(){
		return this.number;
	}
	
	public void changeNumber (String newnumber){
		this.number = newnumber;
	}

}


