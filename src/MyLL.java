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




        // TODO: Implement this method - replace object with generic
        // Hint: Be careful with index bounds and pointer order!
    }

    public int removeFirst() {
        // TODO: Implement this method
        // Hint: What happens when you remove the only element?
        return -1;
    }

    public int removeLast() {
        // TODO: Implement this method
        // Hint: What happens when you remove the only element?
        return -1;
    }

    public boolean remove(T data) {
        // TODO: Implement this method - replace object with generic
        // Hint: You need the node BEFORE the one you're removing!
        return false;
    }

    public boolean removeFirstOccurrence(T data) {
        // TODO: Implement this method - replace object with generic
        return false;
    }

    public boolean removeLastOccurrence(T data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Track the previous node of the last occurrence found
        return false;
    }

    public void clear() {
        // TODO: Implement this method
    }


    public T get(int index) {
        // TODO: Implement this method - replace object with generic
        // Hint: Use a loop counter to traverse the right number of steps
        return null;
    }

    public T getFirst() {
        // TODO: Implement this method - replace object with generic
        // Hint: Check if list is empty first!
        return null;
    }

    public T getLast() {
        // TODO: Implement this method - replace object with generic
        // Hint: Traverse to the end or use tail pointer if available
        return null;
    }


    public boolean contains(T data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Traverse the entire list checking each node's data
        return false;
    }

    public int indexOf(T data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Keep track of current index while traversing
        // Return -1 if not found
        return -1;
    }

    public int lastIndexOf(T data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Track the last found index during traversal
        return -1;
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