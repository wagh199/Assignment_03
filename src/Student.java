//Assignment No:03
//Program no (1)
//Design the separate method as String getStudentName (String name) which return student name and print it.
public class Student {
	String getStudentName(String name) { //name contain shiva
		return name; // return name(shiva)value return to getStudentName() method
	//whatever the value(shiva) is stored into name that will
		//be stored into a variable
	}

	public static void main(String[] args) {
		Student student = new Student();
		String a = student.getStudentName("Shiva"); //calling method
		System.out.println("student name>>" + a);
	}

}
