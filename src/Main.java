public class Main {
    public static void main(String[] args) {
        for (ElementsMendellev elements:ElementsMendellev.values()) {
            System.out.println("Элемент: " +elements.getName()+"; Периодический номер: "+elements.getNum());
        }
    }
}