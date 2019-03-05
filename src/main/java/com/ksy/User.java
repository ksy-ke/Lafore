package com.ksy;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;
import static java.util.Objects.requireNonNull;

public final class User {
    private final String name;
    private final List<String> friends;

    private User(String name, List<String> friends) {
        this.name = name;
        this.friends = friends;
    }

    public static User getInstance(String name, List<String> friends) {
        return new User(requireNonNull(name), unmodifiableList(new ArrayList<>(friends)));
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }
}