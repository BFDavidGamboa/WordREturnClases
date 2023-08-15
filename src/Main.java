// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Sum s = createObjectSum();
        s.sum();
        System.out.println("Result in calling the method sum: " + s.sum());
    }

    private static Sum createObjectSum(){
        Sum sum = new Sum(4,6);
        return sum;
    }
}

class Sum {
    int a;
    int b;
    public Sum(int a, int b){

        this.a = a;
        this.b = b;
    }

    public int sum(){
        return this.a + this.b;
    }
}