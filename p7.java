class A1
{
	public void dispaly()
	{
		System.out.println("This is a method overriding.");
	}
}

class B1 extends A1
{
	public void display()
	{
		super.dispaly();
		System.out.println("This is b method overriding.");
	}
}
class p7
{
	public static void main(String args[])
	{
		B1 mtd = new B1();
		mtd.display();
	}
}