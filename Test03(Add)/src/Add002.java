import java.util.Scanner;

public class Add002 {
	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��� �ּ���");
		int ó���� = scan2.nextInt();

		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
		int �ι��� = scan2.nextInt();

		int sumNumber = ó���� + �ι���;
		System.out.printf("%d�� %d�� ���� %d�Դϴ�", ó����, �ι���, sumNumber);
	}
}
