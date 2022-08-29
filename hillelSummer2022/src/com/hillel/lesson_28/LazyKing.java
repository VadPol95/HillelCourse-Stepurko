package com.hillel.lesson_28;

import javax.management.ObjectName;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/*
 * В одной далекой стране правил крайне сумасбродный король, который больше всего на свете любил власть.
 * Ему подчинялось множество людей, но вот незадача, у его подчиненных тоже были свои слуги.
 * Король обезумел от мысли, что какой-нибудь дворянин или даже зажиточный холоп может иметь больше слуг, чем он сам.
 * И приказал всем людям на бумаге через запятую написать свое имя и имена своих прямых подчиненных.
 *
 * По результатам опроса король получил огромный список из имен (see "pollResults")
 *
 * У короля разболелась голова. Что с этими данными делать, король не знал и делегировал задачу невезучему слуге.

 * Помогите слуге правильно составить иерархию и подготовить  отчет для короля следующим образом:
 *
 * король
       ...
 *     дворянин Кузькин
           жена Кузькина
 *         управляющий Семен Семеныч
               доярка Нюра
 *             крестьянин Федя
 *         ...
 *     секретарь короля
 *         зажиточный холоп
 *         ...
 *     ...
 *
 * Помните:
 *  1. Те, у кого нет подчиненных, просто написали свое имя.
 *  2. Те, кого никто не указал как слугу, подчиняются напрямую королю (ну, пускай бедный король так думает).
 *  3. Итоговый список должен быть отсортирован в алфавитном порядке на каждом уровне иерархии.
 *
 * Ответ присылайте ссылкой на опубликованный приватный Gist.
 * */

public class LazyKing {
    private static List<String> pollResults = List.of(
            "служанка Аня",
            "управляющий Семен Семеныч: крестьянин Федя, доярка Нюра",
            "дворянин Кузькин: управляющий Семен Семеныч, жена Кузькина, экономка Лидия Федоровна",
            "экономка Лидия Федоровна: дворник Гена, служанка Аня",
            "доярка Нюра",
            "кот Василий: человеческая особь Катя",
            "дворник Гена: посыльный Тошка",
            "киллер Гена",
            "зажиточный холоп: крестьянка Таня",
            "секретарь короля: зажиточный холоп, шпион Т",
            "шпион Т: кучер Д",
            "посыльный Тошка: кот Василий",
            "аристократ Клаус",
            "просветленный Антон"
    );

    public static void main(String... args) {
        Map<String, List<String>> result = new HashMap<>();

        List<User> users = new ArrayList<>();

        for (String str : pollResults) {
            User user = new User();
            if (str.contains(":")) {
                String[] arr = str.replace(" ", "").split(":");
                result.put(arr[0], Arrays.asList(arr[1].split(",")));
                user.setName(arr[0]);
                user.setServantsStr(Arrays.asList(arr[1].split(",")));
            } else {
                result.put(str.replace(" ", ""), null);
                user.setName(str.replace(" ", ""));
            }
            users.add(user);
        }

        for (User u : users) {
            for (User u1 : users) {
                if (!Objects.equals(u.getName(), u1.getName())){
                    if (Objects.nonNull(u1.getServantsStr()) && u1.getServantsStr().contains(u.getName())){
                        u.setMaster(u1.getName());
                    }
                }
            }
        }

        for (User u : users) {
            for (User u1 : users) {
                if (u.getName().equals(u1.getMaster())) {
                    u.setServant(u1);
                }
            }
        }
        
        users.forEach(System.out::println);

    }
}

class User {
    private String name;
    private String master;
    private List<User> servants = new ArrayList<>();
    private List<String> servantsStr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public List<User> getServants() {
        return servants;
    }

    public void setServants(List<User> servants) {
        this.servants = servants;
    }

    public List<String> getServantsStr() {
        return servantsStr;
    }

    public void setServantsStr(List<String> servantsStr) {
        this.servantsStr = servantsStr;
    }

    public void setServant(User u) {
        this.servants.add(u);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(master, user.master) && Objects.equals(servants, user.servants) && Objects.equals(servantsStr, user.servantsStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, master, servants, servantsStr);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", master='" + master + '\'' +
                ", servants=" + servants +
                ", servantsStr=" + servantsStr +
                '}';
    }
}
