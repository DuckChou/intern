public class Study {
    int units;
    private String name;

    public Study(int units, String name) {
        this.units = units;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int addUnits(Study s1,Study s2){
        return s1.units+s2.units;
    }
}
