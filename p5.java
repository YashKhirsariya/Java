class a
{
	int x;

	void func() {
		// TODO Auto-generated method stub
		
	}
}
class b extends a
{
	int x;
	public b() {
		// TODO Auto-generated constructor stub
		System.out.println("Called");
	}
	public b(int i1 , int i2)
	{
		this.x=i1;
		super.x=i2; 
	}
@Override
void func() {
	// TODO Auto-generated method stub
	super.func();
}
	public void display()
	{
		System.out.println("this.x : " + this.x);
		System.out.println("super.x : " + super.x);
		
	}
}

class p5
{
	public static void main(String args[])
	{
		b obj = new b(10, 20);
		obj.display();
	}
}