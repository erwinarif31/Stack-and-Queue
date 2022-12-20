
// Pada java terdapat library untuk mengimplementasikan Queue dengan menggunakan java.util.Queue.
// Namun, pada file ini Stack dibuat secara manual.

public class Queue {
    private Object[] arr;

    public Queue() {
        this.arr = new Object[0];
    }

    public Object offer(Object item) {
        Object[] newArr = new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = item;
        this.arr = newArr;
        return item;
    }

    public Object poll() {
        if (arr.length == 0) {
            return "Stack is empty";
        }
        Object[] newArr = new Object[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        this.arr = newArr;

        return arr[arr.length - 1];
    }

    public void peek() {
        System.out.println(this.arr[0]);
    }

    public int size() {
        return arr.length;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str = str.concat(arr[i] + "]");
            } else {
                str = str.concat(arr[i] + ", ");
            }
        }
        return str;
    }

}

class Main {
    public static void main(String[] args) {
        Queue test = new Queue();

        test.offer("aku ingin ke meikarta"); // Menambah item ke paling atas
        test.offer(true);
        test.offer(3);
        test.offer(4);
        test.offer(6);

        test.poll(); // Mengembalikan item paling atas dan menghapus item dari stack. Return: 6
        test.peek(); // Mengembalikan item paling atas tanpa menghapus item dari stack. Return: 4

        System.out.println(test); // [aku ingin ke meikarta, true, 3, 4]

    }
}