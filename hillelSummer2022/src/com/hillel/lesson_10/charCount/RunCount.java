package com.hillel.lesson_10.charCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class RunCount {
    public static void main(String[] args) {
        Map<String, Integer> alph = new HashMap<>();
        String[] text = normalizeText(Text.getText()).split("");
        for (String s : text) {
            if (!alph.containsKey(s)) {
                alph.put(s, 1);
            } else {
                alph.put(s, alph.get(s) + 1);
            }
        }


        List<Letter> letters = new ArrayList<>();
        for (String key : alph.keySet()) {
            letters.add(new Letter(key, alph.get(key), ((double) alph.get(key) / text.length) * 100));
        }
        System.out.println(alph);
        System.out.println("-----------------------");
        letters.sort(Comparator.comparing(Letter::getPersent).reversed());
        letters.forEach(System.out::println);
    }

    public static String normalizeText(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                result.append(c);
            }
        }
        return result.toString().toLowerCase(Locale.ROOT);
    }
}

class Letter {
    private String name;
    private Integer couunt;
    private Double persent;

    public Letter(String name, Integer couunt, Double persent) {
        this.name = name;
        this.couunt = couunt;
        this.persent = persent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCouunt() {
        return couunt;
    }

    public void setCouunt(Integer couunt) {
        this.couunt = couunt;
    }

    public Double getPersent() {
        return persent;
    }

    public void setPersent(Double persent) {
        this.persent = persent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return Objects.equals(name, letter.name) && Objects.equals(couunt, letter.couunt) && Objects.equals(persent, letter.persent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, couunt, persent);
    }

    @Override
    public String toString() {
        return "letter : " + name +
                ", count : " + couunt +
                ", persent : " + persent;
    }
}
