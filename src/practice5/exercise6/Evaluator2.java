package practice5.exercise6;

import utils.ContainsOne;

import java.util.Vector;

public abstract class Evaluator2 {

    private String name;
    protected ContainsOne topics;
    protected Vector<String> knownTopics;

    public Evaluator2(String name){
        this.name = name;
        knownTopics = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addKnownTopic(String topic){
        knownTopics.add(topic);
    }

    public void removeKnownTopic(String topic){
        knownTopics.remove(topic);
    }

    public abstract boolean isSuitable(Work work);

    public boolean containsOne(Vector<String> s){
        return topics.containsOne(s);
    }

}
