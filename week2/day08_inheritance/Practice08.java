// ======================================
// Day 8 연습 문제 - 상속, 오버라이딩, 접근제어자
// ======================================
// Vehicle(부모) → Car, Bike(자식) 상속 구조를 직접 구현하세요.
//
// 각 TODO 부분의 주석 스펙을 읽고 코드를 채우세요.
// 완성하면 javac Practice08.java && java Practice08 으로 실행하세요.

// ── Vehicle 클래스 (부모) ────────────────────────────────
// 필드:
//   - brand (String, protected)
//   - speed (int, private)
// 생성자: Vehicle(brand, speed)
// 메서드:
//   - getSpeed()            : speed 반환
//   - accelerate(int amount): speed += amount, "브랜드 가속! 현재 속도: NNNkm/h" 출력
//   - info()                : "브랜드: XXX | 속도: NNNkm/h" 출력
//   - describe()            : "탈것" 반환 (자식에서 오버라이딩)
class Vehicle {
    // TODO: 필드 선언 (brand = protected, speed = private)
    protected String brand = "";
    private int speed = 0;

    // TODO: 생성자
    public Vehicle(String brand, int speed) {
        // 채우세요
        this.brand = brand;
        this.speed = speed;
    }

    // TODO: getSpeed() - speed 반환
    public int getSpeed() {
        return speed; // 이 줄을 채우세요
    }

    // TODO: accelerate(int amount) - speed += amount 후 출력
    public void accelerate(int amount) {
        // 채우세요
        speed += amount;
        System.out.printf("브랜드 가속! 현재 속도: %dkm/h \n", speed);
    }

    // TODO: info() - "브랜드: XXX | 속도: NNNkm/h" 출력
    public void info() {
        // 채우세요
        System.out.printf("브랜드: %s | 속도: %dkm/h \n", brand, speed);
    }

    // TODO: describe() - "탈것" 반환
    public String describe() {
        return "탈것"; // 자식에서 오버라이딩 할 것
    }
}

// ── Car 클래스 (자식) ────────────────────────────────────
// 추가 필드: doors (int, private) - 문 개수
// 생성자: Car(brand, speed, doors) → super() 사용
// 오버라이딩:
// - describe() → "자동차" 반환
// - info() → super.info() 호출 후 "문 개수: N개" 추가 출력
// 추가 메서드: honk() → "빵빵!" 출력
class Car extends Vehicle {
    // TODO: 필드
    private int doors = 0;

    // TODO: 생성자 (super() 호출 필수)
    public Car(String brand, int speed, int doors) {
        super(brand, speed); // 이 줄을 완성하세요
        this.doors = doors;
        // 채우세요
    }

    // TODO: describe() 오버라이딩
    @Override
    public String describe() {
        return "자동차"; // 채우세요
    }

    // TODO: info() 오버라이딩 - super.info() 먼저 호출 후 문 개수 출력
    @Override
    public void info() {
        super.info(); // 채우세요
        System.out.printf("문 개수: %d개\n", doors);
        // 채우세요
    }

    // TODO: honk() - "빵빵!" 출력
    public void honk() {
        System.out.println("빵빵!");

        // 채우세요
    }
}

// ── Bike 클래스 (자식) ───────────────────────────────────
// 추가 필드: hasMotor (boolean, private) - 전동 여부
// 생성자: Bike(brand, speed, hasMotor)
// 오버라이딩:
// - describe() → hasMotor가 true면 "전동 자전거", false면 "자전거" 반환
// - info() → super.info() 호출 후 "전동: true/false" 추가 출력
class Bike extends Vehicle {
    // TODO: 필드
    private boolean hasMotor = false;

    // TODO: 생성자
    public Bike(String brand, int speed, boolean hasMotor) {
        super(brand, speed); // 채우세요
        this.hasMotor = hasMotor;
        // 채우세요
    }

    // TODO: describe() 오버라이딩
    @Override
    public String describe() {
        return (hasMotor ? "전동 자전거" : "자전거"); // 채우세요 (hasMotor 조건 반영)
    }

    // TODO: info() 오버라이딩
    @Override
    public void info() {
        super.info(); // 채우세요
        System.out.printf("전동: %b", hasMotor);
        // 채우세요
    }
}

// ── main ─────────────────────────────────────────────────
public class Practice08 {
    public static void main(String[] args) {

        // ── 문제 1: 기본 사용 ─────────────────────────────
        System.out.println("=== 문제 1: 기본 사용 ===");
        Car car = new Car("현대", 0, 4);
        car.info();
        car.accelerate(60);
        car.honk();

        Bike bike = new Bike("삼천리", 0, true);
        bike.info();
        bike.accelerate(20);

        // 출력 예시:
        // 브랜드: 현대 | 속도: 0km/h
        // 문 개수: 4개
        // 현대 가속! 현재 속도: 60km/h
        // 빵빵!
        // 브랜드: 삼천리 | 속도: 0km/h
        // 전동: true
        // 삼천리 가속! 현재 속도: 20km/h

        // ── 문제 2: 다형성 ────────────────────────────────
        // 부모 타입 배열에 자식 객체를 담고
        // describe()와 info()를 반복 호출하세요.
        //
        // 출력 예시:
        // [자동차] 브랜드: 현대 | 속도: 60km/h / 문 개수: 4개
        // [전동 자전거] ...
        System.out.println("\n=== 문제 2: 다형성 ===");
        Vehicle[] vehicles = {
                car,
                bike,
                new Car("기아", 80, 2),
                new Bike("첼로", 15, false),
        };

        for (Vehicle v : vehicles) {
            System.out.print("[" + v.describe() + "] ");
            v.info();
        }

        // ── 문제 3: instanceof ────────────────────────────
        // vehicles 배열에서 Car만 골라 honk()를 호출하세요.
        //
        // 출력 예시:
        // 현대: 빵빵!
        // 기아: 빵빵!
        System.out.println("\n=== 문제 3: instanceof ===");
        for (Vehicle v : vehicles) {
            // TODO: instanceof로 Car인지 확인 후 brand 출력 + honk()
            // 힌트: if (v instanceof Car c) { ... }
            if (v instanceof Car c) {
                System.out.printf("%s\n", c.brand);
                c.honk();
            
            }
        }
    }
}
