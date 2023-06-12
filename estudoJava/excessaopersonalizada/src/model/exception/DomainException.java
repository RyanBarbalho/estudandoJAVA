package model.exception;

//diferenca entre exception e runtime exception
//exception é uma classe que herda de throwable
//runtime exception é uma classe que herda de exception
//runtime exception é uma exceção que o compilador não obriga a tratar
public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
