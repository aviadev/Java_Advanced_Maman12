/**
 * Created by aviad on 28/11/2015.
 */
public class PieceWorker extends Employee
{

private double ratePerQuantity;
private int quantity;

public PieceWorker(String firstName, String lastName, String ssn, double ratePerQnt, int qnt)
	{
		super(firstName, lastName, ssn);
		setRatePerQuantity(ratePerQnt);
		setQuantity(qnt);
	}

private void setRatePerQuantity(double ratePerQnt)
	{
		if (ratePerQnt < 0) throw new IllegalArgumentException("Rate must be positive");
		else ratePerQuantity = ratePerQnt;
	}

private void setQuantity(int qnt)
	{
		if (qnt < 0) throw new IllegalArgumentException("Quantity must be positive");
		else quantity = qnt;
	}

public String toString()
	{
		return (super.toString() + "\n" + "TypeOfEmployee: " + this.type +
				"\nrate per quantity: " + ratePerQuantity +
						"\nquantity: " + quantity);
	}

@Override
public double earnings()
	{
		return ratePerQuantity * quantity;
	}
}
