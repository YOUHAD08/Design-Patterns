package ma.youhad.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> Components = new ArrayList<>();
    public Composite(String Name) {
        super(Name);
    }

    @Override
    public void print() {
        System.out.println(addTabs() + "Composite :" + Name);
        for (Component component : Components) {
            component.print();
        }
    }
    public Component addChild(Component component){
        component.Level=this.Level+1;
        this.Components.add(component);
        return component;
    }
}
