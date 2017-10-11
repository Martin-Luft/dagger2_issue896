package com.google.dagger.issue896.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RootPresenter_MembersInjector implements MembersInjector<RootPresenter> {
  private final Provider<RootPresenter.RootViewInterface> rootViewProvider;

  public RootPresenter_MembersInjector(Provider<RootPresenter.RootViewInterface> rootViewProvider) {
    this.rootViewProvider = rootViewProvider;
  }

  public static MembersInjector<RootPresenter> create(
      Provider<RootPresenter.RootViewInterface> rootViewProvider) {
    return new RootPresenter_MembersInjector(rootViewProvider);
  }

  @Override
  public void injectMembers(RootPresenter instance) {
    injectRootView(instance, rootViewProvider.get());
  }

  public static void injectRootView(
      RootPresenter instance, RootPresenter.RootViewInterface rootView) {
    instance.rootView = rootView;
  }
}
