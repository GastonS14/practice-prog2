package practice5.exercise6;

import java.util.Vector;

public class InclusiveEvaluator extends Evaluator{

    public InclusiveEvaluator(String name) {
        super(name);
    }

    @Override
    public boolean isSuitable(Work work) {
        return this.containsOne(work.getKeywords());
    }

    private boolean containsOne(Vector<String> v){
        for(int i=0; i<v.size(); i++)
            if(knownTopics.contains(v.elementAt(i)))
                return true;
        return false;
    }
}
