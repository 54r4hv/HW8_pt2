# HW8_pt2 

##Intro

Translated my addition game into markdown report

##Code

``` java

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

```

##Console Output

```
**Round 1**
What integer is 1 + 1?
2
Your answer was correct.
Your score is now: 10
Difficulty will be: 100
**Round 2**
What integer is 75 + 11?
Please enter integers only.
86
Your answer was correct.
Your score is now: 110
Difficulty will be: 1000
**Round 3**
What integer is 333 + 312?
Please enter integers only.
645
Your answer was correct.
Your score is now: 1110
difficulty will be: 10000
**Round 4**
What integer is 9270 + 8514?
Please enter integers only.
17784
Your answer was correct.
Your final score is: 11110

-----------------------------------------------------------

**Round 1**
What integer is 5 + 3?
4
Your answer was not correct.
The correct answer was: 8
Difficulty is at the lowest level
Difficulty is now: 10
**Round 2**
What integer is 1 + 1?
Please enter integers only.
1
Your answer was not correct.
The correct answer was: 2
difficulty is at the lowest level
difficulty is now: 10
**Round 3**
What integer is 6 + 9?
Please enter integers only.
8
Your answer was not correct.
The correct answer was: 15
difficulty is at the lowest level
difficulty is now: 10
**Round 4**
What integer is 5 + 4?
Please enter integers only.
4
Your answer was not correct.
The correct answer was: 9
difficulty is at the lowest level
difficulty is now: 10
Your final score is: 0
```

##Command Prompt

```
Microsoft Windows [Version 10.0.10240]
(c) 2015 Microsoft Corporation. All rights reserved.

C:\Users\denise>cd desktop

C:\Users\denise\Desktop>cd workspace

C:\Users\denise\Desktop\workspace>cd game

C:\Users\denise\Desktop\workspace\Game>echo # HW8_pt2 >> README.md

C:\Users\denise\Desktop\workspace\Game>git init
Reinitialized existing Git repository in C:/Users/denise/Desktop/workspace/Game/.git/

C:\Users\denise\Desktop\workspace\Game>git add README.md

C:\Users\denise\Desktop\workspace\Game>git commit -m "first commit"
[master (root-commit) 5ebef31] first commit
 1 file changed, 2 insertions(+)
 create mode 100644 README.md

C:\Users\denise\Desktop\workspace\Game>git remote add origin https://github.com/54r4hv/HW8_pt2.git
fatal: remote origin already exists.

C:\Users\denise\Desktop\workspace\Game>git push -u origin master
Username for 'https://github.com': 54r4hv
Password for 'https://54r4hv@github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 238 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/54r4hv/HW8_pt2.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

C:\Users\denise\Desktop\workspace\Game>git add .

C:\Users\denise\Desktop\workspace\Game>git commit -m "second"
[master 3ecf113] second
 4 files changed, 220 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/Game.class
 create mode 100644 src/Game.java

C:\Users\denise\Desktop\workspace\Game>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': 54r4hv
Password for 'https://54r4hv@github.com':
Counting objects: 8, done.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (8/8), 2.89 KiB | 0 bytes/s, done.
Total 8 (delta 0), reused 0 (delta 0)
To https://github.com/54r4hv/HW8_pt2.git
   5ebef31..3ecf113  master -> master

C:\Users\denise\Desktop\workspace\Game>git add .

C:\Users\denise\Desktop\workspace\Game>git commit -m "third"
[master 521f305] third
 3 files changed, 268 insertions(+), 7 deletions(-)

C:\Users\denise\Desktop\workspace\Game>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': 54r4hv
Password for 'https://54r4hv@github.com':
Counting objects: 7, done.
Compressing objects: 100% (5/5), done.
Writing objects: 100% (7/7), 964 bytes | 0 bytes/s, done.
Total 7 (delta 3), reused 0 (delta 0)
To https://github.com/54r4hv/HW8_pt2.git
   3ecf113..521f305  master -> master

C:\Users\denise\Desktop\workspace\Game>git add .

C:\Users\denise\Desktop\workspace\Game>git commit -m "added more stuff"
[master faee3a8] added more stuff
 1 file changed, 1 insertion(+), 3 deletions(-)

C:\Users\denise\Desktop\workspace\Game>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': 54r4hv
Password for 'https://54r4hv@github.com':
Counting objects: 3, done.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 330 bytes | 0 bytes/s, done.
Total 3 (delta 2), reused 0 (delta 0)
To https://github.com/54r4hv/HW8_pt2.git
   521f305..faee3a8  master -> master

C:\Users\denise\Desktop\workspace\Game>
```

##Summary
Translation of my addition game to a markdown report. 