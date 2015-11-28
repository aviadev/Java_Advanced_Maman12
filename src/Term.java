/**
 * Created by Aviad on 30/10/2015.
 */
public class Term
{

private double _coefficient;
private int _degree;

public Term()
	{

	}

public Term(double coefficient, int degree)
	{
		_coefficient = coefficient;
		_degree = degree;
	}

public Term(Term p)
	{
		this._degree = p._degree;
		this._coefficient = p._coefficient;
	}

protected double getCoefficient() {return _coefficient;}

public void setCoefficient(double coefficient)
	{
		this._coefficient = coefficient;
	}

protected int getDegree() {return _degree;}

public void setDegree(int degree)
	{
		this._degree = degree;
	}

public boolean equals(Object obj)
	{
		if (obj == null || this.getClass() != obj.getClass()) return false;
		Term other = (Term) obj;
		return !(this._degree != other._degree || this._coefficient != other._coefficient);
	}

public String toString()
	{
		String str = "";

		switch (_degree)
			{
			case 0:
				str += _coefficient;
				break;

			case 1:
				if (_coefficient == 0) return str;
				else if (_coefficient == 1) str += "x";
				else str += _coefficient + "x";
				break;

			default:
				if (_coefficient == 0) return str;
				else if (_coefficient == 1) str += "x^" + _degree;
				else str += _coefficient + "x^" + _degree;
				break;
			}

		return str + " ";
	}

public boolean isSameDegree(Term other)
	{
		return this._degree == other._degree;
	}


}
