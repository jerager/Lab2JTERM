
public class UsePerson {

    public static void main(String[] args) {

	Person john = new Person();

	john.setAge(34);
	john.firstName = "John";
	john.lastName = "Rager";

	Person jack = new Person();
	jack.setAge(55);
	jack.firstName = "Jack";
	jack.lastName = "Smith";


	if (jack.sameAge(john))
	    System.out.println(jack.getName() + " and "+ 
			       john.getName() +" are the same age");
	else		
	    System.out.println(jack.getName() + " and "+ 
			       john.getName() +" are not the same age");

    }

}
