package com.kodilla.bank.homework;

public class Bank {
        private CashMachine[] machines;

        public Bank(CashMachine[] machines) {
            this.machines = machines;
        }

        public int getTotalBalance() {
            int total = 0;
            for (CashMachine machine : machines) {
                total += machine.getBalance();
            }
            return total;
        }

        public int getTotalDepositsCount() {
            int count = 0;
            for (CashMachine machine : machines) {
                count += machine.getNumberOfDeposits();
            }
            return count;
        }

        public int getTotalWithdrawalsCount() {
            int count = 0;
            for (CashMachine machine : machines) {
                count += machine.getNumberOfWithdrawals();
            }
            return count;
        }

        public double getAverageDeposit() {
            int sum = 0;
            int count = 0;
            for (CashMachine machine : machines) {
                for (int t : machine.getTransactions()) {
                    if (t > 0) {
                        sum += t;
                        count++;
                    }
                }
            }
            return count == 0 ? 0 : (double) sum / count;
        }

        public double getAverageWithdrawal() {
            int sum = 0;
            int count = 0;
            for (CashMachine machine : machines) {
                for (int t : machine.getTransactions()) {
                    if (t < 0) {
                        sum += t;
                        count++;
                    }
                }
            }
            return count == 0 ? 0 : (double) sum / count;
        }
}
