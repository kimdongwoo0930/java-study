// ======================================
// Day 1 연습 문제 - 변수와 자료형
// ======================================
// 아래 TODO를 채워 완성하세요.
// 실행: javac Practice01.java && java Practice01
// ======================================

public class Practice01 {
    public static void main(String[] args) {

        // ── 문제 1 ──────────────────────────────────────
        // 본인의 이름(String), 나이(int), 키(double), 학생 여부(boolean)를
        // 변수로 선언하고 아래 형식으로 출력하세요.
        //
        // 출력 예시:
        // 이름: 홍길동
        // 나이: 20
        // 키: 175.5
        // 학생: true

        // TODO: 변수 선언
        String name = "김동우"; // ← 본인 이름으로 바꾸세요
        int age = 20;
        double height = 175.5;
        boolean isStudent = true;

        // TODO: 출력
        System.out.println("=== 문제 1: 변수 출력 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("학생: " + isStudent);

        // ── 문제 2 ──────────────────────────────────────
        // 아래 두 값을 형변환하세요.
        //
        // (1) double → int 강제 형변환 (소수점 버림)
        // (2) int → double 자동 형변환
        //
        // 출력 예시:
        // double 3.99 → int : 3
        // int 7 → double : 7.0

        System.out.println("\n=== 문제 2: 형변환 ===");
        double d = 3.99;
        int n = 7;

        // TODO: (1) double → int 강제 형변환
        int fromDouble = (int) d; // ← 고치세요

        // TODO: (2) int → double 자동 형변환
        double fromInt = (double) n; // ← 고치세요

        System.out.println("double " + d + " → int : " + fromDouble);
        System.out.println("int " + n + " → double : " + fromInt);

        // ── 문제 3 ──────────────────────────────────────
        // 다음 변수를 선언하고 올바른 타입인지 확인하세요.
        // 틀린 부분을 찾아 고치세요.
        //

        System.out.println("\n=== 문제 3: 타입 오류 수정 ===");
        // TODO: 아래 3줄을 올바르게 고치세요
        float f = 3.14f;
        long l = 10000000000L;
        char c = 'A';

        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("char: " + c);
    }
}
