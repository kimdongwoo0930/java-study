// Day 8: 오버라이딩 (Overriding) vs 오버로딩 (Overloading) 비교

class Calculator {

    // === 오버로딩 (Overloading) ===
    // 같은 이름, 다른 매개변수 → 컴파일 타임에 결정
    public int add(int a, int b) {
        System.out.println("[int + int]");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("[double + double]");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("[int + int + int]");
        return a + b + c;
    }

    // 오버라이딩 대상 메서드
    public String describe() {
        return "기본 계산기";
    }
}

class ScientificCalculator extends Calculator {

    // === 오버라이딩 (Overriding) ===
    // 부모와 동일한 메서드 시그니처(이름+매개변수)를 자식에서 재정의
    // → 런타임에 실제 객체 타입으로 결정 (동적 바인딩)
    @Override
    public String describe() {
        return "공학용 계산기";
    }

    // 새로운 기능 추가
    public double power(double base, double exp) {
        return Math.pow(base, exp);
    }

    public double sqrt(double n) {
        return Math.sqrt(n);
    }
}

// instanceof 연산자와 다운캐스팅 예제
class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double area() {
        return 0;
    }

    public void printInfo() {
        System.out.printf("색상: %s, 넓이: %.2f%n", color, area());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class Overriding {
    public static void main(String[] args) {

        System.out.println("===== 오버로딩 (Overloading) =====");
        Calculator calc = new Calculator();
        System.out.println("결과: " + calc.add(3, 4));
        System.out.println("결과: " + calc.add(1.5, 2.5));
        System.out.println("결과: " + calc.add(1, 2, 3));

        System.out.println("\n===== 오버라이딩 (Overriding) =====");
        Calculator basic = new Calculator();
        Calculator sci = new ScientificCalculator(); // 다형성!

        System.out.println(basic.describe()); // 기본 계산기
        System.out.println(sci.describe());   // 공학용 계산기 (오버라이딩)

        System.out.println("\n===== instanceof + 다운캐스팅 =====");
        Shape[] shapes = {
            new Circle("빨강", 5),
            new Rectangle("파랑", 4, 6),
            new Circle("초록", 3)
        };

        for (Shape shape : shapes) {
            shape.printInfo();

            // instanceof: 실제 타입 확인
            if (shape instanceof Circle c) { // Java 16+ 패턴 매칭
                System.out.println("  → 원의 반지름: " + c.getRadius());
            }
        }

        System.out.println("\n===== 오버라이딩 vs 오버로딩 정리 =====");
        System.out.println("오버로딩: 같은 클래스, 같은 이름, 다른 매개변수 → 컴파일 타임");
        System.out.println("오버라이딩: 부모→자식, 같은 시그니처, 내용 재정의 → 런타임");
    }
}
