package basics;

public class Switch {
//switch used to check fo an exact match
	public static void main(String[] args) {
		
		int x = 56;
		
		switch (x) {
		case 40:
			System.out.print("X is 40");
			break;
		//the two give option to check 56 to be 50
		case 56:
		case 50:
			System.out.print("X is 50");
			break;
		case 60 :
			System.out.print("X is 60");
			break;
			
		default:
			System.out.print("Does not meet any criteria");
			break;
		}
	}

}
