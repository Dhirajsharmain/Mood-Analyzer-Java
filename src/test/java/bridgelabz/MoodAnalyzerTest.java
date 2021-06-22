package bridgelabz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer;

    @Test
    public void givenSad_shouldReturnSad(){
        moodAnalyzer = new MoodAnalyzer("SAD");
        String result = moodAnalyzer.analyseMood();
        assertEquals("SAD", result);

    }

    @Test
    public void givenAny_shouldReturnHappy(){
        moodAnalyzer = new MoodAnalyzer("any");
        String result = moodAnalyzer.analyseMood();
        assertEquals("HAPPY", result);

    }
}
