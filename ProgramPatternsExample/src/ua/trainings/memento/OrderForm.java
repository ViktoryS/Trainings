package ua.trainings.memento;

public class OrderForm {
    private String productName;
    private int count;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public FormSender send(){
        return new FormSender(productName, count);
    }

    public void undo(FormSender sender){
        productName = sender.getProductName();
        count = sender.getCount();
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "productName='" + productName + '\'' +
                ", count=" + count +
                '}';
    }
}
