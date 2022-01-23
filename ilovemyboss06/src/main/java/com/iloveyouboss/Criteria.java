/*
 * The ILoveYouBoss App
 */
package com.iloveyouboss;

import java.util.*;

/**
 * Criteria instance is simply a container that holds a bunch of Criterions.
 * @author emaph
 */
public class Criteria implements Iterable<Criterion> {
    private final List<Criterion> criteria = new ArrayList<>();

    public void add(Criterion criterion) {
      criteria.add(criterion);
   }

   @Override
   public Iterator<Criterion> iterator() {
      return criteria.iterator();
   }

   public int arithmeticMean() {
      return 0;
   }

   public double geometricMean(int[] numbers) {
      int totalProduct = Arrays.stream(numbers).reduce(1, (product, number) -> product * number);
      return Math.pow(totalProduct, 1.0 / numbers.length);
   }
}
