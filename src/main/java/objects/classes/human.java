package objects.classes;

public class human {
    private int quantity;
    private int quality;
    private String name;

    public human(int quantity, int quality, String name) {
        this.quantity = quantity;
        this.quality = quality;
        this.name = name;
    }
    /*public void position() {
        int s = quantity + quality;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getQuality() {
        return quality;
    }

    public String getCountryCode() {
        return name;
    }

    public void setCountryCode(String name) {
        this.name = name;
    }*/

    @Override
    public String toString() {
        return "human{" + "quantity=" + quantity + ", quality=" + quality + ", name=" + name + '}';
    }
}