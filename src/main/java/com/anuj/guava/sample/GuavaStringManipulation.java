package com.anuj.guava.sample;

import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class GuavaStringManipulation {

  public static void main(String[] args) {
    // Joiner
    Joiner joiner = Joiner.on(":").skipNulls();
    String jonedString = joiner.join("Anuj", "Kulkarni", null, null, "Rocks");
    System.out.println(jonedString);

    // Splitter
    Splitter splitter = Splitter.on(":").omitEmptyStrings().trimResults();
    System.out.println(splitter.split(jonedString + ": Yes he does : really "));

    // CharMatcher
    String test = "=IF(D24=TRUE,D45 *Constants!E4,)";
    System.out.println(CharMatcher.DIGIT.removeFrom(test));
    System.out.println(CharMatcher.DIGIT.retainFrom(test));
    System.out.println(CharMatcher.DIGIT.replaceFrom(test, "11111"));
    System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom(test, "ANUJ"));
    System.out.println(CharMatcher.JAVA_LETTER.replaceFrom(test, " X "));
    System.out.println(CharMatcher.anyOf("Constants").removeFrom(test));
    System.out.println(CharMatcher.anyOf(",)").replaceFrom(test, ",IFERROR(1\0))"));
    System.out.println(CharMatcher.inRange('a', 'z').retainFrom(test));
    System.out.println(CharMatcher.inRange('A', 'Z').retainFrom(test));
    System.out.println(CharMatcher.inRange('A', 'Z').replaceFrom(test, " "));

    // CaseFormat
    System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "Anuj_Kulkarni"));
    System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, "anuj-kulkarni"));
  }
}