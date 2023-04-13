package java32;

public class TV implements Electronics {

    private static final String TYPE = "TV";
    private final String name;
    private boolean state;

    public TV(String name) {
        this.name = name;
        this.state = false;
    }

    public String getType() {
        return TYPE;
    }

    public String getName() {
        return this.name;
    }

    public void turnOn() {
        if (state) {
            System.out.println(TYPE + " ALREADY ON!");
        } else {
            this.state = true;
            System.out.println(TYPE + " TURNED ON!");
        }
    }

    public void turnOff() {
        if (!state) {
            System.out.println(TYPE + " ALREADY OFF!");
        } else {
            this.state = false;
            System.out.println(TYPE + " TURNED OFF!");
        }
    }

    @Override
    public String toString() {
        return "TV {" +
                "name = '" + name + '\'' +
                ", state = " + state +
                '}';
    }
}
