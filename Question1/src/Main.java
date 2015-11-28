import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Aviad on 22/10/2015.
 */
public class Main
{

public static void main(String[] args) throws Exception
	{
		int polCounter = 1;
		String userInput;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Polynomial> polList = new ArrayList<>();

		while (polCounter < 3)
			{
			System.out.println("\nPlease type values for polynomial #" + polCounter + ":\n" +
					"Type the terms by couples of coefficient : degree.\nUse commas to separate the terms.\n");
			userInput = scanner.nextLine();
			polList.add(SplitStringIntoCoefDegree(userInput));
			polCounter++;
			}

		String menu = ("\nWhat to do next?\n\n" +
				"Type 'plus' to perform plus between the two polynomials\n" +
				"Type 'minus' to perform minus between the two polynomials\n" +
				"Type 'evaluate' to get the nigzeret of the Polynomial\n" +
				"Type 'equals' to compare the two polynomials -> 'true' if yes, otherwise 'false'\n" +
				"Type 'menu' to show the main menu again\n" +
				"Type 'print' to print the list of the Polynomials you entered\n" +
				"Type -1 to end the program\n");

		showMessage(menu);

		Polynomial p1 = polList.get(0);
		Polynomial p2 = polList.get(1);
		userInput = scanner.nextLine();

		while (userInput.equals("-1"))
			{

			switch (userInput.toLowerCase())
				{
				case "plus":
				{
				showMessage("Going to perform 'plus' operation between:\n" +
						"p1 = " + p1.toString() + "\n" +
						"p2 = " + p2.toString() + "\n");
				Polynomial p3 = p1.plus(p2);
				showMessage("***Result is:\n" + p3.toString());
				}
				break;

				case "minus":
				{
				showMessage("Going to perform 'minus' operation between:\n" +
						"p1 = " + p1.toString() + "\n" +
						"p2 = " + p2.toString() + "\n");
				Polynomial p3 = p1.minus(p2);
				showMessage("***Result is:\n" + p3.toString());
				}
				break;

				case "evaluate":
				{
				showMessage("Going to perform 'evaluate' operation on:\n" +
						"p1 = " + p1.toString() + "\n" +
						"p2 = " + p2.toString() + "\n");
				Polynomial p3 = p1.evaluate();
				showMessage("***Result is:\np1' = " + p3.toString());
				p3 = p2.evaluate();
				showMessage("***Result is:\np2' = " + p3.toString());
				}
				break;

				case "equals":
				{
				showMessage("Going to perform 'equals' operation now:\n" +
						"p1 = " + p1.toString() + "\n" +
						"p2 = " + p2.toString() + "\n");
				showMessage("***Result is: " + p1.equals(p2));
				}
				break;

				case "menu":
				{
				showMessage(menu);
				break;
				}

				case "-1":
				{
				showMessage("Thanks you! Bye Bye");
				return;
				}

				case "print":
				{
				System.out.println("Current list is: ");
				polList.forEach(System.out::println);
				}
				break;

				default:
				{
				showMessage("Invalid user input! Please choose an option from the menu\n" + menu);
				}
				break;
				}

			showMessage("\nPlease enter your next operation:\n");
			userInput = scanner.nextLine();
			}
	}

private static Polynomial SplitStringIntoCoefDegree(String userInput) throws Exception
	{
		String[] formattedLine = userInput.split("[:,]");

		ArrayList<Double> coefficientArray = new ArrayList();
		ArrayList<Integer> degreeArray = new ArrayList();

		if (coefficientArray.size() != degreeArray.size())
			throw new Exception("Coefficient array and Degree array are not on the same size!");

		for (int i = 0; i < formattedLine.length; i += 2)
			{
			coefficientArray.add(Double.parseDouble(formattedLine[i]));
			degreeArray.add(Integer.parseInt(formattedLine[i + 1]));
			}
		Polynomial p = new Polynomial(coefficientArray, degreeArray);
		System.out.println("\nYour Polynomial is: \n" + p);
		return p;
	}

private static void showMessage(String message)
	{
		System.out.println(message);
	}
}

