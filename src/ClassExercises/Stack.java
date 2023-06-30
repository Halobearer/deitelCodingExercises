package ClassExercises;

public class Stack {

    private int count = 0;
    private boolean isEmpty = true;

    public Stack(int stackSize) {

    }

    public boolean isEmpty() {

        return isEmpty;
    }

    public void push(int element) {
        count++;
    }


}
