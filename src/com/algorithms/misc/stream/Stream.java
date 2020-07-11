package com.algorithms.misc.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        // Predicate -> Consumer
        List<String> names = Arrays.asList("Foo", "Bar", "Baz", "Foo Bar");
        names.stream()
                .filter(name -> !name.equals("Foo"))
                .forEach(System.out::println);
        names.stream()
                .filter(name -> !name.equals("Foo"))
                .map(new Function<String, User>() {
                    @Override
                    public User apply(String s) {
                        return new User(s);
                    }
                }).forEach(user -> System.out.println(user.getName()));
        names.stream()
                .filter(name -> !name.equals("Foo"))
                .map(User::new)
                .forEach(System.out::println);

        List<User> users = names.stream()
                .filter(name -> !name.equals("Foo"))
                .map(User::new)
                .collect(Collectors.toList());
        int sum = Arrays.asList(1, 2, 3, 4, 5, 7).stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n).sum();
        // average, min, max, count
        List<User> list = Arrays.asList(
                new User("Foo", Arrays.asList("1", "2")),
                new User("Foo Bar", Arrays.asList("7", "5")),
                new User("Baz", Arrays.asList("1", "3")));
        Optional<String> usr = list.stream().
                map(user -> user.getPhones().stream())
                .flatMap(user -> user.filter(phoneNo -> phoneNo.equals("7")))
                .findAny();
    }

    static class User {
        private String name;
        private List<String> phones;

        public User(String name) {
            this.name = name;
            this.phones = new ArrayList<>();
        }

        public User(String name, List<String> phones) {
            this.name = name;
            this.phones = phones;
        }

        public List<String> getPhones() {
            return phones;
        }

        public void setPhones(List<String> phones) {
            this.phones = phones;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
