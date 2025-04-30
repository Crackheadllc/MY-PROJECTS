package exceptions;

/***
 * This Exception is thrown when user tries to make a transaction
 * and he does not have enough funds for that.
 */

public class InsufficentFundsExceptions extends RuntimeException{

    public InsufficentFundsExceptions(String errorMsg){
        super(errorMsg);
    }
}
