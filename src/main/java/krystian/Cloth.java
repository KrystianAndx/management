package pl.krystian;

public class Cloth extends Product{
    private String size;
    private String material;

    public Cloth(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.material = material;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
    public String toString() {
        return super.toString() + "Cloth {" + size +", material " + material + "}";
    }
}
