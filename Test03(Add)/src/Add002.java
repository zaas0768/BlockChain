import java.util.Scanner;

public class Add002 {
	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력해 주세요");
		int 처음값 = scan2.nextInt();

		System.out.println("두번째 숫자를 입력해 주세요");
		int 두번값 = scan2.nextInt();

		int sumNumber = 처음값 + 두번값;
		System.out.printf("%d와 %d의 합은 %d입니다", 처음값, 두번값, sumNumber);
	}
}
