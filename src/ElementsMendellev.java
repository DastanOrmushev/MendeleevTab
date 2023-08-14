public enum ElementsMendellev {
    H(1,"Водород");

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
