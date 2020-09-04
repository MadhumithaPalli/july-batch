import java.util.*;
/*
 * Name :Madhumitha Palli;
 * date: 10/04/2019;
 * homework about the Cookout calculator;
 */

public class Cookout_Calculator {

	public static void main(String[] args) 
	{
		//bunpep =buns/person
		int people,ham_people,veggie_people,bunpep,a,b,c;
	    float e,f,g,h,i,j,k,l,m;
		/*bun_package=8;
		 * ham_package =15;
		 * veggie_package =4;
		 */
		Scanner input=new Scanner(System.in);
		//asking the user about people having hamburgers
		System.out.println("number of people attending cookout having hamburgers ? = ");
		//assigning the input into a variable
		ham_people=input.nextInt();
		//asking the user about people having hamburgers
		System.out.println("number of people attending cookout having veggieburgers ? =");
		//assigning the input into a variable
		veggie_people =input.nextInt();
		//equation for total number of people
		people=ham_people+veggie_people;
		//asking user for number of burgers per person;
		System.out.println("number of burgers (veggie or meat) per each person ? =");
		//assigning the input into the variable
		bunpep = input.nextInt();
		//total burgers packages require
		a=(bunpep*people);
		//total hamburgers packages
		b=(ham_people*bunpep)/15;
		//total veggie burger packages
		c=(veggie_people*bunpep)/4;
		//minimum burger packages
		e = (a/8)+1;
		//minimum ham burger packages
		f = b+1;
		//minimum veggie burger packages
		g = c+1;
		//all the 3 equations above in decimals for calculation of leftovers
		k=(bunpep*people);
		l=(ham_people*bunpep)/15f;
		m=(veggie_people*bunpep)/4f;
		//burger buns leftover
		h =((e-( k/8))*8);
		//hamburger patties leftover
		i=(f-l)*15;
		//veggie burger leftover
		j=(g-m)*4;
		//printing all results from above equations
		System.out.println("minimum number of packages of burger buns required = "+e);
		System.out.println("minimum number of packages of hamburgers patties required = "+f);
		System.out.println("minimum number of packages of veggie burger patties required = "+g);
		System.out.println("number of burger buns leftover ="+h );
		System.out.println("number of hamburger patties leftover = "+i);
		System.out.println("number of veggieburger patties leftover = "+j);

	}

}
