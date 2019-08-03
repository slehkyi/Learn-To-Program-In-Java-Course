public class ControlFlow {
    public static void main(String[] args) {
        firstMethod();
    }

    public static void firstMethod() {
        secondMethod();
    }

    public static void secondMethod() {
        thirdMethod();
    }

    public static void thirdMethod() {
        System.out.println("You are in third method");
    }
}
