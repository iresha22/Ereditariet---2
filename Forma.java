public class Forma {

    @Override
    public String toString() {
        return " " + calcolaArea(4,4);
    }

    int lengthSideA;
      int lengthSideB;


    public int calcolaArea(int lengthSideA, int lengthSideB){
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
       return lengthSideA * lengthSideB;
    }
}
