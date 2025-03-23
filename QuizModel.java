package model;

import java.util.ArrayList;
import java.util.List;

public class QuizModel {

    private List<String> questions;
    private List<String[]> options;
    private List<String> correctAnswers;

    public QuizModel() {
    
        questions = new ArrayList<>();
        options = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        questions.add("Which planet is closest to the Sun?");
        options.add(new String[]{"1.Earth","2.Mercury","3.Mars","4.Venus"});
        correctAnswers.add("2");

        questions.add("Who invented the light bulb?");
        options.add(new String[]{"1.Nikola Tesla", "2.Albert Einstein","3.Thomas Edison","3.Alexander graham Bell"});
        correctAnswers.add("3");

        questions.add("What is the hardest natural substance on Earth??");
        options.add(new String[]{"1. Gold","2.Diamond","3.Iron","4.Steel"});
        correctAnswers.add("2");
    }
    public int getTotalQuestions() {
        return questions.size();
    }
    public String getQuestion(int index) {
        return questions.get(index);
    }
    public String[] getOptions(int index) {
        return options.get(index);
    }
    public String getCorrectAnswer(int index) {
        return correctAnswers.get(index);
    }
}