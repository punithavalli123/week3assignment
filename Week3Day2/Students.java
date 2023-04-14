package Week3Day2;

public class Students {

	public void getStudentsInfo(int id)
	{
		System.out.println("Student Id no is: " +id );
		
	}
	public void getStudentsInfo(int id, String name)
	{
		System.out.println("Student Id is and Student Name :" +id+ " and " +name);
	}
	public void getStudentInfo(String email, long phno)
	{
		System.out.println(" Student Mail-ID and Student Phone No is"  +email+  "and "   +phno);
		
	}
	
	public static void main(String[] args) {
		int id = 76892;
		String name = "punitha";
		String email = "rajupunitha@gmail.com";
		long phno = 988908809;
		
		Students st= new Students();
		st.getStudentsInfo(id);
		st.getStudentsInfo(id, name);
		st.getStudentInfo(email, phno);
		

	}

}
