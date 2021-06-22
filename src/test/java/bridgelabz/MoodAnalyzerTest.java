package bridgelabz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer;

    @Test
    public void givenNull_shouldReturnHappy(){
        moodAnalyzer = new MoodAnalyzer("SAD");
        String result = moodAnalyzer.analyseMood();
        assertEquals("SAD", result);

    }
}
