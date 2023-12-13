public class File {
    protected Node head, tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertionEnQueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int supprimerEnTete() {
        if (head == null)
            return Integer.MIN_VALUE; // Indique une file vide

        Node temp = head;
        head = head.next;
        if (head == null)
            tail = null;
        return temp.data;
    }

    // Cette méthode retourne la tête sans la supprimer
    public int voirEnTete() {
        if (head == null)
            return Integer.MIN_VALUE; // Indique une file vide
        return head.data;
    }
}

