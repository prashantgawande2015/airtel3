package encapsulation_demo;

public class Employee {

	public static void main(String[] args) {
		
		public double empsal;
		
		public void setsal(double passsal)
		{
			if(passsal>0) {
				this.empsal=passsal;
			}
			else
			{
				System.out.println("salary can not be negative");
			}
		}
		

	}

}
