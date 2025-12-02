public class TextRiddle extends Riddle {
    
  public TextRiddle(String question, String answer, String[] hints) {
      super(question, answer, hints);
  }
  
  public boolean checkAnswer(String userAnswer) {
      return this.answer.equalsIgnoreCase(userAnswer.trim());
  }
}