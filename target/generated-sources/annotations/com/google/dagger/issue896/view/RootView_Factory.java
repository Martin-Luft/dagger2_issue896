package com.google.dagger.issue896.view;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RootView_Factory implements Factory<RootView> {
  private static final RootView_Factory INSTANCE = new RootView_Factory();

  @Override
  public RootView get() {
    return new RootView();
  }

  public static Factory<RootView> create() {
    return INSTANCE;
  }

  public static RootView newRootView() {
    return new RootView();
  }
}
