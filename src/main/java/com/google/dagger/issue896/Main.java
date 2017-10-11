package com.google.dagger.issue896;

import com.google.dagger.issue896.dagger.DaggerMyComponent;

public class Main {

  public static void main(String... args) {
    DaggerMyComponent.create().rootPresenter();
  }
}
