package practice2.exercise2;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();
        Poll a = new Poll("Gaston", "Rodrigo", 4);
        Poll b = new Poll("Gilberto", "Mica", 3);
        Poll c = new Poll("Maria", "Paula", 1);
        Poll d = new Poll("Gilberto", "Paula", 3);

        company.addSurveysConducted(a);
        company.addSurveysConducted(b);
        company.addSurveysConducted(c);
        company.deleteSurveysConducted(a);
        company.addSurveysConducted(d);

        b.finishPoll();
        d.finishPoll();

        System.out.println("Cantidad de encuestas creadas: "+ Poll.getQuantityPoll());
        System.out.println("Cantidad de encuestas actuales: "+company.getSize());
        System.out.println(
                "Encuestas respondidas con el dni 3: "+ company.getQuantityEmployeeSurvey(3)
        );
    }

}
