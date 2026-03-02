// Day 1: 변수와 자료형 - 각 타입별 선언과 출력 연습
public class Variables {
    public static void main(String[] args) {

        // === 1. 정수형 ===
        int age = 25;               // 가장 많이 쓰는 정수 타입
        long population = 8000000000L; // 큰 숫자는 long (끝에 L)

        // === 2. 실수형 ===
        double pi = 3.141592;       // 실수 기본 타입
        float score = 97.5f;        // float은 끝에 f 필요

        // === 3. 문자 / 문자열 ===
        char grade = 'A';           // 작은따옴표, 한 글자
        String name = "Java";       // 큰따옴표, 문자열 (대문자 S!)

        // === 4. 논리형 ===
        boolean isStudent = true;   // true 또는 false

        // === 출력 ===
        System.out.println("=== 변수 출력 ===");
        System.out.println("나이: " + age);
        System.out.println("세계 인구: " + population);
        System.out.println("파이: " + pi);
        System.out.println("점수: " + score);
        System.out.println("등급: " + grade);
        System.out.println("이름: " + name);
        System.out.println("학생인가? " + isStudent);

        // === 5. 형변환 (Type Casting) ===
        // 작은 타입 → 큰 타입: 자동 (int → double)
        double autocast = age;
        System.out.println("\n=== 형변환 ===");
        System.out.println("int → double 자동변환: " + autocast);

        // 큰 타입 → 작은 타입: 강제 캐스팅 필요 (double → int)
        int forcecast = (int) pi;   // 소수점 버림!
        System.out.println("double → int 강제변환: " + forcecast);
    }
}
