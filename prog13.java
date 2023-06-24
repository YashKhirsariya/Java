interface interfaceDemo
{
	void Break();
	void Accelarate();
}

class Car implements interfaceDemo
{

	public void Break() {
		// TODO Auto-generated method stub
		System.out.println(" Break the car");
	}

	public void Accelarate() {
		// TODO Auto-generated method stub
		System.out.println(" Accelarate the car");
	}
	
}

public class prog13 {
	public static void main(String[] args) {
		interfaceDemo first = new Car();
		first.Accelarate();
		first.Break();
	}
}
