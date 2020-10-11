package practice6.exercise7;

public class ByEqualAttribute implements Filter{

    @Override
    public boolean satisfy(Document document) {
        return true;
        // return document.getAttribute();
    }
}
