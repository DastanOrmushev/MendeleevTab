public enum ElementsMendellev {
    H(1,"Водород"),
    He(2,"Гелий"),
    Li(3,"Литий");
    private final int num;
    private final String name;

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    ElementsMendellev(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
