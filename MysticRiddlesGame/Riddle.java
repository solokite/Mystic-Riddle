public abstract class Riddle {
  protected String question;
  protected String answer;
  protected String[] hints;
  protected int currentHintIndex;
  
  public Riddle(String question, String answer, String[] hints) {
      this.question = question;
      this.answer = answer;
      this.hints = hints;
      this.currentHintIndex = 0;
  }
  
  public abstract boolean checkAnswer(String userAnswer);
  
  public String getQuestion() {
      return question;
  }
  
  public String getAnswer() {
      return answer;
  }
  
  public String getNextHint() {
      if (currentHintIndex < hints.length) {
          return hints[currentHintIndex++];
      }
      return "All hints have been revealed; the path is now yours alone!";
  }
  
  public boolean hasMoreHints() {
      return currentHintIndex < hints.length;
  }
  
  public void resetHints() {
      currentHintIndex = 0;
  }
}