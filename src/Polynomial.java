import java.util.ArrayList;
import java.util.Comparator;


public class Polynomial
{

private static ArrayList<Polynomial> polynomialList = new ArrayList<>();
private int degree;
private double coefficient;

public Polynomial()
{

}

public Polynomial(double _coefficient, int _degree)
{
	degree = _degree;
	coefficient = _coefficient;
}

public Polynomial(Polynomial p)
{
	degree = p.degree;
	coefficient = p.coefficient;
}

public Polynomial(ArrayList _polCoefficientArray, ArrayList _polDegreeArray) throws Exception
{

	if (_polCoefficientArray.size() != _polDegreeArray.size())
		throw new Exception("Coefficient array and Degree array not on same size!");

	CreatePolynomialsFromArrays(_polCoefficientArray, _polDegreeArray);

}

public static ArrayList<Polynomial> getPolynomialList()
{
	return polynomialList;
}

private static double getDegree(Polynomial p)
{
	return p.degree;
}

public void CreatePolynomialsFromArrays(ArrayList _polCoefficientArray, ArrayList _polDegreeArray)
{
	for (int i = 0; i < _polCoefficientArray.size(); i++)
	{
		Polynomial p = new Polynomial((double) _polCoefficientArray.get(i), (int) _polDegreeArray.get(i));
		polynomialList.add(p);
	}
	polynomialList.sort(Comparator.comparing(Polynomial::getDegree).reversed());

}
}
