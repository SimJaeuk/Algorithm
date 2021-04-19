import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        int x, y, t = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요");
		x = scanner.nextInt();
		System.out.print("정수를 입력하세요");
		y = scanner.nextInt();

        while (y != 0) {
			t = x % y;
			x = y;
			y = t;
            
		}
		System.out.println("최대공약수는 " + x + " 입니다");
    }
    
}
