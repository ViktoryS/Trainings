package ua.training;


public class Model {
    private String data;

    public String addStrToExistingData(String str){
        if (data == null)
            setData(str);
        else data += str;
        return data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
