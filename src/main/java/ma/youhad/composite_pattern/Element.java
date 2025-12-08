package ma.youhad.composite_pattern;

public class Element extends Component {
    public Element(String Name) {
        super(Name);
    }

    @Override
    public void print() {
        System.out.println(addTabs() + "Element :" + Name);
    }
}
