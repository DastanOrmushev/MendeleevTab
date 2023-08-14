public enum ElementsMendellev {
    H(1,"Водород"),
    He(2,"Гелий"),
    Li(3,"Литий"),
    Be(4,"Берилий"),
    B(5,"Бор"),
    C(6,"Углерод"),
    N(7,"Азот"),
    O(8,"Кислород"),
    Xe(54,"Ксенон"),
    Og(118,"Оганесон");

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
