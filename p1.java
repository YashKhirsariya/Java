public class p1 {

	public int rollno ;
	public String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sem = 4 ;
		
		p1 student = new p1();
		student.name="Mihir Kothari";
		student.rollno=34;
		
		System.out.println("Student of Sem : " + sem);
		System.out.println("Name of student : " + student.name);
		System.out.println("Roll no :  " + student.rollno);
	}

}