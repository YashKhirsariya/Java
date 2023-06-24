public class p4 {
	void display()
	{
		int m=18;
		System.out.println("The sum is  : "+m);
	}
	
	class inner{
		int v=74;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p4 p = new p4();
		p.display();
		p4.inner k = p.new inner();
		System.out.println("Inner class : "+k.v);
	}

}