package com.anuj.guava.sample;

import java.util.List;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class GuavaIterables {

  public static void main(String[] args) {

    // Using Lists to create and initialize an arraylist with one line
    List<Integer> first = Lists.newArrayList(1, 2, 3);
    List<Integer> second = Lists.newArrayList(4, 5, 6);
    List<Integer> third = Lists.newArrayList(7, 8, 9);

    // Use Iterables to concat lists
    Iterable<Integer> all = Iterables.concat(first, second, third);

    System.out.println(all);

    first.add(0);

    // Iterable is updated with update to list
    System.out.println(all);

  }
}
