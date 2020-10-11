package practice6.exercise7;

import java.util.Vector;

public class Historian {

    private Filter filter;
    private Vector<Document> documents;

    public Historian(){
        documents = new Vector<>();
    }

    public void addDocument(Document document){
        documents.add(document);
    }

    public void removeDocument(Document document){
        documents.remove(document);
    }

    public Vector<Document> getDocuments(){
        Vector<Document> aux = new Vector<>();
        for(int i=0; i<documents.size(); i++){
            Document d = documents.elementAt(i);
            if(d.satisfy(this.filter))
                aux.add(d);
        }
        return aux;
    }
}
