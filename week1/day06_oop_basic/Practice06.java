// ======================================
// Day 6 연습 문제 - 클래스와 객체
// ======================================
// BankAccount 클래스를 직접 만들어보세요.

// TODO: BankAccount 클래스를 완성하세요.
//
// 필드:
//   - owner (String)  : 예금주 이름
//   - balance (int)   : 잔액
//
// 생성자:
//   - BankAccount(String owner, int initialBalance)
//
// 메서드:
//   (1) deposit(int amount)   : 입금. amount가 0보다 크면 balance에 더하고
//                               "XXX원 입금. 잔액: YYY원" 출력
//                               아니면 "입금액 오류" 출력
//   (2) withdraw(int amount)  : 출금. 잔액이 충분하면 빼고
//                               "XXX원 출금. 잔액: YYY원" 출력
//                               잔액 부족이면 "잔액 부족" 출력
//   (3) printInfo()           : "예금주: OOO | 잔액: XXX원" 출력

class BankAccount {
    // TODO: 필드 선언
    private String owner;
    private int balance;

    // TODO: 생성자
    BankAccount(String owner, int initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // TODO: deposit()
    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원 입금. 잔액: " + balance + "원");
            return;
        }
        System.out.println("입금액 오류");
        return;
    }

    // TODO: withdraw()
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금. 잔액: " + balance + "원");
            return;
        }
        System.out.println("잔액 부족");
        return;
    }

    // TODO: printInfo()
    void printInfo() {
        System.out.println("예금주: " + owner + " | 잔액: " + balance + "원");
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}

public class Practice06 {
    public static void main(String[] args) {

        // ── 문제 1 ──────────────────────────────────────
        // 아래 시나리오대로 동작하는지 확인하세요.

        System.out.println("=== 문제 1: BankAccount ===");
        BankAccount acc = new BankAccount("홍길동", 10000);
        acc.printInfo();
        acc.deposit(5000);
        acc.withdraw(3000);
        acc.withdraw(20000); // 잔액 부족 케이스
        acc.deposit(-100); // 입금액 오류 케이스
        acc.printInfo();

        // 출력 예시:
        // 예금주: 홍길동 | 잔액: 10000원
        // 5000원 입금. 잔액: 15000원
        // 3000원 출금. 잔액: 12000원
        // 잔액 부족
        // 입금액 오류
        // 예금주: 홍길동 | 잔액: 12000원

        // ── 문제 2 ──────────────────────────────────────
        // 계좌 배열로 전체 잔액 합계를 구하세요.
        //
        // 출력 예시:
        // 전체 잔액 합계: 55000원

        System.out.println("\n=== 문제 2: 계좌 배열 ===");
        BankAccount[] accounts = {
                new BankAccount("Alice", 20000),
                new BankAccount("Bob", 15000),
                new BankAccount("Charlie", 20000),
        };
        int total = 0;
        // TODO: 전체 잔액 합계 계산 후 출력
        for (BankAccount i : accounts) {
            total += i.getBalance();
        }

        System.out.println("전체 잔액 합계: " + total + "원");
    }
}
