public class CustomArrayList<T> {
    private Object[] data;
    private int size;

    public CustomArrayList() {
        data = new Object[10];
    }

    public CustomArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        data = new Object[capacity];
    }

    public void add(T value) {
        ensureCapacity(size + 1);
        this.data[size] = value;
        size++;
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

    public void add(T value, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
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
    
    public void clear() {
        data = new Object[10];
        size = 0;
    }
    
    public T remove(Object var) {
        if (!contains(var)) {
            return null;
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
        return (T) var;
    }
    
    public T get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }
    
    public int getSize() {
        return size;
    }
}
