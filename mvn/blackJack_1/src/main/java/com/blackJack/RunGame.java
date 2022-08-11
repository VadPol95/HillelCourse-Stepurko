package com.blackJack;

import com.blackJack.dto.Card;
import com.blackJack.dto.Player;
import com.blackJack.service.CardDeck;
import com.blackJack.service.ComputerTurn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class RunGame {
    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.result");

    public static void main(String[] args) {
        System.out.println("Добрый день. Веедите ваше имя ...");

        Locale locale;
        if (args.length == 0)
            locale = new Locale("en", "US");
        else
            locale = new Locale(args[0], args[1]);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("language", locale);

        Scanner scanner = new Scanner(System.in);
        Player pl = new Player(scanner.nextLine());
//        loggerDebug.debug("hello user : " + pl.getName());

        String ch = "";
        do {
            System.out.println("Для старта игры нажмите [S] или [X] для выхода");
            ch = scanner.nextLine();
            if (ch.equalsIgnoreCase("X")) System.exit(-1);
        } while (!ch.equalsIgnoreCase("S"));

        boolean nextGame = true;

        do {
            CardDeck cardDeck = new CardDeck();
            List<Card> deck =cardDeck.getNewDeck();
            int num = 0;
            boolean next = true;
            pl.setHand(new ArrayList<>());
            do {
                Card card = deck.get(num++);
                pl.getHand().add(card);
                cardDeck.printHand(pl.getHand());
                System.out.println("ЕЩЕ [Y] / [N] ");
                ch = scanner.nextLine();
                if (ch.equalsIgnoreCase("N")) next = false;
            } while (next);

            int handScore = pl.getHand().stream().mapToInt(Card::getCost).sum();
            int computerScore = new ComputerTurn().getComputerScore();
            System.out.println("Игрок :" + handScore + " == Компьютер : " + computerScore);
            if (handScore < 22 && handScore > computerScore) {
                System.out.println("Игрок выиграл");
                pl.setWin(pl.getWin() + 1);
            } else {
                System.out.println("Компьютер выиграл");
                pl.setLost(pl.getLost() + 1);
            }
            System.out.println("Сиграем еще партейку [Y] / [N]");
            ch = scanner.nextLine();
            if (ch.equalsIgnoreCase("N")) nextGame = false;
        } while (nextGame);


        loggerResult.debug("===============================================");
        loggerResult.debug("Игровая статистика для игрока : " + pl.getName());
        loggerResult.debug("Выиграно   :" + pl.getWin());
        loggerResult.debug("Проигранно :" + pl.getLost());
        loggerResult.debug("===============================================");


    }
}
