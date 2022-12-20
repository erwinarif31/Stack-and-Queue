
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
            return "Queue is empty";
        }

        Object[] newArr = new Object[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        this.arr = newArr;

        return arr[0];
    }

    public void peek() {
        if (arr.length == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(this.arr[0]);
        }
    }

    public int size() {
        return arr.length;
    }

    public String toString() {
        if (arr.length == 0) {
            return "Queue is empty.";
        }
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

class Antrian {
    public static void main(String[] args) {
        Queue antrian = new Queue();

        antrian.offer("aku ingin ke meikarta"); // Menambah item ke paling atas
        antrian.offer(true);
        antrian.offer(3);
        antrian.offer(4);
        antrian.offer(6);

        antrian.poll(); // Mengembalikan item paling atas dan menghapus item dari stack. Delete: "aku
                        // ingin ke meikarta"
        antrian.poll(); // Delete: true
        antrian.peek(); // Mengembalikan item paling atas tanpa menghapus item dari stack. Return: 3

        System.out.println(antrian); // [3, 4, 6]

    }
}