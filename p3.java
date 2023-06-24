class p3
{
	static void arg(int...a)
	{
		System.out.println("Number of arguments is : " + a.length);
		//for(int i : a)
		//System.out.print(i+" ");
		//System.out.println();
		
	}
	
	public static void main(String args[])
	{
		arg(1,2,3,4,5);
		arg();
	}
}