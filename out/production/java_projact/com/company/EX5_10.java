import java.util.Scanner;

public class EX5_10 {public static void main(String[] args) {
    int total = 0;
    String[][] words = {
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"}
    };
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
        System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

        String tmp = scanner.nextLine();

        if (tmp.equals(words[i][1])) {
            System.out.printf("정답입니다.%n");
            total+=1;
        } else {
            System.out.printf("틀렸습니다.정답은%s입니다.%n%n", words[i][1]);

        }

    }
    System.out.printf("총점은 %d점 입니다.", total);
}
}