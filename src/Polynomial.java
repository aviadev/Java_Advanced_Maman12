import java.util.ArrayList;
import java.util.Comparator;


public class Polynomial
{

private ArrayList<Term> _polynomialArrayList = new ArrayList<>();

public Polynomial()
	{

	}

public Polynomial(ArrayList<Term> polynomialArrayList)
	{
		_polynomialArrayList = polynomialArrayList;
	}

public Polynomial(double[] polCoefficientArray, int[] polDegreeArray) throws Exception
	{

		if (polCoefficientArray.length != polDegreeArray.length)
			throw new Exception("Coefficient array and Degree array are not on the same size!");

		if (polCoefficientArray != null && polCoefficientArray.length > 0)
			{
			createPolynomialFromArrays(polCoefficientArray, polDegreeArray);

			}
	}

public ArrayList<Term> getPolynomialArrayList() {return _polynomialArrayList;}

private ArrayList<Term> createPolynomialFromArrays(double[] polCoefficientArray, int[] polDegreeArray)
	{

		for (int i = 0; i < polCoefficientArray.length; i++)
			{

			Term term = new Term(polCoefficientArray[i], polDegreeArray[i]);
			if (_polynomialArrayList.stream().noneMatch(t -> t.getDegree() == term.getDegree()))
				_polynomialArrayList.add(term);

			else
				{
				for (Term t : _polynomialArrayList)
					{
					if (t.getDegree() == term.getDegree())
						{
						int foundIndex = _polynomialArrayList.indexOf(t);
						double coefSum = t.getCoefficient() + term.getCoefficient();
						if (coefSum != 0) _polynomialArrayList.get(foundIndex).setCoefficient(coefSum);
						else _polynomialArrayList.remove(foundIndex);
						break;
						}
					}
				}
			}
		sortListByHighestDegree(_polynomialArrayList);
		return _polynomialArrayList;
	}

private void sortListByHighestDegree(ArrayList<Term> polynomialList)
	{
		if (polynomialList.size() < 2) return;
		else
			{
			polynomialList.sort(Comparator.comparing(Term::getDegree).reversed());
			}

	}

private void mergeSameDegrees(ArrayList<Term> sourceList)
	{
		for (int i = 1; i < sourceList.size(); i++)
			{
			Term current = sourceList.get(i);
			//Term next = sourceList.iterator().next();
			Term previous = sourceList.get(i - 1);
			if (current.getDegree() == previous.getDegree())
				{
				double coefSum = 0.0;
				double currentCoef = current.getCoefficient();
				//double nextCoef = next.getCoefficient();
				coefSum += currentCoef;
				sourceList.get(i - 1).setCoefficient(currentCoef + previous.getCoefficient());
				}
			}


		/*for (Term t : sourceList)
			{
			if (t.getCoefficient() == sourceList.iterator().next().getCoefficient())
				{
				double nextCoef = sourceList.iterator().next().getCoefficient();
				sourceList.get(sourceList.indexOf(t)).setCoefficient(t.getCoefficient() + nextCoef);
				sourceList.remove(sourceList.indexOf(t));
				}
			}*/
	}

public Polynomial plus(Polynomial p)
	{
		Polynomial thisPol = this;
		//thisPol._polynomialArrayList.addAll(p._polynomialArrayList);
		Polynomial result = new Polynomial();
		for (int i = 0; i < p._polynomialArrayList.size(); i++)
			{

			Term term = new Term(p._polynomialArrayList.get(i));
			if (thisPol._polynomialArrayList.stream().noneMatch(t -> t.getDegree() == term.getDegree()))
				thisPol._polynomialArrayList.add(term);

			else
				{
				for (Term t : thisPol._polynomialArrayList)
					{
					if (t.getDegree() == term.getDegree())
						{
						int foundIndex = thisPol._polynomialArrayList.indexOf(t);
						double coefSum = t.getCoefficient() + term.getCoefficient();
						if (coefSum != 0) thisPol._polynomialArrayList.get(foundIndex).setCoefficient(coefSum);
						else thisPol._polynomialArrayList.remove(foundIndex);
						break;
						}
					}
				}
			}
		result = thisPol;
		return result;
	}



/*public Polynomial plus (Polynomial p)
	{
		Polynomial res;
		if (this._degree == p._degree)
			{
				double resCoe = this._coefficient + (p._coefficient);
				res = new Polynomial(resCoe, p._degree);
				return res;
			}
		else
			{
				ArrayList <Polynomial> polynomialList = new ArrayList<>();
				polynomialList.add(p);
				sortListByHighestDegree(polynomialList);
				MergeSameDegreePolynomials(polynomialList, new ArrayList<Polynomial>());
				res = polynomialList.get(0);
			}
		return res;
	}

private void MergeSameDegreePolynomials(ArrayList<Polynomial> polList, ArrayList<Polynomial> mergedPolList)
	{

		Polynomial lastEnteredPol = new Polynomial(0, 0);
		double coefSum = 0.0;
		for (int i = 0; i < polList.size()-1; i++)
			{
			Polynomial currPol = polList.get(i);
			Polynomial nextPol = polList.get(i + 1);

			if (currPol._degree == nextPol._degree) //3x^3 + 8x^3
				{
				if (currPol._degree != lastEnteredPol._degree)
					{
					coefSum = currPol._coefficient + nextPol._coefficient;
					mergedPolList.add(i, new Polynomial(coefSum, currPol._degree));
					lastEnteredPol._degree = currPol._degree;
					}
				else
					{
					coefSum = lastEnteredPol._coefficient + nextPol._coefficient;
					}
				}
			else    //3x^3 + 2x^2
				{
				if (i == 0) mergedPolList.add(i, new Polynomial(currPol));
				else mergedPolList.add(i, new Polynomial(nextPol));
				}
			}

	}

@Override
public String toString()
	{
		String str = "";
	*//*	for (Polynomial p : polynomialList)
			{
			if (p.degree == 0)
				{
				str += p.coefficient;
				}
			else if (p.degree == 1)
				{
				str += p.coefficient + "x";
				}
			else str += p.coefficient + "x^" + p.degree;
			}*//*
		Polynomial p = this;

		if (p._degree == 0)
			{

			str += p._coefficient;
			}
		else if (p._degree == 1)
			{
			if (p._coefficient == 1 || p._coefficient == -1) str += "x";
			else
			str += p._coefficient + "x";
			}
		else str += p._coefficient == 1 || p._coefficient == -1 ?
					"x^" + p._degree
					:
					p._coefficient + "x^" + p._degree;
		return str;
	}*/
}
