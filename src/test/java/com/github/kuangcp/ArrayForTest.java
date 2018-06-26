package com.github.kuangcp;

import org.junit.Test;

/**
 * Created by https://github.com/kuangcp
 *
 * @author kuangcp
 */
public class ArrayForTest {

  @Test
  public void two() {
    Integer[][] list = {{3, 4, 5}, {1, 2}};


    // TODO  一个 foreach 迭代两层循环  ?
    for (Integer[] integers : list) {
      for (Integer integer : integers) {
        System.out.println(integer);
      }
    }
  }
}
