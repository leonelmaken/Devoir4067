package Exemple2;

class StackAdapter implements Stack {
    private DList list = new DList();

    @Override
    public void push(Object o) {
        list.insertTail(o);
    }

    @Override
    public Object pop() {
        return list.removeTail();
    }

    @Override
    public Object top() {
        return list.tailData();
    }
}
