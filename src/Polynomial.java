import java.util.ArrayList;
import java.util.Comparator;


public class Polynomial
{

protected ArrayList<Term> _termsList = new ArrayList<>();

public Polynomial() {}

public Polynomial(ArrayList<Double> polCoefficientArray, ArrayList<Integer> polDegreeArray) throws Exception
	{

		if (polCoefficientArray.size() != polDegreeArray.size())
			throw new Exception("Coefficient array and Degree array are not on the same size!");

		if (polCoefficientArray.size() > 0)
			{
			Polynomial p = createPolynomialFromArrays(polCoefficientArray, polDegreeArray);
			}
	}

public int size()
	{
		return _termsList.size();
	}

protected Polynomial createPolynomialFromArrays(ArrayList<Double> polCoefficientArray,
		ArrayList<Integer> polDegreeArray)
	{
		Polynomial p = this;
		for (int i = 0; i < polCoefficientArray.size(); i++)
			{

			Term term = new Term(polCoefficientArray.get(i), polDegreeArray.get(i));
			if (p._termsList.stream().noneMatch(t -> t.getDegree() == term.getDegree())) p._termsList.add(term);

			else
				{
				for (Term t : _termsList)
					{
					if (t.getDegree() == term.getDegree())
						{
						int foundIndex = p._termsList.indexOf(t);
						double coefSum = t.getCoefficient() + term.getCoefficient();
						if (coefSum != 0) p._termsList.get(foundIndex).setCoefficient(coefSum);
						else p._termsList.remove(foundIndex);
						break;
						}
					}
				}
			}
		p.sortListByHighestDegree();
		return p;
	}

private void sortListByHighestDegree()
	{
		if (this.size() > 1) this._termsList.sort(Comparator.comparing(Term::getDegree).reversed());
	}

public Polynomial plus(Polynomial param)
	{
		Polynomial thisPol = this;

		Polynomial result = new Polynomial();
		for (int i = 0; i < param._termsList.size(); i++)
			{

			Term paramTerm = new Term(param._termsList.get(i));
			if (thisPol._termsList.stream().noneMatch(t -> t.getDegree() == paramTerm.getDegree()))
				result._termsList.add(paramTerm);

			else
				{
				for (Term t : thisPol._termsList)
					{
					if (t.getDegree() == paramTerm.getDegree())
						{
						double coefSum = t.getCoefficient() + paramTerm.getCoefficient();
						if (coefSum != 0)
							{
							result._termsList.add(new Term(coefSum, t.getDegree()));
							}
						break;

						}
					}
				}
			}
		return result;
	}

public Polynomial minus(Polynomial param)
	{
		Polynomial thisPol = this;
		Polynomial result = new Polynomial();

		if (thisPol == param) return result;

		for (int i = 0; i < param._termsList.size(); i++)
			{

			Term paramTerm = new Term(param._termsList.get(i));
			if (thisPol._termsList.stream().noneMatch(t -> t.getDegree() == paramTerm.getDegree()))
				result._termsList.add(paramTerm);

			else
				{
				for (Term t : thisPol._termsList)
					{
					if (t.getDegree() == paramTerm.getDegree())
						{
						double coefSum = t.getCoefficient() - paramTerm.getCoefficient();
						if (coefSum != 0)
							{
							result._termsList.add(new Term(coefSum, t.getDegree()));
							}
						break;

						}
					}
				}
			}
		return result;
	}

public Polynomial evaluate()
	{
		Polynomial thisPol = this;
		Polynomial res = new Polynomial();
		for (int i = 0; i < thisPol.size(); i++)
			{
			int currentDegree = thisPol._termsList.get(i).getDegree();
			double currentCoef = thisPol._termsList.get(i).getCoefficient();

			if (currentDegree > 0)
					{
					double calculatedCoef = currentCoef * currentDegree;
					int calculatedDegree = currentDegree - 1;
					res._termsList.add(new Term(calculatedCoef, calculatedDegree));
					}
			}
		return res;
	}

public boolean equals(Object obj)
	{
		if (obj != null && this.getClass() == obj.getClass())
			{
			Polynomial thisPol = this;
			Polynomial otherPol = (Polynomial) obj;

			for (int i = 0; i < thisPol.size(); i++)
				{
				Term thisTerm = thisPol._termsList.get(i);
				Term otherTerm = otherPol._termsList.get(i);

				if (thisTerm.equals(otherTerm)) return true;
				}
			}
		return false;
	}

@Override
public String toString()
	{
		Polynomial p = this;
		String str = "";

		if (p.size() == 0) return "0";

		for (int i = 0; i < p.size(); i++)
			{
			Term term = p._termsList.get(i);
			if (i == 0)
				{
				str += term.toString();

				}

			else if (i > 0)
				{
				if (term.getCoefficient() > 0)
					{
					str += "+";
					str += term.toString();
					}
				else str += term.toString();
				}

			}
		return str;

	}


}
