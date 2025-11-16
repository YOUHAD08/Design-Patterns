package ma.youhad.pattern_composite;

public class Element extends Component {
    public Element(String Name) {
        super(Name);
    }

    @Override
    public void print() {
        System.out.println(addTabs() + "Element :" + Name);
    }
}
