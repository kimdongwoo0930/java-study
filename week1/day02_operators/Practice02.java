// ======================================
// Day 2 연습 문제 - 연산자
// ======================================

public class Practice02 {
    public static void main(String[] args) {

        // ── 문제 1 ──────────────────────────────────────
        // 정수 17을 5로 나눌 때:
        // (1) 몫을 출력하세요.
        // (2) 나머지를 출력하세요.
        // (3) 실수 나눗셈 결과를 출력하세요. (힌트: 하나를 double로)
        //
        // 출력 예시:
        // 몫: 3
        // 나머지: 2
        // 실수 나눗셈: 3.4

        System.out.println("=== 문제 1: 나눗셈 연산 ===");
        int a = 17, b = 5;

        // TODO
        System.out.println("몫: " + (a / b) );
        System.out.println("나머지: " + (a % b));
        System.out.println("실수 나눗셈: " + (17.0 / b ));


        // ── 문제 2 ──────────────────────────────────────
        // x = 10 에서 시작해서
        // (1) x에 3을 더하고 출력
        // (2) x에서 2를 빼고 출력
        // (3) x에 2를 곱하고 출력
        // (4) x를 3으로 나누고 출력
        //
        // 출력 예시:
        // +3 → 13
        // -2 → 11
        // *2 → 22
        // /3 → 7

        System.out.println("\n=== 문제 2: 복합 대입 연산자 ===");
        int x = 10;

        // TODO: 복합 대입 연산자(+=, -=, *=, /=) 사용

        System.out.println(x += 3);
        System.out.println(x -= 2);
        System.out.println(x *= 2);
        System.out.println(x /= 3);



        // ── 문제 3 ──────────────────────────────────────
        // 문자열 비교 함정 문제
        // 아래 두 결과가 다른 이유를 주석으로 설명하고 출력하세요.
        //
        // 출력 예시:
        // == 비교: false
        // equals 비교: true
        // 이유: ...

        System.out.println("\n=== 문제 3: 문자열 비교 ===");
        String s1 = new String("hello");
        String s2 = new String("hello");

        // TODO: == 비교와 .equals() 비교 출력
        System.out.println("== 비교: " +  ( s1 == s2));      // ← 채우세요
        System.out.println("equals 비교: " + (s1.equals(s2)));  // ← 채우세요
        // TODO: 이유를 주석으로 설명해보세요
        // 이유:


        // ── 문제 4 ──────────────────────────────────────
        // 아래 조건이 모두 참(true)인지 확인하세요.
        //   - score가 60 이상이다
        //   - score가 100 이하이다
        //
        // 출력 예시 (score = 75):
        // 유효한 점수: true
        // 출력 예시 (score = 110):
        // 유효한 점수: false

        System.out.println("\n=== 문제 4: 논리 연산자 ===");
        int score = 75;

        // TODO: && 연산자로 두 조건을 결합해 출력
        System.out.println("유효한 점수: " + (score >= 60 && score <= 100));
    }
}
