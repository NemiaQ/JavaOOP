package HW04;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray<T> {
    private T[] array;
    private int size;

    //Конструктор без параметров
    public MyArray() {
        this.array = (T[]) new Object[0];
        this.size = 0;
    }

    //Конструктор с параметром T[]
    public MyArray(T[] arr) {
        this.array = Arrays.copyOf(arr, arr.length);
        this.size = arr.length;
    }

    //Вставка в массив
    public void add(T item) {
        this.array = Arrays.copyOf(this.array, array.length + 1);
        array[size++] = item;
    }

    //Удаление элемента по индексу
    public void removeIndex(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Неверный индекс");
        } else {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[--size] = null;
        }
    }

    //Удаление всех элементов с заданным значением
    public void removeValue(T value) {
        int curIndex = 0;
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(value)) {
                array[curIndex++] = array[i];
            }
        }
        for (int i = curIndex; i < size; i++) {
            array[i] = null;
        }

        size = curIndex;
    }

    //Поиск минимума
    public T getMin() {
        if (size == 0) {
            throw new RuntimeException("Нет данных");
        }

        T min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] instanceof Comparable) {
                if (((Comparable) array[i]).compareTo(min) < 0) {
                    min = array[i];
                }
            } else {
                throw new RuntimeException("Нельзя сравнить элементы");
            }
        }

        return min;
    }

    //Поиск максимума
    public T getMax() {
        if (size == 0) {
            throw new RuntimeException("Нет данных");
        }

        T max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] instanceof Comparable) {
                if (((Comparable) array[i]).compareTo(max) > 0) {
                    max = array[i];
                }
            } else {
                throw new RuntimeException("Нельзя сравнить элементы");
            }
        }

        return max;
    }

    //Поиск суммы
    public <T extends Number> T getSum() {
        if (size == 0) {
            throw new RuntimeException("Нет данных");
        }

        double sum = 0.0;

        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Number) {
                sum += ((Number) array[i]).doubleValue();
            }
        }

        if (array[0] instanceof Integer) {
            return (T) Integer.valueOf((int) sum);
        } else if (array[0] instanceof Double) {
            return (T) Double.valueOf(sum);
        } else if (array[0] instanceof Float) {
            return (T) Float.valueOf((float) sum);
        } else if (array[0] instanceof Long) {
            return (T) Long.valueOf((long) sum);
        } else {
            throw new RuntimeException("Жду числа");
        }
    }

    //Поиск произведения
    public <T extends Number> T getProduct() {
        if (size == 0) {
            throw new RuntimeException("Нет данных");
        }

        double product = 1.0;

        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Number) {
                product *= ((Number) array[i]).doubleValue();
            }
        }

        if (array[0] instanceof Integer) {
            return (T) Integer.valueOf((int) product);
        } else if (array[0] instanceof Double) {
            return (T) Double.valueOf(product);
        } else if (array[0] instanceof Float) {
            return (T) Float.valueOf((float) product);
        } else if (array[0] instanceof Long) {
            return (T) Long.valueOf((long) product);
        } else {
            throw new RuntimeException("Жду числа");
        }
    }

    //Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    //Проверка наличия элемента в массиве
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    //Пузырьковая сортировка
    public void bubbleSort() {
        if (size == 0) return;
        if (!(array[0] instanceof Comparable)) {
            throw new RuntimeException("Данные невозможно отсортировать.");
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable) array[j]).compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //Сортировка простыми вставками
    public void insertionSort() {
        if (size == 0) return;
        if (!(array[0] instanceof Comparable)) {
            throw new RuntimeException("Данные невозможно отсортировать.");
        }

        for (int i = 1; i < size; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && ((Comparable) array[j]).compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    //Сортировка простым выбором
    public void selectionSort() {
        if (size == 0) return;
        if (!(array[0] instanceof Comparable)) {
            throw new RuntimeException("Данные невозможно отсортировать.");
        }

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (((Comparable) array[j]).compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    //Получение элемента массива по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        return array[index];
    }

    //Задание значения элементу массива с заданным индексом
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        array[index] = element;
    }

    //Печать массива на экран
    public void print() {
        System.out.println(Arrays.toString(Arrays.copyOf(array, size)));
    }

    //Длинна массива
    public int length() {
        return size;
    }

}
