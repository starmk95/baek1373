import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNum = sc.nextLine();
        // 2진수를 8진수로 변환하면 2진수의 자리수 3개가 8진수 자리수 1개로 변환된다.
        if (binaryNum.length()%3 == 1) { // 2진수 가장 앞의 한자리가 8진수의 첫자리를 의미
            System.out.print(Character.getNumericValue(binaryNum.charAt(0))*1);
        } else if (binaryNum.length()%3 == 2) { // 2진수 가장 앞의 두자리가 8진수의 첫자리를 의미
            System.out.print(Character.getNumericValue(binaryNum.charAt(0))*2 +
                    Character.getNumericValue(binaryNum.charAt(1))*1);
        }
        // 2진수의 자리수가 3의 배수임
        for (int i=binaryNum.length()%3;i<binaryNum.length();i+=3) { // 2진수의 3자리를 8진수 1자리로 변환하기 때문에 i값은 3씩 늘어남
            // 각 2진수 3자리의 2^0자리는 *1, 2^1자리는 *2, 2^2는 *4를 해주고 모두 더하여 8진수 한자리를 구한다.
            System.out.print(Character.getNumericValue(binaryNum.charAt(i))*4 +
                    Character.getNumericValue(binaryNum.charAt(i+1))*2 +
                    Character.getNumericValue(binaryNum.charAt(i+2))*1);
        }
    }
}
