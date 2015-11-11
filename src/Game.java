import java.util.Scanner; 

public class Game {

    public static void main(String[] args) { 
    
    		int score = 0;
    		int difficulty = 10;
    		
    		
    		int number1 = (int)(Math.random() * difficulty);
    		int number2 = (int)(Math.random() * difficulty);
    		int correctAnswer = number1 + number2;
    		
    		//Round 1
    		
    			//Ask the user to add these two numbers together
    		System.out.println("**Round 1**");
    		System.out.println("What integer is " + number1 + " + " + number2 + "?");
    		
    		
    		
    		Scanner input = new Scanner(System.in);
    		int studentAnswer = input.nextInt();
    		
    		
    		if(studentAnswer == correctAnswer){
    				//If correct
    				//Tell them it was correct
    			System.out.println("Your answer was correct.");
    				//Give them points
    			score += difficulty;
    			System.out.println("Your score is now: " + score);
    				//Make the next question harder
    			difficulty *= 10;
    			System.out.println("Difficulty will be: " + difficulty);
    		}else{
    				//If not correct
    			System.out.println("Your answer was not correct.");
    				//Give the correct answer
    			System.out.println("The correct answer was: " + correctAnswer);
    				//Do not give them points
    			score += 0;
    				//Make the next question easier
    			if (difficulty > 10){
    				difficulty /= 10;
    				System.out.println("Difficulty is now: " + difficulty);
    			}else{
    				System.out.println("Difficulty is at the lowest level");
    				System.out.println("Difficulty is now: " + difficulty);
    			}
    			
    			
    		}
    		
    		//Round 2

    		number1 = (int)(Math.random() * difficulty);
    		number2 = (int)(Math.random() * difficulty);
    		correctAnswer = number1 + number2;
    		
    			//Ask the user to add these two numbers together
    		System.out.println("**Round 2**");
    		System.out.println("What integer is " + number1 + " + " + number2 + "?");
    		System.out.println("Please enter integers only.");
    			//  Read in their response
    		studentAnswer = input.nextInt();
    		
    		
    		
    		if(studentAnswer == correctAnswer){
    				//If correct
    			System.out.println("Your answer was correct.");
    				//Give them points
    			score += difficulty;
    			System.out.println("Your score is now: " + score);
    				//Make the next question harder
    			difficulty *= 10;
    			System.out.println("Difficulty will be: " + difficulty);
    		}else{
    				//If not correct
    			System.out.println("Your answer was not correct.");
    				//Give the correct answer
    			System.out.println("The correct answer was: " + correctAnswer);
    				//Do not give them points
    			score += 0;
    				//Make the next question easier
    			if (difficulty > 10){
    				difficulty /= 10;
    				System.out.println("Your difficulty is now: " + difficulty);
    			}else{
    				System.out.println("difficulty is at the lowest level");
    				System.out.println("difficulty is now: " + difficulty);
    			}
    			
    			
    		}
    		
    		// Round 3
    			// Generate 2 random numbers
    		number1 = (int)(Math.random() * difficulty);
    		number2 = (int)(Math.random() * difficulty);
    		correctAnswer = number1 + number2;
    		
    			//  Ask the user to add these two numbers together
    		System.out.println("**Round 3**");
    		System.out.println("What integer is " + number1 + " + " + number2 + "?");
    		System.out.println("Please enter integers only.");
    			//Read in their response
    		studentAnswer = input.nextInt();
    			//Check if the answer was correct
    		if(studentAnswer == correctAnswer){
    				//If correct
    			System.out.println("Your answer was correct.");
    				//Give them points
    			score += difficulty;
    			System.out.println("Your score is now: " + score);
    				//Make the next question harder
    			difficulty *= 10;
    			System.out.println("difficulty will be: " + difficulty);
    		}else{
    				//If not correct
    			System.out.println("Your answer was not correct.");
    				//Give the correct answer
    			System.out.println("The correct answer was: " + correctAnswer);
    				//Do not give them points
    			score += 0;
    				//Make the next question easier
    			if (difficulty > 10){
    				difficulty /= 10;
    				System.out.println("difficulty is now: " + difficulty);
    			}else{
    				System.out.println("difficulty is at the lowest level");
    				System.out.println("difficulty is now: " + difficulty);
    			}
    			
    			
    		}
    		
    		// Round 4
    			//Generate 2 random numbers
    		number1 = (int)(Math.random() * difficulty);
    		number2 = (int)(Math.random() * difficulty);
    		correctAnswer = number1 + number2;
    		
    			//Ask the user to add these two numbers together
    		System.out.println("**Round 4**");
    		System.out.println("What integer is " + number1 + " + " + number2 + "?");
    		System.out.println("Please enter integers only.");
    			//Read in their response
    		studentAnswer = input.nextInt();
    			//Check if the answer was correct
    		if(studentAnswer == correctAnswer){
    			//If correct
    			System.out.println("Your answer was correct.");
    				//Give them points
    			score += difficulty;
    			
    		}else{
    				//if not correct
    			System.out.println("Your answer was not correct.");
    				//give the correct answer
    			System.out.println("The correct answer was: " + correctAnswer);
    				//Do not give them points
    			score += 0;
    				//Make the next question easier
    			if (difficulty > 10){
    				difficulty /= 10;
    				System.out.println("difficulty is now: " + difficulty);
    			}else{
    				System.out.println("difficulty is at the lowest level");
    				System.out.println("difficulty is now: " + difficulty);
    			}
    			
    			
    		}

    		System.out.println("Your final score is: " + score);

         
         
    } 
}








