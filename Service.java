package detaM;


public class Service {

	public static void main(String[] args) {
		Heads__Tails h1 = new Heads__Tails();

		System.out.println(h1.geamStart());

		for(int i = 0 ; i<3 ; i++ ) {
			System.out.println(h1.headsOrTails());
		}

		System.out.println(h1.geamFinish());

	}

}