import java.util.Scanner;


public class MysticRiddlesGame {
    private Riddle[] riddles; 
    private int score;
    private Scanner scanner;
    
    public MysticRiddlesGame() {
        this.scanner = new Scanner(System.in);
        this.score = 0;
        initializeRiddles(); 
    }
   
    private void initializeRiddles() {
        riddles = new Riddle[10];
      
        String[] hints1 = {
            "Hint 1.1: I'm not alive, but I can grow",
            "Hint 1.2: I don't have lungs, but I need air",
            "Hint 1.3: I can die without water",
            "Hint 1.4: People light me for celebrations",
            "Hint 1.5: I have a wick and provide light"
        };
        riddles[0] = new TextRiddle(
            
            "Question 1: I'm tall when I'm young, and I'm short when I'm old. What am I?",
            "candle", hints1
        );
        
        
        String[] hints2 = {
            "Hint 2.1: I have keys but no locks",
            "Hint 2.2: I have space but no room",
            "Hint 2.3: You can enter but not go outside",
            "Hint 2.4: I'm used for typing",
            "Hint 2.5: I'm a computer peripheral"
        };
        riddles[1] = new TextRiddle(
            "Question 2: I have keys but open no locks. I have space but no room. You can enter but not go outside. What am I?",
            "keyboard", hints2
        );
        
        
        String[] hints3 = {
            "Hint 3.1: I speak without a mouth and hear without ears",
            "Hint 3.2: I have no body, but I come alive with wind",
            "Hint 3.3: What you hear but never see",
            "Hint 3.4: I'm an echo of sound",
            "Hint 3.5: I bounce back what you send out"
        };
        riddles[2] = new TextRiddle(
            "Question 3: What speaks without a mouth and hears without ears?",
            "echo", hints3
        );
        
        
        String[] hints4 = {
            "Hint 4.1: I have cities but no houses",
            "Hint 4.2: I have forests but no trees",
            "Hint 4.3: I have rivers but no water",
            "Hint 4.4: You can study me in geography",
            "Hint 4.5: I'm a representation of the world"
        };
        riddles[3] = new TextRiddle(
            "Question 4: I have cities but no houses, forests but no trees, and rivers but no water. What am I?",
            "map", hints4
        );
        
        
        String[] hints5 = {
            "Hint 5.1: I'm lighter than a feather",
            "Hint 5.2: You can't hold me for long",
            "Hint 5.3: I'm invisible but you can feel me",
            "Hint 5.4: I can be warm or cold",
            "Hint 5.5: I make leaves rustle"
        };
        riddles[4] = new TextRiddle(
            "Question 5: What can you catch but not throw?",
            "cold", hints5
        );
        
        
        String[] hints6 = {
            "Hint 6.1: I have a head and a tail but no body",
            "Hint 6.2: I'm often made of metal",
            "Hint 6.3: People flip me for decisions",
            "Hint 6.4: I have two sides",
            "Hint 6.5: I'm used in coin tosses"
        };
        riddles[5] = new TextRiddle(
            "Question 6: What has a head and a tail but no body?",
            "coin", hints6
        );
        
        
        String[] hints7 = {
            "Hint 7.1: I'm full of holes but still hold water",
            "Hint 7.2: You use me in the kitchen",
            "Hint 7.3: I'm often made of metal or plastic",
            "Hint 7.4: I help you drain pasta",
            "Hint 7.5: I'm a kitchen utensil with many small openings"
        };
        riddles[6] = new TextRiddle(
            "Question 7: What is full of holes but still holds water?",
            "sponge", hints7
        );
        
        
        String[] hints8 = {
            "Hint 8.1: The more you take, the more you leave behind",
            "Hint 8.2: I'm associated with walking",
            "Hint 8.3: I'm not physical but I mark your path",
            "Hint 8.4: You create me as you move",
            "Hint 8.5: Animals make me in snow or sand"
        };
        riddles[7] = new TextRiddle(
            "Question 8: The more you take, the more you leave behind. What am I?",
            "footsteps", hints8
        );
        
        
        String[] hints9 = {
            "Hint 9.1: I have hands but cannot clap",
            "Hint 9.2: I have a face but no eyes",
            "Hint 9.3: I run but never walk",
            "Hint 9.4: I tell you the time",
            "Hint 9.5: I'm found on walls or wrists"
        };
        riddles[8] = new TextRiddle(
            "Question 9: What has hands but cannot clap?",
            "clock", hints9
        );
        
        
        String[] hints10 = {
            "Hint 10.1: I'm broken without being held",
            "Hint 10.2: I involve words and trust",
            "Hint 10.3: I can be made between people",
            "Hint 10.4: I'm often sealed with a handshake",
            "Hint 10.5: I'm a verbal commitment"
        };
        riddles[9] = new TextRiddle(
            "Question 10: What gets broken without being held?",
            "promise", hints10
        );
    }
    
