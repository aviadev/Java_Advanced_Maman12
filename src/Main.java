/**
 * Created by aviad on 22/10/2015.
 */
public class Main
{

public static void main(String[] args) throws Exception
{
	//PolinomialList polinomialList = new PolinomialList();
	/*//Polynomial p = new Polynomial();
	//ArrayList coArray = new ArrayList<>(Arrays.asList(5.7, 3.2, 2.0, 4.001, 4.0001));


	//ArrayList degArray = new ArrayList<>(Arrays.asList(57, 13, 20, 40, 40));

	Polynomial2 p1 = new Polynomial2(5,20);
	Polynomial2 p3 = p1.plus(new Polynomial2(4, 21).plus(new Polynomial2(6, 20)));
	//p.ad(0, new Polynomial(coArray, degArray));
	System.out.println("zero(x) =     " + p3);
	Polynomial2 zero = new Polynomial2(0, 0);


	Polynomial2 p2   = new Polynomial2(4, 6);
	Polynomial2 p5   = new Polynomial2(2, 4);

	//Polynomial2 p3   = new Polynomial2(1, 0);
	Polynomial2 p4   = new Polynomial2(2, 1);


	Polynomial2 q1   = new Polynomial2(3, 2);
	Polynomial2 q2   = new Polynomial2(5, 0);
	Polynomial2 q    = q1.plus(q2);                     // 3x^2 + 5



	System.out.println("zero(x) =     " + zero);



	Polynomial pp1 = new Polynomial(1,1);    //x
	Polynomial pp2   = new Polynomial(5, 0); //5.0
	Polynomial pp3   = new Polynomial(1, 0); //1.0
	Polynomial pp4   = new Polynomial(1, 2); //x^2
	Polynomial pp5   = new Polynomial(2, 1); //2x
	Polynomial pp6   = new Polynomial(2, 2); //2x^2
	Polynomial pp7   = new Polynomial(-2, 1); //-2x
	Polynomial pp8   = new Polynomial(-1, 1); //-x*/

	//Polynomial pp10 ; //-x
	//Polynomial pp11   = new Polynomial(); //-x

/*	double [] coe = new double[] {1,5,1,1,2,2,-2,-1};
	int [] deg = new int [] {1,0,0,2,1,2,1,1};*/

	double[] plusCoeP1 = new double[]{3, 5, 7, 9, 11, 13, -6, -5};
	int[] plusDegP1 = new int[]{3, 2, 1, 0, 4, 3, 3, 2};
	Polynomial p1 = new Polynomial(plusCoeP1, plusDegP1);

	double[] plusCoeP2 = new double[]{3, 5, 7, 1};
	int[] plusDegP2 = new int[]{4, 2, 1, 0};

	double[] plusCoeP3 = new double[]{-4, -5, -14, -10};
	int[] plusDegP3 = new int[]{4, 2, 1, 0};
	Polynomial p3 = new Polynomial(plusCoeP3, plusDegP3);

	Polynomial p2 = new Polynomial(plusCoeP2, plusDegP2);
	Polynomial p4 = p1.plus(p2).plus(p3);

	//pp10.plus(pp11);
	/*System.out.println("p(x) =        " + pp1);
	System.out.println("p(x) =        " + pp2);
	System.out.println("p(x) =        " + pp3);
	System.out.println("p(x) =        " + pp4);
	System.out.println("p(x) =        " + pp5);
	System.out.println("p(x) =        " + pp6);*/
	//Polynomial res = pp1.plus(pp5).plus(pp2);
	//System.out.println("res =        " + res);

/*	Term pp1 = new Term(-1,1);    //x
	Term pp2   = new Term(-5, 0); //5.0
	Term pp3   = new Term(-1, 0); //1.0
	Term pp4   = new Term(-1, 2); //x^2
	Term pp5   = new Term(-2, 1); //2x
	Term pp6   = new Term(-2, 2); //2x^2
	Term pp7   = new Term(-2, 1); //-2x
	Term pp8   = new Term(-1, 1); //-x*//*

	System.out.println("p(x) =        " + pp1);
	System.out.println("p(x) =        " + pp2);
	System.out.println("p(x) =        " + pp3);
	System.out.println("p(x) =        " + pp4);
	System.out.println("p(x) =        " + pp5);
	System.out.println("p(x) =        " + pp6);*/



}
}
