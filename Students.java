//Assignment-4 - Overloading
package week3.day1.Assignment;
	
	public class Students {
	
		public void getStudentInfo(int id) {
			System.out.println("Student ID : " +id);
			
		}

		public void getStudentInfo(int id,String name) {
			System.out.println("Student ID : " +id);
			System.out.println("Student Name : " +name);

		}

		public void getStudentInfo(String email , long phoneno) {
			System.out.println("Student Email : " +email);
			System.out.println("Student Phone Number : " +phoneno );

		}
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(20137);
		obj.getStudentInfo(20137, "Keerthana");
		obj.getStudentInfo("keerthana25@gmail.com", 7359294686L);
	}

}

