package com.javacource.Buket;

public class Buket {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[]{
                new Flower(35.59, "Goland", "Red", "Rose", 3),
                new Flower(15, "Rus", "Red", "Xrizantema", 5),
                new Flower(69.9, "England", "Red", "Pion", 1),
                new Flower(19.5, "Turkey", "белый", "gipsofila", 10),
        };
        getFlowersInformation(flowers);
    }

    private static double calculateCost(Flower[] flowers) {
        double sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getCost();
        }
        int pay = 10;
        sum = sum + (sum * pay / 100);
        return sum;
    }

    private static int getMinLifeSpan(Flower[] flowers) {
        int min = flowers[0].getLifeSpan();
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }
        return min;
    }

    private static String getFlowersInformation(Flower[] flowers) {
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
        System.out.println(calculateCost(flowers));
        System.out.println(getMinLifeSpan(flowers));
        return null;
    }
}
