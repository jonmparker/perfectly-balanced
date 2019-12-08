import java.util.Scanner;

/*This program takes an input string and determines if the string has an equal amount of each different letter present.
 * The program runs in two modes: bonus and regular. In the regular mode the input string consists solely of x's and y's.
 * In bonus mode the string may contain any letters the user wishes. If the letters are all the same amount the program
 * will print true, otherwise it will print false.*/
public class PerfectlyBalanced {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		String option = ""; //determines if the program will run in bonus mode or not
		String input = "";	//input string
		BonusBalancer balancer = new BonusBalancer();
		
		System.out.println("Type 'yes' for bonus mode");
		option = scanner.nextLine();
		
		System.out.println("Enter your String please!");
		input = scanner.nextLine();
		try{
			if(option.equalsIgnoreCase("yes")){ //bonus mode
				result = balancer.isItBalancedBonus(input);
			}else{
				result = balancer.isItBalanced(input);
			}
		
			if(result == true){
				System.out.println("True");
			}else{
				System.out.println("False");
			}
		}catch(IllegalArgumentException e){ // if the input is not only x's and/or y's
			System.out.println(e.getMessage());
		}
	}
}
