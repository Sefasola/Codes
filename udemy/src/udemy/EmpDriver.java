package udemy;

public class EmpDriver {

	public static void main(String[] args) {
		Employee info= new Employee(2015, 1500, 8, "sefa");
		System.out.println("tax " + info.tax());
		System.out.println("bonus " + info.bonus());
		System.out.println("raise salary " + info.salary);
		System.out.println();
	}

}
