// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee.

public class SalariedEmployee extends Employee
{

private double weeklySalary;

// four-argument constructor
public SalariedEmployee(String first, String last, String ssn, double salary)
	{
		super(first, last, ssn); // pass to Employee constructor
		setWeeklySalary(salary); // validate and store salary
	} // end four-argument SalariedEmployee constructor

// return salary
public double getWeeklySalary()
	{
		return weeklySalary;
	} // end method getWeeklySalary

// set salary
public void setWeeklySalary(double salary)
	{
		if (salary >= 0.0) weeklySalary = salary;
		else throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	} // end method setWeeklySalary

public double setEarnings(double GIFT)
	{
		return earnings() + GIFT;
	}

// return String representation of SalariedEmployee object

@Override
public String toString()
	{
		return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	} // end method toString

// calculate earnings; override abstract method earnings in Employee
@Override
public double earnings()
	{
		return getWeeklySalary();
	} // end method earnings
} // end class SalariedEmployee

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/