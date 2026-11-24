public class ContaComigo {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {

            System.out.print("(" + i + ", ");

            for (int j = (i - 1) * 10 + 1; j <= i * 10; j++) {
                System.out.print(j);

                if (j < i * 10) {
                    System.out.print(", ");
                }
            }

            System.out.println(")");
        }
    }
}
