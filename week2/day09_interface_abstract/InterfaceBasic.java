// Day 9: 인터페이스 (Interface)
// "이 클래스는 반드시 이 기능을 구현해야 한다" 는 약속/규격

// ============================================================
// === 1. 인터페이스 선언 ===
// ============================================================
// - interface 키워드 사용
// - 메서드는 기본적으로 public abstract (생략 가능)
// - 필드는 기본적으로 public static final (상수만 가능)
interface Flyable {
    int MAX_ALTITUDE = 10000; // 상수 (public static final 자동)

    void fly();               // 추상 메서드 (public abstract 자동)
    void land();

    // default 메서드: Java 8 이상, 인터페이스에서 구현 가능
    // 구현 클래스에서 오버라이딩 해도 되고, 안 해도 됨
    default void status() {
        System.out.println("비행 가능한 객체입니다.");
    }
}

interface Swimmable {
    void swim();

    default void status() {
        System.out.println("수영 가능한 객체입니다.");
    }
}

// ============================================================
// === 2. 인터페이스 구현 (implements) ===
// ============================================================
// - 클래스는 하나만 상속(extends) 가능
// - 인터페이스는 여러 개 동시에 구현(implements) 가능!
class Eagle implements Flyable {
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " 독수리가 날아오릅니다. (최대 " + MAX_ALTITUDE + "m)");
    }

    @Override
    public void land() {
        System.out.println(name + " 독수리가 착지합니다.");
    }
    // status()는 오버라이딩 안 해도 됨 → Flyable의 default 사용
}

// 인터페이스 2개 동시 구현
class Duck implements Flyable, Swimmable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " 오리가 낮게 납니다.");
    }

    @Override
    public void land() {
        System.out.println(name + " 오리가 착지합니다.");
    }

    @Override
    public void swim() {
        System.out.println(name + " 오리가 헤엄칩니다.");
    }

    // Flyable, Swimmable 둘 다 status() default 메서드가 있어서
    // 충돌! → 반드시 오버라이딩해야 함
    @Override
    public void status() {
        System.out.println(name + " 오리는 날기도, 수영도 가능합니다.");
    }
}

// ============================================================
// === 3. 인터페이스 타입으로 참조 (다형성) ===
// ============================================================
public class InterfaceBasic {
    public static void main(String[] args) {

        System.out.println("===== 인터페이스 기본 예제 =====\n");

        Eagle eagle = new Eagle("흰머리");
        Duck duck = new Duck("도날드");

        System.out.println("-- 독수리 --");
        eagle.fly();
        eagle.land();
        eagle.status(); // Flyable의 default 메서드

        System.out.println("\n-- 오리 --");
        duck.fly();
        duck.swim();
        duck.status(); // 오버라이딩된 버전

        // 인터페이스 타입으로 참조 가능
        System.out.println("\n===== 인터페이스 타입으로 다형성 =====");
        Flyable f1 = new Eagle("검독수리");
        Flyable f2 = new Duck("청둥오리");

        f1.fly(); // Eagle의 fly()
        f2.fly(); // Duck의 fly()
        // f2.swim(); // 에러! Flyable 타입은 swim()을 모름

        // Swimmable 타입으로도 참조 가능
        Swimmable s1 = new Duck("흰뺨오리");
        s1.swim();

        // 인터페이스 배열로 여러 객체 일괄 처리
        System.out.println("\n===== 배열로 일괄 처리 =====");
        Flyable[] flyers = {
            new Eagle("참수리"),
            new Duck("쇠오리"),
            new Eagle("황조롱이")
        };

        for (Flyable flyer : flyers) {
            flyer.fly(); // 각자의 fly() 실행
        }
    }
}
