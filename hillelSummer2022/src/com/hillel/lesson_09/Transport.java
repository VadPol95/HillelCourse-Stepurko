package com.hillel.lesson_09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Transport {
    /*
    7. Мотоциклист. Определить иерархию амуниции. Экипировать мотоциклиста. Подсчитать стоимость. Провести сортировку
    амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
     */

    public static void main(String[] args) {
        List<Equipment> eq = new Generator().getEquip();
        MotoService ms = new MotoService();
        eq.forEach(System.out::println);
        System.out.println("-------------------");
        System.out.println(ms.countPrice(eq));
        System.out.println("-------------------");
        ms.sortEquipmentByWeight(eq).forEach(System.out::println);
        System.out.println("-------------------");
        ms.sortEquipmentByPrice(eq, 100, 1000).forEach(System.out::println);
    }
}
class Equipment{
    private String name;
    private int weight;
    private int price;

    public Equipment(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return weight == equipment.weight && price == equipment.price && Objects.equals(name, equipment.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price);
    }

    @Override
    public String
    toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}

class MotoService{

    public int countPrice(List<Equipment> equipment){
        int count = 0;
        for (Equipment e : equipment) {
            count += e.getPrice();
        }
        return count;
    }

    public List<Equipment> sortEquipmentByWeight(List<Equipment> equipment){
//        equipment.sort(Comparator.comparing(Equipment::getWeight));
        equipment.sort(Comparator.comparing(Equipment::getWeight).reversed());
        return equipment;
    }

    public List<Equipment> sortEquipmentByPrice(List<Equipment> equipment, int min, int max){
        List<Equipment> result = new ArrayList<>();
        for (Equipment e : equipment) {
            if (e.getPrice() > min && e.getPrice() < max) {
                result.add(e);
            }
        }
        return result;
    }
}

class Generator{
    public List<Equipment> getEquip(){
        List<Equipment> eq = new ArrayList<>();
        eq.add(new Equipment("1", 123,1000));
        eq.add(new Equipment("2", 10,1000));
        eq.add(new Equipment("3", 200,1000));
        eq.add(new Equipment("4", 100,500));
        eq.add(new Equipment("5", 5,1000));
        eq.add(new Equipment("6", 20,500));
        return eq;
    }
}
