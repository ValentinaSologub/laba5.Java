import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0; // початковий лічильник спроб
        boolean pin_code_coincided = false; // змінна, що відстежує збіг пін-коду

        while (counter < 5) { // поки не вичерпано всі спроби
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            counter++;

            if (correct.equals(vasya)) {
                pin_code_coincided = true; // пін-код збігся
                System.out.println("CORRECT");
                break;
            } else {
                System.out.println("INCORRECT " + counter);
            }
        }

        if (!pin_code_coincided) {
            System.out.println("Error");
        }
    }
}