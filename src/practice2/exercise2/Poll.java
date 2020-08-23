package practice2.exercise2;

import java.util.Vector;

public class Poll {

    private int pollId;
    private Vector<String> question;
    private String surveyedPerson;
    private String surveyPerson;
    private int dni;
    private boolean surveyAnswered;
    private static int quantityPoll;

    private Poll(){
        this.pollId = ++quantityPoll;
    }

    public Poll(String surveyedPerson, String surveyPerson, int dni) {
        this();
        question = new Vector<>();
        this.surveyedPerson = surveyedPerson;
        this.surveyPerson = surveyPerson;
        this.dni = dni;
        surveyAnswered = false;
    }

    public int getPollId(){
        return pollId;
    }

    public void addQuestion(String e){
        question.add(e);
    }

    public void deleteQuestion(String e){
        question.remove(e);
    }

    public String getSurveyedPerson() {
        return surveyedPerson;
    }

    public void setSurveyedPerson(String surveyedPerson) {
        this.surveyedPerson = surveyedPerson;
    }

    public String getSurveyPerson() {
        return surveyPerson;
    }

    public void setSurveyPerson(String surveyPerson) {
        this.surveyPerson = surveyPerson;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isSurveyAnswered() {
        return surveyAnswered;
    }

    public static int getQuantityPoll(){
        return quantityPoll;
    }

    public void finishPoll(){
        this.surveyAnswered = true;
    }

}
