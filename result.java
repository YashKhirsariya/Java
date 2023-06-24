import java.util.Scanner;

public class result extends student{
	char grade;
	int sem, m1, m2, m3;
	float avg , totalmarks;
	Scanner sc = new Scanner(System.in);

	public result() {
		// TODO Auto-generated constructor stub
		System.out.println(" This is class Marks");
	}
	void input() {
		System.out.println(" Enter student details below :- ");
		System.out.println("Enter name first :- ");
		name = sc.next();
		System.out.println("Enter your Gender :- ");
		gender = sc.next();

		System.out.println("Enter sem:- ");
		sem = sc.nextInt();
		System.out.println("Enter marks of Java:- ");
		m1 = sc.nextInt();
		System.out.println("Enter marks of C#:- ");
		m2 = sc.nextInt();
		System.out.println("Enter marks of OS:- ");
		m3 = sc.nextInt();
		
	}

	public void display() {
		avg =(float)((m1 + m2 + m3) / 3);
		totalmarks=(float) (m1+m2+m3);
		System.out.println(" The details of student :- ");
		System.out.println(" Name of student " + name);
		System.out.println(" Gender : " + gender);
		System.out.println();
		System.out.println(" Course :- " + course);
		System.out.println(" College :" + college);
		System.out.println(" University :" + university);
		System.out.println(" Sem :- " + sem);
		System.out.println();
		System.out.println(" Java , C# , Os " + m1 + " " + m2 + " " + m3);
		System.out.println("Total marks :- " + totalmarks);
		System.out.println(" Avarage of student : - " + avg);
	}
	
}

