package com.hillel.lesson_06.task;

public class PusUp {
    /*
    Человек подтягивается, делает подходы лесенкой начиная с 1 раза
    - подсчитать сколько он всего подтянеться за N подходов, N задано с клавиатуры
    N = 4 -> 1 + 2 + 3 + 4 = 10

    - вывести общее время выполнения упражнения (10:45)
    каждое подтягивание занимает 5с, первый перерыв между подхлдами 60с,
    каждый следующий перерыв на 20% больше предыдущего.
     */
    public static void main(String[] args) {
        int numberOfRepetition = 3;
        int work = 5;
        int pause = 60;

        int totalTime = 0;

        int count = 0;
        for (int i = 1; i <= numberOfRepetition; i++){
            count += i;
            totalTime += (i * work);
            if (i == 1) {
                totalTime += pause;
            } else if (i < numberOfRepetition){
                totalTime += pause * (1.2 * (i -1));
            }
        }
        System.out.println(count);
        System.out.println(totalTime);
        int min = totalTime / 60;
        int sec = totalTime % 60;
        System.out.println(min + ":" + sec);

    }
}
