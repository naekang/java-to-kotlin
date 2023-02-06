package com.lannstark.lec07;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public class Lec07Main {

    public static void main(String[] args) throws IOException {
    }

    private static int parseIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다.", str));
        }
    }

  private static int parseIntOrThrow2(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw null;
    }
  }

}
