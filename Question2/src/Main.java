import java.util.ArrayList;

/**
 * Created by Aviad on 22/10/2015.
 */
public class Main
{

private static final double GIFT = 200;

public static void main(String[] args) throws Exception
	{
		ArrayList<Employee> emplyoeesList = new ArrayList();

		BasePlusCommissionEmployee basePlusCommEmp = new BasePlusCommissionEmployee("BasePlusCommission", "Employee",
				"11111", 1000, 0.5, 5000);
		basePlusCommEmp.setBirthDate(01, 1, 1991);
		// You can check date validation
		// basePlusCommEmp.setBirthDate(01, 1, 1991);
		emplyoeesList.add(basePlusCommEmp);

		CommissionEmployee commEmp = new BasePlusCommissionEmployee("Excellent", "commEmp", "22222", 2000, 0.7, 7000);
		commEmp.setBirthDate(02, 02, 1992);
		emplyoeesList.add(commEmp);

		HourlyEmployee hourEmp = new HourlyEmployee("Good", "hourEmp", "33333", 25, 160);
		emplyoeesList.add(hourEmp);
		hourEmp.setBirthDate(03, 03, 1993);

		SalariedEmployee salEmp = new SalariedEmployee("best", "salEmp", "44444", 10000);
		salEmp.setBirthDate(04, 4, 1994);
		emplyoeesList.add(salEmp);

		PieceWorker pwEmp = new PieceWorker("nice", "pwEmp", "55555", 1.5, 1000);
		pwEmp.setBirthDate(05, 11, 55);
		emplyoeesList.add(pwEmp);

		for (Employee emp : emplyoeesList)
			{

			if (emp.hasBirthdayThisMonth())
				{

				System.out.println(
						"\nEmployee: " + "'" + emp.getFirstName() + " ," + emp.getLastName() + "'" + " has birthday this month!\n" + emp.getBirthDate() +
								"\nTherefore additional 200$ were added to earnings.\n");
				System.out.println(emp + "\n" + "earnings: $" + (emp.earnings() + 200) + "\n");
				}

			else System.out.println(emp + "\n" + "earnings: $" + emp.earnings() + "\n");

			}
	}
}

