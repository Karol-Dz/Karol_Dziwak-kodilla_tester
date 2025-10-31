package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    @Test
    public void shouldCalculateTotalBalanceFromAllMachines() {
        CashMachine m1 = new CashMachine();
        m1.addTransaction(200);
        m1.addTransaction(-100);

        CashMachine m2 = new CashMachine();
        m2.addTransaction(300);
        m2.addTransaction(-50);

        Bank bank = new Bank(new CashMachine[]{m1, m2});

        assertEquals(350, bank.getTotalBalance());
    }

    @Test
    public void shouldCountAllDepositsAndWithdrawals() {
        CashMachine m1 = new CashMachine();
        m1.addTransaction(200);
        m1.addTransaction(-100);

        CashMachine m2 = new CashMachine();
        m2.addTransaction(300);
        m2.addTransaction(-50);
        m2.addTransaction(-100);

        Bank bank = new Bank(new CashMachine[]{m1, m2});

        assertEquals(2, bank.getTotalDepositsCount());
        assertEquals(3, bank.getTotalWithdrawalsCount());
    }

    @Test
    public void shouldCalculateAverageDepositAcrossAllMachines() {
        CashMachine m1 = new CashMachine();
        m1.addTransaction(200);
        CashMachine m2 = new CashMachine();
        m2.addTransaction(400);
        Bank bank = new Bank(new CashMachine[]{m1, m2});

        assertEquals(300, bank.getAverageDeposit());
    }

    @Test
    public void shouldReturnZeroAverageWhenNoWithdrawals() {
        CashMachine m1 = new CashMachine();
        m1.addTransaction(100);
        CashMachine m2 = new CashMachine();
        m2.addTransaction(200);
        Bank bank = new Bank(new CashMachine[]{m1, m2});

        assertEquals(0, bank.getAverageWithdrawal());
    }
}