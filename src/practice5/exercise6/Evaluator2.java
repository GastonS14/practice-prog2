package practice5.exercise6;

import utils.ContainsOne;

import java.util.ArrayList;

public abstract class Evaluator2 {

    private String name;
    protected ContainsOne topics;
    protected ArrayList<String> knownTopics;

    public Evaluator2(String name){
        this.name = name;
        knownTopics = new ArrayList<>();
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

    public boolean containsOne(ArrayList<String> s){
        return topics.containsOne(s);
    }

}
