// ======================================
// Day 7 연습 문제 - 1주차 종합 복습
// ======================================
// Day1~6 내용을 모두 활용하는 문제입니다.
//
// [도전 과제] 간단한 쇼핑 카트를 구현하세요.
//
// Item 클래스:
//   필드: name(String), price(int), quantity(int)
//   생성자: Item(name, price, quantity)
//   메서드:
//     - totalPrice() : price * quantity 반환
//     - printItem()  : "상품명 | 단가: XXX원 | 수량: N개 | 소계: XXX원" 출력
//
// ShoppingCart 기능 (main에서 구현):
//   1. Item 배열로 장바구니 생성
//   2. 전체 상품 목록 출력 (printItem 활용)
//   3. 총 금액 계산 및 출력
//   4. 가장 비싼 상품 출력 (totalPrice 기준)
//   5. 총 금액이 50000원 이상이면 "10% 할인 적용!" 출력 후 할인 금액 계산

// TODO: Item 클래스 완성
class Item {
    // TODO: 필드


    // TODO: 생성자


    // TODO: totalPrice()


    // TODO: printItem()

}

public class Practice07 {
    public static void main(String[] args) {

        System.out.println("======= 쇼핑 카트 =======\n");

        Item[] cart = {
            new Item("노트북",  1200000, 1),
            new Item("마우스",    25000, 2),
            new Item("키보드",    55000, 1),
            new Item("모니터",   350000, 1),
            new Item("USB 허브",  18000, 3),
        };

        // TODO 1: 전체 상품 목록 출력
        System.out.println("[상품 목록]");
        // for-each 사용

        // TODO 2: 총 금액 계산
        int total = 0;
        // for-each 사용

        System.out.println("\n총 금액: " + total + "원");

        // TODO 3: 가장 비싼 상품 출력 (totalPrice 기준)
        Item mostExpensive = cart[0];
        // for-each 사용

        System.out.println("가장 비싼 항목: " + mostExpensive.name
                + " (" + mostExpensive.totalPrice() + "원)");

        // TODO 4: 총 금액 50000원 이상이면 10% 할인 적용
        // 힌트: (int)(total * 0.9) 로 계산

        // 출력 예시:
        // [상품 목록]
        // 노트북    | 단가: 1200000원 | 수량: 1개 | 소계: 1200000원
        // 마우스    | 단가:    25000원 | 수량: 2개 | 소계:    50000원
        // ...
        //
        // 총 금액: 1748000원
        // 가장 비싼 항목: 노트북 (1200000원)
        // 10% 할인 적용!
        // 할인 금액: 174800원
        // 최종 금액: 1573200원
    }
}
