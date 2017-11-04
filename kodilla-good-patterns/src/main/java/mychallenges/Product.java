package mychallenges;

public class Product {

    private String nameOfProduct;
    private int quantityOfProduct;

    public Product(String nameOfProduct, int quantityOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
}
