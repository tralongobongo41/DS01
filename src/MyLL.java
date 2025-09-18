public class MyLL<T> {
    Node<T> head;
    int size;
    Node<T> tail;

    public MyLL()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(T data) {

        Node<T> newNode = new Node<>(data);

        //Empty or not
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            newNode.setNext(head);
            head = newNode;
        }

        size++;


        // TODO: Implement this method - replace object with generic
        // Hint: Think about pointer manipulation order!
    }

    public void addLast(T data) {

        Node<T> newNode = new Node<>(data);

        //Empty or not
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            Node current = head;
            //Traverse to last node. When does next equal null?
            while(current.getNext() != null)
            {
                current = current.getNext();
            }
            tail = newNode;
            current.setNext(tail);

        }

        size++;

        // TODO: Implement this method - replace object with generic
        // Hint: Don't forget the empty list edge case!
    }

    public void add(int index, T data) {

        Node<T> newNode = new Node<>(data);

        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            Node<T> current = head;
            int counter = 0;

            while(counter != index - 1 && current.getNext() != null)
            {
                current = current.getNext();
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }

        size++;

        // TODO: Implement this method - replace object with generic
        // Hint: Be careful with index bounds and pointer order!
    }

    public Node<T> removeFirst() {

        Node<T> temp;

        if(head == null)
        {
            return null;
        }
        else if(head.getNext() == null)
        {
            temp = head;
            head = null;
            size--;
            return temp;
        }
        else
        {
            temp = head;
            head = head.getNext();
            size--;
            return temp;
        }

        // TODO: Implement this method
        // Hint: What happens when you remove the only element?
    }

    public Node<T> removeLast() {

        Node<T> current = head;
        Node<T> temp;

        if(head == null)
        {
            return null;
        }
        else if(head.getNext() == null)
        {
            temp = head;
            head = null;
            size--;
            return temp;
        }

        while(current.getNext() != null && current.getNext().getNext() != null)
        {
            current = current.getNext();
        }

        temp = current.getNext();
        current.setNext(null);
        size--;
        return temp;

        // TODO: Implement this method
        // Hint: What happens when you remove the only element?
    }

    public boolean remove(T data) {

        boolean b = false;
        Node<T> current = head;

        if(head == null)
        {
            return b;
        }
        else if(head.getData().equals(data))
        {
            head = head.getNext();
            size--;
            b = true;
        }

        while(current.getNext() != null)
        {
            if(current.getNext().getData().equals(data))
            {
                current.setNext(current.getNext().getNext());
                b = true;
                size--;
            }
            current = current.getNext();
        }

        return b;

        // TODO: Implement this method - replace object with generic
        // Hint: You need the node BEFORE the one you're removing!
    }

    public boolean removeFirstOccurrence(T data) {

        Node<T> current = head;

        if(head == null)
        {
            return false;
        }
        else if(head.getData().equals(data))
        {
            head = head.getNext();
            size--;
            return true;
        }

        while(current.getNext() != null)
        {
            if(current.getNext().getData().equals(data))
            {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }

        return false;

        // TODO: Implement this method - replace object with generic
    }

    public boolean removeLastOccurrence(T data) {

        boolean b = false;
        Node<T> removeNextNode = null;
        Node<T> current = head;

        if(head == null)
        {
            return b;
        }
        else if(head.getData().equals(data))
        {
            head = head.getNext();
            size--;
            b = true;
        }

        while(current.getNext() != null)
        {
            if(current.getNext().getData().equals(data))
            {
                removeNextNode = current;
                b = true;
            }
            current = current.getNext();
        }

        if(removeNextNode != null)
        {
            removeNextNode.setNext(removeNextNode.getNext().getNext());
            size--;
        }

        return b;

        // TODO: Implement this method - replace object with generic
        // Hint: Track the previous node of the last occurrence found
    }

    public void clear() {

        head = null;
        size = 0;
        // TODO: Implement this method
    }


    public T get(int index) {
        if(head == null)
        {
            return null;
        }

        Node<T> current = head;

        for(int i = 0; i < index; i++)
        {
            current = current.getNext();
        }

        return current.getData();

        // TODO: Implement this method - replace object with generic
        // Hint: Use a loop counter to traverse the right number of steps
    }

    public T getFirst() {

        if(head == null)
        {
            return null;
        }

        return head.getData();

        // TODO: Implement this method - replace object with generic
        // Hint: Check if list is empty first!
    }

    public T getLast() {

        if(head == null)
        {
            return null;
        }

        Node<T> current = head;

        while(current.getNext() != null)
        {
            current = current.getNext();
        }

        return current.getData();

        // TODO: Implement this method - replace object with generic
        // Hint: Traverse to the end or use tail pointer if available
    }


    public boolean contains(T data) {

        if(head == null)
            return false;

        Node<T> current = head;

        while(current != null)
        {
            if(current.getData().equals(data))
                return true;

            current = current.getNext();
        }

        return false;

        // TODO: Implement this method - replace object with generic
        // Hint: Traverse the entire list checking each node's data
    }

    public int indexOf(T data) {

        Node<T> current = head;
        int index = 0;

        while(current != null)
        {
            if(current.getData().equals(data))
            {
                return index;
            }

            index++;
            current = current.getNext();
        }

        return -1;

        // TODO: Implement this method - replace object with generic
        // Hint: Keep track of current index while traversing
        // Return -1 if not found
    }

    public int lastIndexOf(T data) {


        int ind = -1;
        Node<T> current = head;
        int index = 0;

        while(current != null)
        {
            if(current.getData().equals(data))
            {
                ind = index;
            }

            index++;
            current = current.getNext();
        }

        return ind;

        // TODO: Implement this method - replace object with generic
        // Hint: Track the last found index during traversal
    }

    public T set(int index, T data) {




        // TODO: Implement this method - replace object with generic
        // Hint: Similar to get(), but replace the data
        // Returns old value
        return null;
    }

    public void replaceAll(T oldValue, T newValue) {
        // TODO: Implement this method - replace object with generic
        // Hint: Traverse and replace all instances of old value with new
    }

    public int size() {
        // TODO: Implement this method
        // Hint: Just return the size field!
        return -1;
    }

    public boolean isEmpty() {
        // TODO: Implement this method
        // Hint: Check if size is 0 or head is null
        return false;
    }

    public void display() {
        // TODO: Implement this method
        // Goal: Print something like "[HEAD] -> 10 -> 20 -> 30 -> [NULL]"
    }

    public T[] toArray() {
        // TODO: Implement this method - replace object with generic
        // Hint: Create array of size() and populate while traversing
        return null;
    }


}