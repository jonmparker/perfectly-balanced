import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class BonusBalancer extends Balancer {
	
	public BonusBalancer(){
		
	}
	
	public boolean isItBalancedBonus(String input){
		int length = input.length();	//length of input string
		HashMap<Character, Integer> tracker = new HashMap<Character, Integer>(); //HashMap to store the various characters of the input
		char[] letters = input.toCharArray();	//array of letters in the input
		
		if(input.equals("")){ // case: empty input string automatically gives result of true
			return true;
		}
		
		for(int i = 0; i < length; i++){
			char curr = letters[i]; //variable used to hold the current letter in the input string
			int temp;
			if(tracker.containsKey(curr)){ // if the current letter has already been seen
				temp = tracker.get(curr).intValue();
				tracker.put(curr, temp+1);
			}else{
				tracker.put(curr, 1);
			}	
		}
		if(tracker.size() == 1){ //if the input contains only one type of character it is automatically true
			return true;
		}
		
		Set<Integer> results = new HashSet<Integer>(tracker.values()); // collecting the variable range of the characters present in the input
		length = results.size(); // reassign length to be the length of the results Set, we will know it is not balanced if the length is larger than 1 since a Set does not allow duplicate values
		if(length != 1){ 
			return false;
		}
		
		return true;
	}
}
