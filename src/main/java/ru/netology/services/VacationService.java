package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expensens, int threshold) {
        int wallet = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                // отдыхаем
                wallet -= expensens;
                wallet /= 3;
                counter++;
            } else {
                // работаем
                wallet += income;
                wallet -= expensens;
            }

        }
        return counter;
    }
}

