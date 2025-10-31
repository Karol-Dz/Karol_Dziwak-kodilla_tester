package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    void shouldAddTransaction() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);
        assertEquals(2,cashMachine.getNumberOfTransactions());
    }

    @Test
    void shouldCalculateBalanceCorrectly() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        assertEquals(400,cashMachine.getBalance());
    }

    @Test
    public void shouldReturnZeroAverageWhenNoDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-200);
        assertEquals(0, cashMachine.getAverageDeposit());
    }

    @Test
    public void shouldReturnZeroAverageWhenNoWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(500);
        assertEquals(0, cashMachine.getAverageWithdrawal());
    }

    @Test
    public void shouldCalculateAverageDepositCorrectly() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(300);
        assertEquals(200, cashMachine.getAverageDeposit());
    }

    @Test
    public void shouldCalculateAverageWithdrawalCorrectly() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-300);
        assertEquals(-200, cashMachine.getAverageWithdrawal());
    }
}