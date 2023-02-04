import user.User;

import java.util.Scanner;

public abstract class MainPage {
    static void mainPage() {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            System.out.print("""
                    1. Sigh in.
                    2. Sign up.
                    3. Exit.
                    Enter number:""");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You signed successfully!");
                    bool = false;
                    break;
                case 2:
                    User.createUser();
                    User.signIn();
                    bool = false;
                    break;
                case 3:
                    bool = false;
                    break;
                default:
                    mainPage();
            }
        }
    }
}
