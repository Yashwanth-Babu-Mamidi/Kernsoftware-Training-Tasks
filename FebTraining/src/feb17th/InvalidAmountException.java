package feb17th;

@SuppressWarnings("serial")
class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}