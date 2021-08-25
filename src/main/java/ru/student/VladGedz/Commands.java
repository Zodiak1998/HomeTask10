package ru.student.VladGedz;

import java.util.Random;

public class Commands {

    @Command(gameCommand = "poker", russianAliasGame = "покер")
    public void gamePoker(){
        Random random = new Random();
        double lucky = random.nextDouble() * (-10) + 15;
        int prize = random.nextInt(100) * 5 - 150;
        if (lucky > 0 && prize > 0)
            System.out.println("Congratulations, your prize: " + prize);
        else
            System.out.println("Oh, you lose((");
    }

    @Command(gameCommand = "roulette", russianAliasGame = "рулетка")
    public void gameRoulette(){
        Random random = new Random();
        double lucky = random.nextDouble() * (-12) + 9;
        int prize = random.nextInt(100) * 5 - 150;
        if (lucky > 0 && prize > 0)
            System.out.println("Congratulations, your prize: " + prize);
        else
            System.out.println("Oh, you lose((");
    }

    @Command(gameCommand = "blackjack", russianAliasGame = "блэкджек")
    public void gameBlackjack(){
        Random random = new Random();
        double lucky = random.nextDouble() * (-30) + 10;
        int prize = random.nextInt(100) * 5 - 150;
        if (lucky > 0 && prize > 0)
            System.out.println("Congratulations, your prize: " + prize);
        else
            System.out.println("Oh, you lose((");
    }

    @Command(gameCommand = "bandit", russianAliasGame = "однорукий бандит")
    public void gameBandit(){
        Random random = new Random();
        double lucky = random.nextDouble() * (-2) + 15;
        int prize = random.nextInt(100) * 5 - 150;
        if (lucky > 0 && prize > 0)
            System.out.println("Congratulations, your prize: " + prize);
        else
            System.out.println("Oh, you lose((");
    }

    @Command(gameCommand = "fortune", russianAliasGame = "колесо фортуны")
    public void gameFortune(){
        Random random = new Random();
        double lucky = random.nextDouble() * (-25) + 20;
        int prize = random.nextInt(100) * 5 - 150;
        if (lucky > 0 && prize > 0)
            System.out.println("Congratulations, your prize: " + prize);
        else
            System.out.println("Oh, you lose((");
    }

    @Command(gameCommand = "bakkara", russianAliasGame = "баккара")
    public void gameBakkara(){
        Random random = new Random();
        double lucky = random.nextDouble() * (-8) + 30;
        int prize = random.nextInt(100) * 5 - 150;
        if (lucky > 0 && prize > 0)
            System.out.println("Congratulations, your prize: " + prize);
        else
            System.out.println("Oh, you lose((");
    }

    @Command(gameCommand = "exit", russianAliasGame = "выход")
    public void exit(){
        System.exit(0);
    }
}
