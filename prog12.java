abstract class o {
	abstract void func();
	
}

public class prog12 extends a
{

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("This is example of abstract class and abstract method");
	}
	
	public static void main(String args[])
	{
		prog12 p =new prog12();
		p.func();
	}
	
}