package detaM;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Heads__Tails {

	List<Integer> numbers = new ArrayList<>();
	List<String> results = new ArrayList<>();
	private String name;


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
		String message;

		for(String str: results) {
			if(str.equals("Heads")){
			headsNumber += 1 ;
			}else {
			tailsNumber += 1;
			}
		}

		if(headsNumber > tailsNumber) {
			message = name + "  won!";
		}else {
			message = name + "  lost......";
		}

		String br = System.getProperty("line.separator");

			return "Heads:" + headsNumber + ", Tails: " + tailsNumber + br + message;
	}

	public void greet() {
		System.out.println("Who are you?");
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		  try {
			  name= reader.readLine();
			  System.out.println("Hello," + name + "!");
		  }catch (IOException e) {
			  	System.out.println (e);
		  }

	}




	}









