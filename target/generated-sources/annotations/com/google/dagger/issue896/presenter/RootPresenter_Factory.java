package com.google.dagger.issue896.presenter;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RootPresenter_Factory implements Factory<RootPresenter> {
  private final Provider<RootPresenter.RootViewInterface> rootViewProvider;

  public RootPresenter_Factory(Provider<RootPresenter.RootViewInterface> rootViewProvider) {
    this.rootViewProvider = rootViewProvider;
  }

  @Override
  public RootPresenter get() {
    RootPresenter instance = new RootPresenter();
    RootPresenter_MembersInjector.injectRootView(instance, rootViewProvider.get());
    return instance;
  }

  public static Factory<RootPresenter> create(
      Provider<RootPresenter.RootViewInterface> rootViewProvider) {
    return new RootPresenter_Factory(rootViewProvider);
  }

  public static RootPresenter newRootPresenter() {
    return new RootPresenter();
  }
}
