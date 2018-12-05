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
        for (Object data : this.data) {
            if (data.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        data = new Object[10];
        size = 0;
    }

    public T get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        return (T) data[index];
    }

    public void removeAll(Object var) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (var.equals(this.data[i])) {
                j++;
            }
        }
        Object[] data = new Object[this.data.length - j];
        if (j == 0) {
            return;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (!var.equals(this.data[i])) {
                data[k] = this.data[i];
                k++;
            }
        }
        this.data = data;
        size -= j;
    }

    public int getSize() {
        return size;
    }
}
