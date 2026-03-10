// ======================================
// Day 9 연습 문제 - 인터페이스, 추상 클래스
// ======================================
// 도형(Shape) 추상 클래스와 Drawable 인터페이스를 활용한
// 다형성 구조를 직접 구현하세요.
//
// 각 TODO 부분의 주석 스펙을 읽고 코드를 채우세요.
// 완성하면 javac Practice09.java && java Practice09 으로 실행하세요.

// ── Drawable 인터페이스 ───────────────────────────────────
// 메서드:
//   - draw() : "XXX 그리기" 출력 (추상)
//   - getColor() : "red" 반환 (default 메서드로 구현)
interface Drawable {
    // TODO: draw() 추상 메서드 선언

    // TODO: default 메서드 getColor() - "red" 반환
}

// ── Shape 추상 클래스 ─────────────────────────────────────
// Drawable 인터페이스 구현
// 필드:
//   - name (String, protected)
// 생성자: Shape(name)
// 메서드:
//   - area() : double 반환 (추상 메서드)
//   - printInfo() : "도형: XXX | 넓이: N.N | 색상: XXX" 출력
abstract class Shape implements Drawable {
    // TODO: 필드 선언

    // TODO: 생성자

    // TODO: area() 추상 메서드 선언

    // TODO: printInfo() - area()와 getColor() 활용해서 출력
    //       출력 형식: "도형: XXX | 넓이: %.1f | 색상: XXX"
    public void printInfo() {
        // 채우세요
    }
}

// ── Circle 클래스 ─────────────────────────────────────────
// Shape 상속
// 필드:
//   - radius (double, private)
// 생성자: Circle(radius) → name = "원"
// 메서드:
//   - area() : Math.PI * radius * radius 반환
//   - draw() : "원 그리기" 출력
class Circle extends Shape {
    // TODO: 필드, 생성자

    // TODO: area()

    // TODO: draw()
}

// ── Rectangle 클래스 ──────────────────────────────────────
// Shape 상속
// 필드:
//   - width, height (double, private)
// 생성자: Rectangle(width, height) → name = "사각형"
// 메서드:
//   - area() : width * height 반환
//   - draw() : "사각형 그리기" 출력
class Rectangle extends Shape {
    // TODO: 필드, 생성자

    // TODO: area()

    // TODO: draw()
}

// ── Triangle 클래스 ───────────────────────────────────────
// Shape 상속
// 필드:
//   - base, height (double, private)
// 생성자: Triangle(base, height) → name = "삼각형"
// 메서드:
//   - area() : base * height / 2 반환
//   - draw() : "삼각형 그리기" 출력
class Triangle extends Shape {
    // TODO: 필드, 생성자

    // TODO: area()

    // TODO: draw()
}

public class Practice09 {
    public static void main(String[] args) {

        // === 문제 1: 각 도형 객체 생성 및 출력 ===
        System.out.println("=== 문제 1: 도형 출력 ===");
        // TODO: Circle(5), Rectangle(4, 6), Triangle(3, 8) 생성
        // TODO: 각 도형의 draw()와 printInfo() 호출

        // 기대 출력:
        // 원 그리기
        // 도형: 원 | 넓이: 78.5 | 색상: red
        // 사각형 그리기
        // 도형: 사각형 | 넓이: 24.0 | 색상: red
        // 삼각형 그리기
        // 도형: 삼각형 | 넓이: 12.0 | 색상: red

        // === 문제 2: 다형성 배열 ===
        System.out.println("\n=== 문제 2: 다형성 배열 ===");
        // TODO: Shape 배열에 Circle(7), Rectangle(3,5), Triangle(6,4) 담기
        // TODO: 반복문으로 모든 도형의 printInfo() 출력

        // 기대 출력:
        // 도형: 원 | 넓이: 153.9 | 색상: red
        // 도형: 사각형 | 넓이: 15.0 | 색상: red
        // 도형: 삼각형 | 넓이: 12.0 | 색상: red

        // === 문제 3: 넓이 합계 ===
        System.out.println("\n=== 문제 3: 넓이 합계 ===");
        // TODO: 문제 2의 배열에서 전체 넓이 합계를 구해 출력
        // 출력 형식: "전체 넓이 합계: NNN.N"

        // 기대 출력:
        // 전체 넓이 합계: 180.9
    }
}
