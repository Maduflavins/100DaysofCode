package question7_19;
import java.util.Scanner;
public class Plane {
	private final Scanner input = new Scanner(System.in);
	//0-4 first class 5-9 economy
	private boolean[] seat = new boolean[10];
	
	public void assignSeat(int sectionNum) {
		String answer;
		if(sectionNum == 1) {
			for(int i = 0; i < (seat.length / 2); i++) {
				if(seat[i] == false) {
					System.out.println("seat number is "+ i);
					seat[i] = true;
					break;
				} else if(i == ((seat.length / 2) - 1) && seat[i] == true) {
					System.out.println("first class is full would you like to be reassigned to economy");
					answer = input.nextLine();
//					input.next();
					reAssigning(1, answer);
				}
			}
		}
	}
	
	private void reAssigning(int initialSection, String answer) {
		if(initialSection == 1 && answer.equals("yes")) {
			for(int i = 5; i < 9; i++) {
				if(seat[i] == false) {
					seat[i] = true;
					System.out.println("seat assigned to economy"+ i);
					break;
				} else if(i == 8 && seat[i] == true){
					System.out.println("Next plane leaves in 3 hours");
				}
			}
		} else if(initialSection == 1 && answer.equals("No")) {
			System.out.println("Next plane leaves in 3 hours");
		}
		
		if(initialSection == 2 && answer.equals("yes")) {
			for(int i = 0; i < (seat.length / 2); i++) {
				if(seat[i] == false) {
					seat[i] = true;
					break;
				} else if(i == 3 && seat[i] == true){
					System.out.println("Next plane leaves in 3 hours");
				}
			}
		} else if(initialSection == 2 && answer.equals("No")) {
			System.out.println("Next plane leaves in 3 hours");
		}
	}
}
