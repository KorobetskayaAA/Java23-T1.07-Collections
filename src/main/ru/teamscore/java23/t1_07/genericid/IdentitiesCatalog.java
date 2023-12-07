package ru.teamscore.java23.t1_07.genericid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class IdentitiesCatalog<T extends Identity<TId> & Comparable<T>, TId> {
    Collection<T> identities = new ArrayList<>();
}

class Catalog<T extends Catalog.Searchable> {
    public interface Searchable {
        boolean match(String pattern);
    }
    Collection<T> items;
    public Optional<T> search (String pattern) {
        return items.stream().filter(i -> i.match(pattern)).findFirst();
    }
}