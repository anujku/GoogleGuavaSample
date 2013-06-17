package com.anuj.guava.sample;

import java.util.Collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class GuavaMaps {
  public static void main(String[] args) {

    // MultiMap with multiple values for a key
    Multimap<String, Integer> map = HashMultimap.create();
    map.put("Anuj", 100);
    map.put("Anuj", 200);
    map.put("Anuj", 300);
    map.put("Anuj", 400);

    System.out.println(Collections.max(map.get("Anuj")));

    // BiDirectional Map with bidirectional mapping between keys and values
    // (Both are keys)
    BiMap<String, Integer> biMap = HashBiMap.create();
    biMap.put("Anuj", 100);
    biMap.put("Anuja", 200);

    // Finding value using key
    System.out.println(biMap.get("Anuj"));

    // Finding key using value
    System.out.println(biMap.inverse().get(200));

  }
}
