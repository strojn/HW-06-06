public class Main {
    public static void main(String[] args) {

        System.out.println("\nКолір BMW : " + Vehicles.BMW.getColor());
        System.out.println("Ціна BMW : " + Vehicles.BMW.price);

        Vehicles kia = Vehicles.KIA;
        kia.setColor("білий");
        System.out.println(kia);
    }
}