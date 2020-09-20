package practice5.exercise6;

import java.util.Vector;

public abstract class Evaluator {

    private String name;
    protected Vector<String> knownTopics;
    protected Vector<Work> works;

    public Evaluator(String name){
        this.name = name;
        knownTopics = new Vector<>();
        works = new Vector<>();
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

    public void addWork(Work work){
        if(this.isSuitable(work))
            works.add(work);
    }

    public void removeWork(Work work){
        works.remove(work);
    }

    public int worksCount(){
        return this.works.size();
    }

}
