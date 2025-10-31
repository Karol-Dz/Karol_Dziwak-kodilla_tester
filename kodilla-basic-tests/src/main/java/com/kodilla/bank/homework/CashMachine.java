package com.kodilla.bank.homework;

public class CashMachine {
        private int[] transactions;
        private int size;

        public CashMachine() {
            this.transactions = new int[0];
            this.size = 0;
        }

        public void addTransaction(int amount) {
            if (amount == 0) {
                return; // 0 nie jest transakcją
            }
            int[] newTab = new int[this.size + 1];
            System.arraycopy(this.transactions, 0, newTab, 0, this.size);
            newTab[this.size] = amount;
            this.transactions = newTab;
            this.size++;
        }

        public int[] getTransactions() {
            return transactions;
        }

        public int getBalance() {
            int sum = 0;
            for (int t : transactions) {
                sum += t;
            }
            return sum;
        }

        public int getNumberOfTransactions() {
            return size;
        }

        public int getNumberOfDeposits() {
            int count = 0;
            for (int t : transactions) {
                if (t > 0) count++;
            }
            return count;
        }

        public int getNumberOfWithdrawals() {
            int count = 0;
            for (int t : transactions) {
                if (t < 0) count++;
            }
            return count;
        }

        public double getAverageDeposit() {
            int sum = 0;
            int count = 0;
            for (int t : transactions) {
                if (t > 0) {
                    sum += t;
                    count++;
                }
            }
            return count == 0 ? 0 : (double) sum / count;
        }

        public double getAverageWithdrawal() {
            int sum = 0;
            int count = 0;
            for (int t : transactions) {
                if (t < 0) {
                    sum += t;
                    count++;
                }
            }
            return count == 0 ? 0 : (double) sum / count;
        }
}
