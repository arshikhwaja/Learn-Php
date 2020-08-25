package com.microproject.learnphp;

public class QuestionContainer {
    private String[] questionsA= {"One","Two","One1","Two1","One2","Two2"};

    private String[][] answersA = {
            {"a","b","c","d","c"},
            {"a","b","c","d","a"},
            {"a","b","c","d","d"}
    };
    public String[] getQuestionsA() {
        return questionsA;
    }

    public void setQuestionsA(String[] questionsA) {
        this.questionsA = questionsA;
    }

    public String[][] getAnswersA() {
        return answersA;
    }

    public void setAnswersA(String[][] answersA) {
        this.answersA = answersA;
    }
}