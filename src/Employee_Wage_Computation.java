public class Employee_Wage_Computation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		final int wagePerHour=20;
		final int fullDayHour=8;
		final int partTimeHour=4;
		int dailyWage=0;
		int isFullTime=1;
		int isPartTime=2;
		int empCheck = (int)Math.floor(Math.random()*10)%3;
		if (empCheck == isFullTime){
			System.out.println("Employee is Present for full time");
			dailyWage=(wagePerHour*fullDayHour);
			System.out.println("daily wage is "+dailyWage);
		}
		else if (empCheck == isPartTime) {
			System.out.println("Employye is present for part time");
			dailyWage=(wagePerHour*partTimeHour);
			System.out.println("daily wage is "+dailyWage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
