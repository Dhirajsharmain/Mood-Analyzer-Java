# Mood-Analyzer-Java

**UC1-AnalyseMood**

_Description_ : Given a Message, ability to analyse and respond Happy or Sad Mood 
- Create MoodAnalyser Object - Call analyseMood function with message as
parameter and return Happy or Sad Mood

**UC2-HandleException**

_Description_ : Handle Exception if User Provides Invalid Mood
- Like NULL

**TC2.1** - Given Null Mood Should Return Happy To make this Test Case pass Handle NULL Scenario using try catch and return Happy

UC3-CustomException

_Description_ : Inform user if entered Invalid Mood
- In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException
- Use Enum to differentiate the Mood Analysis Errors.

**TC-3.1** :- Given NULL Mood Should Throw MoodAnalyzerException To pass this Test Case in try catch block
  throw MoodAnalyzerException

**TC-3.2** :- Given Empty Mood Should Throw MoodAnalyzerException indicating Empty Mood Handle Empty Mood Scenario throw
MoodAnalyzerException and inform user of the EmptyMood

HINT: Use Enum to EMPTY or NULL
