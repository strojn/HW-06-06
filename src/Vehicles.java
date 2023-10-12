public enum Vehicles {
    BMW(30000, "red"),
    KIA(15000, "white");
    final int price;
    private final String color;

    @Override
    public String toString() {
        return "Vehicle " +
                this.name() + " : " +
                "color='" + color + '\'' +
                ", price=" + price +
                ".";
    }

    public String getColor() {
        return color;
    }

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }
}
