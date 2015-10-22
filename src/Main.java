import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by aviad on 22/10/2015.
 */
public class Main
{

public static void main(String[] args) throws Exception
{
	Polynomial p = new Polynomial();
	ArrayList coArray = new ArrayList<>(Arrays.asList(5.7, 3.2, 2.0, 4.001, 4.0001));


	ArrayList degArray = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 3));
	p.CreatePolynomialsFromArrays(coArray, degArray);
	//p.ad(0, new Polynomial(coArray, degArray));
}
}
