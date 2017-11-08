package ua.training;


public class Model {
    private int randomValue;
    private int minBarrier;
    private int maxBarrier;
    private String[] resultValues;
    private int resultValuesCount;

    public Model(){
        resultValues = new String[20];
        resultValuesCount = 0;
        minBarrier = GlobalConstants.MIN_BARRIER;
        maxBarrier = GlobalConstants.MAX_BARRIER;
    }

    public int getRandomValue() {
        return randomValue;
    }

    public void generateRandomValue() {
        this.randomValue = Utils.rand(this.minBarrier, this.maxBarrier);
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public String[] getResultValues() {
        return returnUserValues();
    }

    public void addResultValue(String value){
        if(resultValuesCount == resultValues.length){
            changeCapasity();
        }
        resultValues[resultValuesCount++] = value;
    }

    private void changeCapasity(){
        int newCapasity = resultValues.length + resultValues.length/3;
        String[] newResultValues = new String[newCapasity];
        System.arraycopy(resultValues, 0, newResultValues, 0, resultValues.length);
        resultValues = newResultValues;
    }

    private String[] returnUserValues(){
        String[] newResultValues = new String[resultValuesCount];
        System.arraycopy(resultValues, 0, newResultValues, 0, resultValuesCount);
        return newResultValues;
    }
}
