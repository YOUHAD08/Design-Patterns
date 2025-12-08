package ma.youhad.composite_pattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Composite root = new Composite("Root");
        Composite composite1 = new Composite("Composite 1");
        Composite composite2 = new Composite("Composite 2");
        Element element1 = new Element("Element 1");
        Element element2 = new Element("Element 2");
        Element element3 = new Element("Element 3");

        root.addChild(composite1);
        root.addChild(element1);
        composite1.addChild(composite2);
        composite1.addChild(element2);
        composite2.addChild(element3);

        root.print();
    }
}
