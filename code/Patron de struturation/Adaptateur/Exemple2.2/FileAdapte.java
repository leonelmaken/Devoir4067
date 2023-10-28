public class FileAdapte extends File implements Stack {

    @Override
    public void push(int data) {
        insertionEnQueue(data);
    }

    @Override
    public int pop() {
        return supprimerEnTete();
    }

    @Override
    public int top() {
        return voirEnTete();
    }
}
