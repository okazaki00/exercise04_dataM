package detaM;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Heads__Tails {

	List<Integer> numbers = new ArrayList<>();
	List<String> results = new ArrayList<>();


	public String geamStart() {
		return "Tossing a coin...";
	}

	public String headsOrTails() {
		String[] headsOrTails = { "Heads", "Tails" };
		Random r = new Random();
			String str = headsOrTails[r.nextInt(2)];
			results.add(str);
			return str ;
	}

	public String geamFinish() {
		int headsNumber = 0;
		int tailsNumber = 0;

		for(String str: results) {
			if(str.equals("Heads")){
			headsNumber += 1 ;
			}else {
			tailsNumber += 1;
			}
		}

			return "Heads:" + headsNumber + ", Tails: " + tailsNumber;
	}



	}









