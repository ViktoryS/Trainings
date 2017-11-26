package ua.trainings.memento;

public class FormSender {
    private final String productName;
    private final int count;

    public FormSender(String productName, int count) {
        this.productName = productName;
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public int getCount() {
        return count;
    }
}
