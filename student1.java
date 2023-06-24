class k
{
	String course,university,college;
	public k() 
	{
		// TODO Auto-generated constructor stub
		university = "Saurastra university";
		college = "H J Doshi I T I";
		course = "BCA";
	}
	
	public k(String course) 
	{
		// TODO Auto-generated constructor stub
		university = "Saurastra university";
		college = "H J Doshi I T I";
		this.course = course;
	}
	
	public String toString()
	{
		return "Student details given below : -\n" + " University : - " + university + "\n College : - " + college + "\n Course : - " + course; 
	}
}

public class student1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(" ");
		k std = new k("B.C.A");
		System.out.println(std);
	}

}
