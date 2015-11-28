// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class Employee
{

protected String type = getClass().getName();
private String firstName;
private String lastName;
private String socialSecurityNumber;
private BirthDate birthDate;

// three-argument constructor
public Employee(String first, String last, String ssn)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	} // end three-argument Employee constructor

// one-argument constructor - ADDED BY ME
public Employee(Employee other)
	{
		firstName = other.firstName;
		lastName = other.lastName;
		birthDate = other.birthDate;
		socialSecurityNumber = other.socialSecurityNumber;
	} // end one-argument Employee constructor

public String getBirthDate() {return birthDate != null ? birthDate.toString() : "No birth date entered";}

public void setBirthDate(int day, int month, int year)
	{
		birthDate = new BirthDate(day, month, year);
	}

// return first name
public String getFirstName()
	{
		return firstName;
	} // end method getFirstName

// set first name
public void setFirstName(String first)
	{
		firstName = first; // should validate
	} // end method setFirstName

// return last name
public String getLastName()
	{
		return lastName;
	} // end method getLastName

// set last name
public void setLastName(String last)
	{
		lastName = last; // should validate
	} // end method setLastName

// return social security number
public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber

// set social security number
public void setSocialSecurityNumber(String ssn)
	{
		socialSecurityNumber = ssn; // should validate
	} // end method setSocialSecurityNumber

// return String representation of Employee object

public boolean hasBirthdayThisMonth()
	{
		return birthDate.hasBirthdayThisMonth();
	}

@Override
public String toString()
	{
		return String.format("%s %s\nsocial security number: %s\n" + "birth date: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber(), getBirthDate());
	} // end method toString

// abstract method overridden by concrete subclasses
public abstract double earnings(); // no implementation here

} // end abstract class Employee

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
