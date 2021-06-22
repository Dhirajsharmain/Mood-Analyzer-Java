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

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    /**
     * Method for analyse respond Happy or Sad Mood
     * @return : HAPPY or SAD
     */
    public String analyseMood() {

        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("HAPPY");
        String result = moodAnalyzer.analyseMood();
        System.out.println(result + " MOOD");
    }
}
