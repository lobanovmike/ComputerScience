package part1.exercises;

public class UserArgument {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print("Hello! ");
            System.out.println(args[i]);
        }
    }
}
