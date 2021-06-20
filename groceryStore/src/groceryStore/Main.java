package groceryStore;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		double pear=2.14f;
		double apple=3.67;
		double tomato=1.11;
		double banana=0.95;
		double eggplant=5.00;
		double total= (pear+pear)+(apple+apple)+(banana+banana)+(eggplant+eggplant);
		
		Scanner weighing=new Scanner(System.in);
		System.out.print("How many kilograms of pears :" );
		pear=weighing.nextDouble();
		System.out.print("How many kilograms of apples :" );
		apple=weighing.nextDouble();
		System.out.print("How many kilograms of tomatos :" );
		tomato=weighing.nextDouble();
		System.out.print("How many kilograms of bananas :" );
		banana=weighing.nextDouble();
		System.out.print("How many kilograms of eggplants :" );
		eggplant=weighing.nextDouble();
		System.out.println("Total Amount :" +total);
		
         
		

	}

}
