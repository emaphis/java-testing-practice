package com.scratch;

/**
 * @author emaph
 */
class Account {
    private int balance = 0;
    private final String name;

    public Account(String name) {
        this.name = name;
    }


    public void deposit(int dollars) {
        balance += dollars;
    }


      void withdraw(int dollars) {
         if (balance < dollars) {
            throw new InsufficientFundsException("balance only " + balance);
         }
         balance -= dollars;
      }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean hasPositiveBallance() {
        return balance > 0;
    }

    private static class InsufficientFundsException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}