    public void startGame() {
        System.out.println();
        System.out.println("          ╔════════════════════════════════════════════════════╗");
        System.out.println("          ║              Welcome to Mystic Riddles             ║");
        System.out.println("          ╚════════════════════════════════════════════════════╝");
        System.out.println("");
        System.out.println("             Embark on a journey through 10 mystic riddles.");
        System.out.println("       You have 5 attempts for each riddle, with hints along the way.");
        System.out.println("       Each correct answer earns you 1 point on your arcane score.");
        System.out.println("       If all attempts are used, the true answer will be revealed.");
        System.out.println("       May your wit be sharp and your insight keen.");
        System.out.println("");
        System.out.println("=========================================================================");
        System.out.println();
        
        //     ========= POLYMORPHISM ========
        for (int i = 0; i < riddles.length; i++) {
            Riddle currentRiddle = riddles[i];
            boolean answeredCorrectly = playRiddle(currentRiddle, i + 1);
            
            if (answeredCorrectly) {
                score++;
                System.out.println("╔════════════════════════════════════════════════════╗");
                System.out.println("║   Correct! Your Score: " + score + "/" + (i + 1) + "                         ║");
                System.out.println("╚════════════════════════════════════════════════════╝");
            } else {
                System.out.println("Moving to next riddle...");
            }
            
            if (i < riddles.length - 1) {
                System.out.println("\n Next mystical riddle...\n");
            }
        }
        
        displayFinalScore();
    }
    
    private boolean playRiddle(Riddle riddle, int questionNumber) {
        System.out.println(riddle.getQuestion());
        riddle.resetHints(); 
        
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;
        
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            
            if (riddle.checkAnswer(userAnswer)) {
                System.out.println("==============================================================");
                System.out.println("  Mystictastic! Splendid sorcery, got that right young one ");
                System.out.println("==============================================================");
                return true;
            } else {
                attempts++;
                System.out.println("");
                System.out.println("==============================================================");
                System.out.println("  Unfortunate miscast! There's still a lot to learn, young one. \n   Attempts used: " + attempts + "/" + MAX_ATTEMPTS);
                System.out.println("==============================================================");
                
                if (riddle.hasMoreHints()) {
                    String hint = riddle.getNextHint();
                    System.out.println("╔═════════════════════════════════════════════════════════════╗");
                    System.out.println("      " + hint + "     ");
                    System.out.println("╚═════════════════════════════════════════════════════════════╝");
                }
                
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Try again!\n");
                }
            }
        }
        
        System.out.println("The knowledge you seek is: " + riddle.getAnswer());
        return false;
    }
    
    private void displayFinalScore() {
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║  " + "Your mystic journey concludes." + "                             ║");
        System.out.println("║  " +"Final Score: " + score + "/" + riddles.length + "                                          ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");
        
        if (score == riddles.length) {
            System.out.println("Marvelous! You have unraveled the riddle with true sorcery!");
        } else if (score >= riddles.length * 0.7) {
            System.out.println("A valiant attempt, apprentice. Continue your studies with diligence!");
        } else if (score >= riddles.length * 0.5) {
            System.out.println("A fine attempt, young one. Practice shall refine your craft!");
        } else {
            System.out.println("Do not falter! young one");
            
        }
        
    }
    
    public void closeGame() {
        try {
            scanner.close();
            System.out.println("\nThank you for playing Mystic Riddles!");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error closing game resources: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        MysticRiddlesGame game = new MysticRiddlesGame();
        
        try {
            game.startGame();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            game.closeGame();
        }
    }
}