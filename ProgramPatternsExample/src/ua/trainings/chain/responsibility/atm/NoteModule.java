package ua.trainings.chain.responsibility.atm;

public class NoteModule {
    private int rating;
    public NoteModule(int rating){
        this.rating = rating;
    }

    private NoteModule next;
    public void setNext(NoteModule next) {
        this.next = next;
    }

    private int count;
    public int getCount() {
        return count;
    }

    public void operate(int amount){
        if(amount >= rating){
            count = amount/rating;
            amount -= rating*count;
            printMessage();
        }
        if(next != null && amount != 0) {
            next.operate(amount);
        }else if(amount == 0){
            return;
        }else{
            printError();
        }
    }

    private void printMessage(){
        System.out.println("NoteModule with rating " + rating + " had been output in count " + count);
    }

    private void printError(){
        System.out.println("ERROR! This ATM can't manage your amount.");
    }
}
