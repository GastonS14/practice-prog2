package practice5.exercise6;

public class ExclusiveEvaluator extends Evaluator{

    public ExclusiveEvaluator(String name) {
        super(name);
    }

    @Override
    public boolean isSuitable(Work work){
        return knownTopics.containsAll(work.getKeywords());
    }
}