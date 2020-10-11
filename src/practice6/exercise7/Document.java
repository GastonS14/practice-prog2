package practice6.exercise7;

import java.util.Vector;

public class Document {

    private String title;
    private String content;
    private Vector<String> authors;
    private Vector<String> keywords;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean satisfy(Filter f){
        return f.satisfy(this);
    }
}
