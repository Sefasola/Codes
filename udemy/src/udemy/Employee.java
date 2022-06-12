package udemy;

 

public class Employee {
	public String name;
	public int salary;
	public double hiredate;
	public int workhours;
	
	Employee(int hiredate, int salary, int workhours, String name){
		this.name=name;
		this.salary=salary;
		this.hiredate=hiredate;
		this.workhours=workhours;
	}
	public double tax() {
		if(salary>1000) {
			return salary*0.03;
		}
		else {
			return 0.0;
		}
	}
	
	public int bonus() {
		return workhours*30;
	}
	
	public double RaiseSalary() {
		int b=2015-workhours;
		this.hiredate=b;
		if(this.hiredate<10) {
			return this.hiredate*0.05;
		}
		else if(10<=this.hiredate && this.hiredate<20) {
			return this.hiredate*0.1;
		}
		else {
			return this.hiredate*0.15;
		}
	}
	
	
	}
