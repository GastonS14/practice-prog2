package practice5.exercise6;

public class Main {

    public static void main(String[] args) {

        Work work = new Work("Matematicas");
        work.addKeyword("trigonometria");
        work.addKeyword("algebra");
        work.addKeyword("cálculo");

        Evaluator e = new ExclusiveEvaluator("Alltopics");
        e.addKnownTopic("trigonometria");
        e.addKnownTopic("algebra");
        e.addKnownTopic("cálculo");

        Evaluator e1 = new InclusiveEvaluator("Onetopic");
        e1.addKnownTopic("trigonometria");

        System.out.println("Los temas sabidos son: " + work.printKeywords());
        System.out.println(e.getName() + " es apto? " + e.isSuitable(work));
        e.addWork(work);
        System.out.println("Cantidad de trabajos de evaluador " + e.getName() + " " + e.worksCount());
        System.out.println(e1.getName() + " es apto? " + e1.isSuitable(work));

        /*
        ContainsOne s10 = new ContainsOne();
        s10.addVector("a");
        s10.addVector("b");
        s10.addVector("c");

        Vector<String> s = new Vector<>();
        Vector<String> s1 = new Vector<>();
        Vector<String> s2 = new Vector<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s1.add("a");
        s1.add("b");
        s2.add("a");
        s2.add("j");

        System.out.println("s contiene todos los s1: " + s.containsAll(s1));
        // System.out.println("s contiene alguno de los s2: " + s.containsOne("a"));

        System.out.println("s10 contiene alguno de los s2: " + s10.containsOne(s2));
         */
    }
}
