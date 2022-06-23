package com.hillel.lesson_11.java14;

public class NPE {

    public static void main(String[] args) {
        User user = new User("Alex", new Identifier("test"));
//        User user = new User("Alex", null);
        System.out.println(user.getIdentifier().getId().toString());
    }
}


class User {
    String name;
    Identifier identifier;

    public User(String name, Identifier identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public Identifier getIdentifier() {
        return identifier;
    }
}

class Identifier {
    String identifier;
    Identifier id;

    public Identifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Identifier getId() {
        return id;
    }
}