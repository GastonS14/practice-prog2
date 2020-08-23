package practice2.exercise2;

import java.util.Vector;

public class Company {

    private Vector<Poll> surveysConducted;

    public Company(){
        surveysConducted = new Vector<>();
    }

    public void addSurveysConducted(Poll e){
        surveysConducted.add(e);
    }

    public void deleteSurveysConducted(Poll e){
        surveysConducted.remove(e);
    }

    public int getQuantityEmployeeSurvey(int document){
        int quantity = 0;
        for (Poll poll : surveysConducted) {
            if(poll.getDni() == document)
                if (poll.isSurveyAnswered())
                    quantity++;
        }
        return quantity;
    }

    public int getSize(){
        return surveysConducted.size();
    }
}
