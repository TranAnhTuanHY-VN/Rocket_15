package entity.Exercise4;

public class MyNumber<N extends Number>{
    private N myNumber;

    public N getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(N myNumber) {
        this.myNumber = myNumber;
    }

    public MyNumber(N myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "myNumber=" + myNumber +
                '}';
    }

}
