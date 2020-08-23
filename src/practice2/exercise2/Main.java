package practice2.exercise2;

public class Main {

    public static void main(String[] args) {

        Company c = new Company();
        Poll aa = new Poll("Gaston", "Rodrigo", 4);
        Poll bb = new Poll("Gilberto", "Mica", 3);
        Poll cc = new Poll("Maria", "Paula", 1);

        c.addSurveysConducted(aa);
        c.addSurveysConducted(bb);
        c.addSurveysConducted(cc);

        System.out.println(aa.getPollId());
        System.out.println(bb.getPollId());
        System.out.println(cc.getPollId());
        System.out.println("Cantidad encuestas: "+Poll.quantityPoll);
        System.out.println(c.getQuantityEmployeeSurvey(3));
        System.out.println(c.getSize());
    }

}
