public enum Vehicles {
//    BMW(30000, "red"),
    BMW(30000),
//    KIA(15000, "white");
    KIA(15000);
    public final int price;
    private String color = "червоний";

    Vehicles(int price) {
        this.price = price;
    }

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
    public void setColor(String color) {
        this.color = color;
    }

//    Vehicles(int price, String color) {
//        this.price = price;
//        this.color = color;
//    }
}
