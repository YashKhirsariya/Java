public class marks1 extends studedtails{
	char grade;
	int sem, m1, m2, m3;
	float avg , totalmarks;
	public marks1() {
	//	super();
		
		this.grade='a';
		this.sem=4;
		this.m1=34;
		this.m2=65;
		this.m3=99;
		
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "marks1 [grade=" + grade + ", sem=" + sem + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", avg=" + avg
				+ ", totalmarks=" + totalmarks + ", college=" + college + ", university=" + university + ", course="
				+ course + ", name=" + name + ", gender=" + gender + "]";
	}

	
		public static void main (String args[])
		{
			marks1 p = new marks1();
			System.out.println(p);
		}
	
}

