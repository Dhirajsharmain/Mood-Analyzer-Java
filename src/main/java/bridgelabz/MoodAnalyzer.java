/**
 * ****************************************************************************
 * Purpose: This Class Mood Analyzer is implemented to Handle Custom Exceptions,
 * handle exception if user provides invalid mood, code to take the mood message
 * in constructor
 *
 * @author Dhiraj
 * @version 1.0
 * @since 21-06-2021 **********************************************************
 */

package bridgelabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyzerException {
        this.message = message;
        return analyseMood();
    }

    /**
     * Method for analyse respond Happy or Sad Mood
     * @return : HAPPY or SAD
     */
    public String analyseMood() throws MoodAnalyzerException {

        try {
            if (message.contains("SAD"))
                return "SAD";
            else if (message.contains(""))
                throw new MoodAnalyzerException("Empty Input");
            else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalyzerException("Null Input");
        }
    }

    public static void main(String[] args) throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("HAPPY");
        String result = moodAnalyzer.analyseMood();
        System.out.println(result + " MOOD");
    }
}
