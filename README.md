Mystic Riddles - Java Console Game

Description/Overview

Mystic Riddles is a cool puzzle game built in Java, running right from your console. It throws tricky riddles at you, keeping things fresh and puzzling. If stuck, the hint feature nudges you forward - clues get sharper every time you mess up. You’ve got five shots per riddle to crack it before jumping to the next one. Built around core OOP ideas, this app makes learning feel like playtime without dragging lessons into focus.

Key Features:

· 10 challenging riddles with progressive hint system
Monitoring scores and providing feedback on performance
Emoji visuals and an easy-to-use console interface
· Robust error handling and input validation
Code architecture that is both modular and extensible

OOP Concepts Applied

Encapsulation

- All class fields are declared with the correct access modifiers, such as private and protected.  
Controlled access to object properties is made possible by getters and setters.  
- The internal game state is kept hidden from outside changes.  

// Example from Riddle.java
protected String question;
protected String answer;
protected String[] hints;

public String getQuestion() {
    return question;
}

Passing down

· TextRiddle class inherits from abstract Riddle class
Subclasses preserve the fundamental structure while expanding functionality.
· Superclass constructor called using super() keyword

public class TextRiddle extends Riddle {
    public TextRiddle(String question, String answer, String[] hints) {
        super(question, answer, hints); // Inheritance in action
    }
}

Polymorphism

- Method overriding in the TextRiddle class with the checkAnswer() method.
- Dynamic method binding through references from the superclass.
- The same interface is used for different riddle types.

@Override
public boolean checkAnswer(String userAnswer) {
    return this.answer.equalsIgnoreCase(userAnswer.trim());
}

Abstraction

· Riddle abstract class defines common structure and behavior
· Abstract methods enforce implementation in subclasses
· High-level game logic separated from specific implementations

public abstract class Riddle {
    public abstract boolean checkAnswer(String userAnswer);
}

Program Structure

Class Relationships

MysticRiddlesGame (Main Class)
    │
    ├── manages: Riddle[] array
    │
    └── Riddle (Abstract Class)
            │
            └── TextRiddle (Concrete Class)

Main Classes and Their Roles:



1. MysticRiddlesGame - Main controller class

Handles how the game moves forward while dealing with what players do

Keeps an eye on your points, also shows how you're doing over time

· Handles exceptions

2. Riddle - Abstract base class

Explains shared traits plus how riddles act

Handles clues while reviewing responses

Offers a blueprint for certain kinds of puzzles

3. TextRiddle - Concrete implementation

· Implements logic for text-based riddles

• Ignores whether letters are big or small when checking replies

Builds from basic riddle traits using fresh twists now then



How to Run the Program



Prerequisites



· Java Development Kit (JDK) 8 or higher

Got command line or terminal entry



Step-by-Step Instructions



1. Store the Java files together in one folder

· Riddle.java

· TextRiddle.java

· MysticRiddlesGame.java

2. Launch terminal or command line, then move into the folder where your Java files are stored

3. Compile the program:

javac .java

4. Run the game:

java MysticRiddlesGame

5. Just do what the screen tells you to start playing



Sample Output



🎮 Welcome to MYSTIC RIDDLES! 🎮

=================================

Rules:
- You have 5 tries for each riddle
- Every time you pick the wrong answer, it nudges you toward the right one
- Nail it before you jump to the following one

=================================


Question 1: I’m high as a kid, but get smaller when grown. So what’s my name?

Your answer: tree
Oops! That’s not right. You’ve tried once - 4 shots left
I’m not living, yet I expand. What am I?

Please try again!

Your answer: candle
Cool - you nailed it!
Yep! Got it right – your result: 1 out of 1

- - Next Riddle - -

Q2: Got keys yet can't unlock anything. There's space inside, though no place to stay.

Your response: [user input]
Author and Acknowledgement
Author: [Your Name Here]
Course: CS 211 - Object Oriented Programming

Instructor: Fatima Marie P. Agdon - she holds an MSCS


Acknowledgements:

• Takes cues from old-school brain teasers, mixed with tricky problem-solving tasks

Shoutout to the folks behind Java’s docs

Big shout-out to the teacher for helping out with OOP stuff


Future Enhancements

1. Additional Riddle Types: Implement math riddles, logic puzzles, and visual riddles
2. Difficulty Levels: Add easy, medium, and hard difficulty settings
3.Save System: Implement game progress saving and loading
4. Multiplayer Mode: Add competitive multiplayer functionality
5. GUI Version: Develop a graphical user interface version
6. Riddle Editor: Let folks build puzzles then swap them online
7. Achievement System: Implement badges and accomplishments
8. Sound Effects: Include sounds that respond to actions - this helps users feel more engaged


References

· Oracle Java Documentation
· OOP Principles and Design Patterns
· Java Coding Conventions and Best Practices
· Game Development Fundamentals

GitHub Link - https://github.com/solokite/Java-OOP
