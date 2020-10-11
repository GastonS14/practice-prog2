package TPE;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Main2 {


    public static void main(String[] args) {

        /*
        //Actual Answers
        Map<Integer, String> first = new Hashtable<>();
        first.put(1, "J");
        first.put(2, "B");
        first.put(3, "C");

        //User Answers
        Map<Integer, String> second = new Hashtable<>();
        second.put(1, "A");
        second.put(4, "B");
        second.put(5, "A");
        checkAnswers(first, second);

        Hashtable<String, Integer> one = new Hashtable<>();
        one.put("a", 1);
        one.put("b", 2);
        one.put("c", 400);

        Hashtable<String, Integer> two = new Hashtable<>();
        two.put("a", 1);
        two.put("b", 21);
        two.put("j", 44);
        checkEquals(one, two);
         */

        HashSet<String> set1 = new HashSet <String>();
        HashSet <String> set2 = new HashSet <String>();
        set1.add("Mat");
        set1.add("Sat");
        set1.add("Cat");
        System.out.println("Set1 = "+ set1);
        set2.add("Mat");
        System.out.println("Set2 = "+ set2);
        set1.removeAll(set2);
        System.out.println("Asymmetric difference = "+ set1);

        // Set
            // removeAll @returns boolean
                // true -> if some elements are removed
        //HashSet
            //removeAll @returns setOperation(minus)
                // set1.minus(set2)


    }

    public static void checkAnswers(Map<Integer, String> first, Map<Integer, String> second) {
        int chkcount = 0;
        for (Map.Entry<Integer, String> entry : second.entrySet()) {

            String actualAnswer = first.get(entry.getKey());
            String givenAnswer = entry.getValue();
            if (givenAnswer != null && actualAnswer != null && givenAnswer.equals(actualAnswer))
                chkcount = chkcount + 1;
        }
        System.out.println(chkcount);

    }

    public static void checkEquals(Hashtable<String, Integer> one, Hashtable<String, Integer> two) {
        int a = 0;
        for (Map.Entry<String, Integer> entry : two.entrySet()) {

            if(one.get(entry.getKey()) == null)
                a = 400;
        }
        System.out.println(a);

    }

}