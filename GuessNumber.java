package projects;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

try (Scanner input = new Scanner(System.in)) {
	int myran=(int) (Math.random()*100+1);
	System.out.println("Guess the number from 1 to 100");
	int score=15,n=5;
	do {
		int gusnum=input.nextInt();
		if(gusnum==myran) {
			System.out.println("Correct");
			System.out.println("Your score: "+score);
			break;
		}
		else if(gusnum>myran) {
			System.out.println("High");
			score=score-2;
		}
		else if(gusnum<myran) {
			System.out.println("Low");
			score=score-3;
		}	
		n--;
		if(n>0) {
		System.out.println("you have "+n+" attempts");
		}
		else {
			System.out.println("Your score:"+score);
		}
	}while(n!=0);
}

	}

}
