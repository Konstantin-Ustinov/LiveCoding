package net.livecoding.www;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println(numSquare(3));

        System.out.println("Task 2");
        try {
            equalsNum(1, 1);
        } catch (WrongNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int numSquare(int num) {
        return num * num;
    }

    private static void equalsNum(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Числа равны");
        } else {
            throw new WrongNumberException("Числа не равны");
        }
    }
}
