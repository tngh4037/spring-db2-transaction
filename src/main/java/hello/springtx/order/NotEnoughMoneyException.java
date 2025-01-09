package hello.springtx.order;

public class NotEnoughMoneyException extends Exception { // 결제 잔고가 부족할때 발생하는 비즈니스 예외. (이 경우 롤백하지 않기위해 Exception을 상속받아 체크예외로 적용하였다.)

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
