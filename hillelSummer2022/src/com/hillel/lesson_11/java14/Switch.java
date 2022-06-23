package com.hillel.lesson_11.java14;

public class Switch {
    public static void main(String[] args) {
        System.out.println(Switch.createUser("Alex"));
        System.out.println(Switch.createUser("ALEX"));
    }

    private static UserSw createUser(String name){
        switch (name){
            case "Alex": return new UserSw(name);
            default: return new UserSw("default");
        }
    }
}

class UserSw{
    String name;

    public UserSw(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserSw{" +
                "name='" + name + '\'' +
                '}';
    }
}
