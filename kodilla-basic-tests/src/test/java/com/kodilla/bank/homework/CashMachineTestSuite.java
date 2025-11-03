package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    void shouldAddTransaction() {
        // given
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);
        // when
        double result = cashMachine.getNumberOfTransactions();
        // then
        assertEquals(2,cashMachine.getNumberOfTransactions());
    }

    @Test
    void shouldCalculateBalanceCorrectly() {
        // given
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        // when
        double result = cashMachine.getBalance();
        // then
        assertEquals(400,cashMachine.getBalance());
    }

    @Test
    public void shouldReturnZeroAverageWhenNoDeposits() {
        // given
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-200);
        // when
        double result = cashMachine.getAverageDeposit();
        // then
        assertEquals(0, cashMachine.getAverageDeposit());
    }

    @Test
    public void shouldReturnZeroAverageWhenNoWithdrawals() {
        // given
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(500);
        // when
        double result = cashMachine.getAverageWithdrawal();
        // then
        assertEquals(0, cashMachine.getAverageWithdrawal());
    }

    @Test
    public void shouldCalculateAverageDepositCorrectly() {
        // given
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(300);
        // when
        double result = cashMachine.getAverageDeposit();
        // then
        assertEquals(200, cashMachine.getAverageDeposit());
    }

    @Test
    public void shouldCalculateAverageWithdrawalCorrectly() {
        // given
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-300);
        // when
        double result = cashMachine.getAverageWithdrawal();
        // then
        assertEquals(-200, cashMachine.getAverageWithdrawal());
    }
}