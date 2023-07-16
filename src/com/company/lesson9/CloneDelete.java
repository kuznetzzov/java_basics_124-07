package com.company.lesson9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CloneDelete {
    public <T> Collection<T> getDel(Collection<T> collection) {
        Set<T> set = new HashSet<>(collection);
        return set;
    }
}
