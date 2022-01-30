package constructor;

public class PersonTest {
   
	 public static void main(String[] args) {
		  Person personKim = new Person();
		  personKim.name = "±èÀ¯½Å";
		  personKim.weight = 85.5F;
		  personKim.height = 180.0F;
		
		  Person personLee = new Person("ÀÌ¼ø½Å", 175, 75);
	 }
}