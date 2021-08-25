package ru.student.VladGedz;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Launcher {

    public static void main( String[] args ) {
        final String[] gameList = new String[]{"Poker", "BlackJack", "Roulette", "Bandit", "Fortune", "Bakkara"};

        Scanner sc = new Scanner( System.in );

        Commands commands = new Commands();
        System.out.println( "Hi, i'am Casino Bot. Chose game that you want to play: " );
        System.out.println(Arrays.toString(gameList));

        while(true){
            String userInput = sc.nextLine();
            Method[] methods = commands.getClass().getDeclaredMethods();
            for(Method method:methods){
                Annotation[] methodAnnotations = method.getDeclaredAnnotations();
                for (Annotation annotation:methodAnnotations) {
                    if (annotation.annotationType() == Command.class){
                        String command = ((Command) annotation).gameCommand();
                        String commandAlias = ((Command) annotation).russianAliasGame();

                        if (userInput.toLowerCase().equals(command) || userInput.toLowerCase().equals(commandAlias)){
                            try {
                                method.invoke(commands);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
