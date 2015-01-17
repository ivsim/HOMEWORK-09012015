package lecture_exec_1_company;

public class Company {

		public String name;
		public String address;
		public int numEmployee;
		public String emailAddress;
		
		public Company (String name, String address, int numEmployee, String emailAddress){
			this.name = name;
			this.address = address;
			this.numEmployee = numEmployee;
			this.emailAddress = emailAddress;
		}
		
		public void printEmployee(){
			System.out.printf("Company %s is with the max number of employees - %d.%n", this.name, this.numEmployee);
		}
		
	
}
