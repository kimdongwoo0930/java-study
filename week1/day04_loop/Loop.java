// Day 4: 반복문 - for, while, do-while, break/continue 실습
public class Loop {
    public static void main(String[] args) {

        // === 1. for문 ===
        // for (초기값; 조건; 증감)
        System.out.println("=== for문 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("반복 " + i + "회");
        }

        // 합계 구하기: 1~100 합
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100 합: " + sum);  // 5050

        // === 2. while문 ===
        System.out.println("\n=== while문 ===");
        int count = 5;
        while (count > 0) {
            System.out.println("카운트다운: " + count);
            count--;
        }
        System.out.println("발사!");

        // === 3. do-while문 ===
        // 조건 검사 전에 먼저 1번 실행
        System.out.println("\n=== do-while문 ===");
        int num = 0;
        do {
            System.out.println("num = " + num + " (조건이 false여도 1번은 실행)");
            num++;
        } while (num < 0);  // false지만 위 코드 1번 실행됨

        // === 4. break - 반복 즉시 탈출 ===
        System.out.println("\n=== break ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("6에서 탈출!");
                break;
            }
            System.out.println("i = " + i);
        }

        // === 5. continue - 현재 회차 건너뛰기 ===
        System.out.println("\n=== continue (홀수만 출력) ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // 짝수면 건너뛰기
            }
            System.out.println("i = " + i);
        }

        // === 6. 이중 for문 (구구단) ===
        System.out.println("\n=== 이중 for문 (구구단 2~3단) ===");
        for (int dan = 2; dan <= 3; dan++) {
            System.out.println("--- " + dan + "단 ---");
            for (int j = 1; j <= 9; j++) {
                System.out.println(dan + " x " + j + " = " + (dan * j));
            }
        }

        // === 7. for-each문 (향상된 for문) ===
        // Python의 "for x in list"와 비슷!
        System.out.println("\n=== for-each문 ===");
        String[] fruits = {"사과", "바나나", "포도"};
        for (String fruit : fruits) {
            System.out.println("과일: " + fruit);
        }
    }
}
