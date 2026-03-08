// ======================================
// Day 4 연습 문제 - 반복문
// ======================================

public class Practice04 {
    public static void main(String[] args) {

        // ── 문제 1 ──────────────────────────────────────
        // for문으로 별(*)을 아래 모양으로 출력하세요.
        //
        // 출력 예시:
        // *
        // **
        // ***
        // ****
        // *****

        System.out.println("=== 문제 1: 별 삼각형 ===");
        // TODO: 이중 for문 사용
        for (int i = 1; i <= 5; i++) {
            // TODO: i개의 별을 한 줄에 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ── 문제 2 ──────────────────────────────────────
        // while문으로 1~100 사이의 3의 배수 합계를 구하세요.
        //
        // 출력 예시:
        // 1~100 사이 3의 배수 합: 1683

        System.out.println("\n=== 문제 2: while - 3의 배수 합 ===");
        int i = 1;
        int sum = 0;

        // TODO: while문으로 3의 배수만 sum에 더하기
        while (i <= 100) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("1~100 사이 3의 배수 합: " + sum);

        // ── 문제 3 ──────────────────────────────────────
        // for문 + continue를 사용해서
        // 1~20 중 짝수만 출력하되, 10은 건너뛰세요.
        //
        // 출력 예시:
        // 2 4 6 8 12 14 16 18 20

        System.out.println("\n=== 문제 3: continue 활용 ===");
        for (int n = 1; n <= 20; n++) {
            // TODO: 홀수 건너뛰기, 10도 건너뛰기
            if (n % 2 == 1 || n == 10) {
                continue;
            }
            System.out.print(n + " ");
        }
        System.out.println();

        // ── 문제 4 ──────────────────────────────────────
        // 이중 for문으로 구구단 5~7단을 출력하세요.
        // 단, 곱한 결과가 40 이상이면 break로 해당 단을 종료하세요.
        //
        // 출력 예시:
        // --- 5단 ---
        // 5 x 1 = 5
        // ...
        // 5 x 7 = 35
        // 5 x 8 = 40 → 40 이상! 중단
        // --- 6단 ---
        // ...

        System.out.println("\n=== 문제 4: 구구단 + break ===");
        for (int dan = 5; dan <= 7; dan++) {
            System.out.println("--- " + dan + "단 ---");
            for (int j = 1; j <= 9; j++) {
                int product = dan * j;
                if (product >= 40) {
                    System.out.println(dan + " X " + j + "=" + product + "-> 40 이상! 중단");
                    break;
                }
                System.out.println(dan + " X " + j + "=" + product);
                // TODO: product가 40 이상이면 메시지 출력 후 break
                // 아니면 "dan x j = product" 출력

            }
        }
    }
}
