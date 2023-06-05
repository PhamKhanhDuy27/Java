import java.util.Arrays;

public class YourList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public YourList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public YourList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements [i];
        }
        elements[index] = element;
        size++;
    }
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E oldValue = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return oldValue;
    }
    public int size() {
        return size;
    }
    public Object clone() {
        try {
            YourList<E> cloned = (YourList<E>) super.clone();
            cloned.elements = Arrays.copyOf(elements, size);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newSize = Math.max(minCapacity, elements.length * 2);
            elements = Arrays.copyOf(elements, newSize);
        }
    }

}
