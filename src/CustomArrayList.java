import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomArrayList<E> implements List<E> {
    private Object[] data;
    private int size;

    public CustomArrayList() {
        data = new Object[10];
    }

    public CustomArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity < 0 isn't required");
        }
        data = new Object[capacity];
    }

    public boolean add(E value) {
        ensureCapacity(size + 1);
        this.data[size] = value;
        size++;
        return true;
    }

    private void ensureCapacity(int capacity) {
        Object[] data = new Object[2 * this.data.length];
        if (capacity > this.data.length) {
            for (int i = 0; i < this.data.length; i++) {
                data[i] = this.data[i];
            }
            this.data = data;
        }
    }

    public void add(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index < 0 or index > size isn't required");
        }
        ensureCapacity(size + 1);
        Object[] data = new Object[this.data.length + 1];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (i == index) {
                data[i] = value;
            } else {
                data[i] = this.data[j];
                j++;
            }
        }
        this.data = data;
        size++;
    }

    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if (this.data[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    public void clear() {
        data = new Object[10];
        size = 0;
    }

    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index < 0 or index > size isn't required");
        }
        return (E) data[index];
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean remove(Object var) {
        if (!contains(var)) {
            return false;
        }
        Object[] data = new Object[this.data.length - 1];
        boolean flag = true;
        int j = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (flag && var.equals(this.data[i])) {
                flag = false;
            } else {
                data[j] = this.data[i];
                j++;
            }
        }
        this.data = data;
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
