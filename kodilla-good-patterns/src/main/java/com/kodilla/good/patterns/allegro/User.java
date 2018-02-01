package com.kodilla.good.patterns.allegro;

public final class User {
    public final String name;
    public final String surname;
    public final String nick;

    public User(final String name, final String surname, final String nick) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNick() {
        return nick;
    }
}
