// Pada java terdapat library untuk mengimplementasikan Stack dengan menggunakan java.util.Stack.
// Namun, pada file ini Stack dibuat secara manual.

public class Stack {
    private Object[] arr;

    Stack() {
        this.arr = new Object[0];
    }

    public Object push(Object item) {
        Object[] newArr = new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = item;
        this.arr = newArr;
        return item;
    }

    public Object pop() {
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
        System.out.println(this.arr[arr.length - 1]);
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
        Stack test = new Stack();

        test.push("aku ingin ke meikarta"); // Menambah item ke paling atas
        test.push(true);
        test.push(3);
        test.push(4);
        test.push(6);

        test.pop(); // Mengembalikan item paling atas dan menghapus item dari stack. Return: 6
        test.peek(); // Mengembalikan item paling atas tanpa menghapus item dari stack. Return: 4

        System.out.println(test); // [aku ingin ke meikarta, true, 3, 4]

    }
}