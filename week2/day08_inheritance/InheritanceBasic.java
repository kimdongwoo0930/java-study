// Day 8: 상속 (Inheritance) - 부모 클래스를 자식 클래스가 물려받기

// === 1. 부모 클래스 (Parent / Super Class) ===
class Animal {
    // 접근제어자: protected → 같은 패키지 + 자식 클래스에서 접근 가능
    protected String name;
    protected int age;

    // 부모 생성자
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 일반 메서드 → 자식이 그대로 사용 가능
    public void eat() {
        System.out.println(name + " 이/가 밥을 먹습니다.");
    }

    // 오버라이딩 대상 메서드
    public void sound() {
        System.out.println(name + " 이/가 소리를 냅니다.");
    }

    public void info() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

// === 2. 자식 클래스 (Child / Sub Class) ===
// extends 키워드로 부모 클래스 상속
class Dog extends Animal {

    private String breed; // 자식만의 추가 필드

    // 자식 생성자: super()로 부모 생성자 호출 (반드시 첫 줄!)
    public Dog(String name, int age, String breed) {
        super(name, age); // 부모의 Animal(name, age) 호출
        this.breed = breed;
    }

    // @Override: 부모 메서드를 자식에서 재정의 (오버라이딩)
    @Override
    public void sound() {
        System.out.println(name + " 이/가 멍멍! 짖습니다.");
    }

    // 자식만의 추가 메서드
    public void fetch() {
        System.out.println(name + " 이/가 공을 가져옵니다!");
    }

    @Override
    public void info() {
        super.info(); // 부모의 info() 먼저 호출
        System.out.println("견종: " + breed);
    }
}

class Cat extends Animal {

    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void sound() {
        System.out.println(name + " 이/가 야옹~ 합니다.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("실내묘 여부: " + (isIndoor ? "실내" : "실외"));
    }
}

// === 3. 메인 실행 ===
public class InheritanceBasic {
    public static void main(String[] args) {

        System.out.println("===== 상속 기본 예제 =====\n");

        Dog dog = new Dog("바둑이", 3, "진도");
        Cat cat = new Cat("나비", 5, true);

        // 부모로부터 상속받은 메서드 사용
        System.out.println("-- 강아지 --");
        dog.info();
        dog.eat();      // Animal에서 상속
        dog.sound();    // 오버라이딩된 Dog 버전
        dog.fetch();    // Dog만의 메서드

        System.out.println("\n-- 고양이 --");
        cat.info();
        cat.eat();      // Animal에서 상속
        cat.sound();    // 오버라이딩된 Cat 버전

        System.out.println("\n===== 다형성 (Polymorphism) =====");
        // 부모 타입으로 자식 객체를 참조할 수 있다!
        Animal a1 = new Dog("흰둥이", 2, "말티즈");
        Animal a2 = new Cat("치즈", 4, false);

        a1.sound(); // Dog의 sound() 실행
        a2.sound(); // Cat의 sound() 실행
        // a1.fetch(); // 에러! Animal 타입은 fetch()를 모름
    }
}
