
public class Balancer {
	
	public Balancer(){
		
	}
	
	public boolean isItBalanced(String input){
		int length = input.length();	//length of input string
		int xs = 0, ys = 0;	// counters for number of x's and y's
		char[] letters = input.toCharArray();	//array of letters in the input
		
		if(input.equals("")){ // case: empty input string automatically gives result of true
			return true;
		}
		
		for(int i = 0; i < length; i++){	//go through char array to count number of each letter in input
			String temp = Character.toString(letters[i]);	//temporary String holder of current letter in input
			if(temp.equals("x")){	//if letter is x increment the x's counter
				xs++;
			}else if(temp.equals("y")){	//if letter is y increment the y's counter
				ys++;
			}else{	//if letter is different than x or y an error will print and the program will exit
				throw new IllegalArgumentException("x's and y's only please!");
			}
		}
		
		if(xs == ys){	//returns true if the x's and y's are equal
			return true;
		}
		
		return false;
	}
		
}
