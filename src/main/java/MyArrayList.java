//- `void add(int value)` – добавляет элемент в конец списка.
//- `void remove(int index)` – удаляет элемент по индексу.
//        - `int get(int index)` – возвращает элемент по индексу.
//        - `boolean contains(int value)` – возвращает `true`, если список содержит элемент со значением `value`, в противном случае `false`.
//        - `int size()` – возвращает текущее количество элементов в списке.

public class MyArrayList {

    private int[] array;
    private int size;

    public MyArrayList() {
        this.array = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == array.length) {
            resize();
        }
        array[size] = value;
        size++;

    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("No such index");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
            size--;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("No such Element");
        }
        return array[index];
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void resize() {
        int[] newArray = new int[array.length * 2];

        if (size == array.length) {
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
        }
        array = newArray;
    }
}
// 18 min