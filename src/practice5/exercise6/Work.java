package practice5.exercise6;

import java.util.Vector;

public class Work {

    private String name;
    private Vector<String> keywords;

    public Work(String name){
        this.name = name;
        keywords = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addKeyword(String keyword){
        keywords.add(keyword);
    }

    public void removeKeyword(String keyword){
        keywords.remove(keyword);
    }

    public Vector<String> getKeywords(){
        return (Vector<String>) keywords.clone();
    }

    public String printKeywords(){
        return keywords.toString();
    }

    public boolean qualifiedEvaluator(){
        return true;
    }
}
