package Models;

import java.io.Serializable;

public class Product implements Serializable{
    private String productID;
    private String productName;
    private String productCategory;
    private String productStock;
    private int productQuantity;
    private long productPrice;

    public Product() {
    }

    public Product(String productID, String productName, String productCategory, String productStock, int productQuantity, long productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductStock() {
        return productStock;
    }

    public void setProductStock(String productStock) {
        this.productStock = productStock;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", productName=" + productName + ", productCategory=" + productCategory + ", productStock=" + productStock + ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + '}';
    }

   
}
