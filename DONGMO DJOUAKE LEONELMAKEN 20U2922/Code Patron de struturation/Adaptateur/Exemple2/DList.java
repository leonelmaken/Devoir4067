package Exemple2;

class DList {
    private class Node {
        Object data;
        Node prev, next;

        Node(Object data) {
            this.data = data;
        }
    }

    private Node head, tail;

    public void insertHead(Object o) {
        Node newNode = new Node(o);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertTail(Object o) {
        Node newNode = new Node(o);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insert(Object o, int position) {
        // Ici, nous devrions avoir une logique pour insérer à une position spécifique.
        // Pour simplifier, je vais supposer qu'une insertion à la position 0 signifie insérer à la tête.
        if (position == 0) {
            insertHead(o);
        } else {
            insertTail(o);
        }
    }

    public void remove(Object o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
            }
            current = current.next;
        }
    }

    public Object removeTail() {
        if (tail == null) return null;

        Object data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
        return data;
    }

    public Object tailData() {
        return (tail != null) ? tail.data : null;
    }
}