// Day 2: 연산자 - 산술, 비교, 논리, 증감 연산자 실습
public class Operators {
    public static void main(String[] args) {

        // === 1. 산술 연산자 ===
        int a = 10, b = 3;
        System.out.println("=== 산술 연산자 ===");
        System.out.println("10 + 3 = " + (a + b));
        System.out.println("10 - 3 = " + (a - b));
        System.out.println("10 * 3 = " + (a * b));
        System.out.println("10 / 3 = " + (a / b));       // 3 (정수 나누기!)
        System.out.println("10.0 / 3 = " + (10.0 / b));  // 3.333... (하나가 double이면 실수)
        System.out.println("10 % 3 = " + (a % b));        // 1 (나머지)

        // === 2. 대입 연산자 ===
        System.out.println("\n=== 대입 연산자 ===");
        int num = 10;
        num += 5;   // num = num + 5
        System.out.println("10 += 5 → " + num);   // 15
        num -= 3;   // num = num - 3
        System.out.println("15 -= 3 → " + num);   // 12
        num *= 2;   // num = num * 2
        System.out.println("12 *= 2 → " + num);   // 24

        // === 3. 비교 연산자 ===
        System.out.println("\n=== 비교 연산자 ===");
        System.out.println("10 == 3 : " + (a == b));   // false
        System.out.println("10 != 3 : " + (a != b));   // true
        System.out.println("10 > 3  : " + (a > b));    // true
        System.out.println("10 <= 3 : " + (a <= b));   // false

        // 문자열 비교: == 말고 .equals() 사용!
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println("\n\"hello\".equals(\"hello\") : " + s1.equals(s2));  // true
        System.out.println("new String == 비교       : " + (s1 == s3));          // false!
        System.out.println("new String .equals() 비교: " + s1.equals(s3));       // true

        // === 4. 논리 연산자 ===
        System.out.println("\n=== 논리 연산자 ===");
        boolean x = true, y = false;
        System.out.println("true && false : " + (x && y));   // false
        System.out.println("true || false : " + (x || y));   // true
        System.out.println("!true         : " + (!x));       // false

        // === 5. 증감 연산자 (Python에 없음!) ===
        System.out.println("\n=== 증감 연산자 ===");
        int count = 5;
        count++;    // count = count + 1
        System.out.println("5 → count++ → " + count);   // 6
        count--;    // count = count - 1
        System.out.println("6 → count-- → " + count);   // 5
    }
}
