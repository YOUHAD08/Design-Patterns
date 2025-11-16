package ma.youhad.pattern_composite;

public abstract class Component {
    protected String Name;
    protected int Level;
    public Component(String Name) {
        this.Name=Name;
    }

    public String addTabs() {
        String Tab="";
        for(int i = 0 ; i<Level; i++){
            Tab+="\t";
        }
        return Tab;
    }

    public abstract void print();
}
