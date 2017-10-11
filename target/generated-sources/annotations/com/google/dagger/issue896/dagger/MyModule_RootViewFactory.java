package com.google.dagger.issue896.dagger;

import com.google.dagger.issue896.presenter.RootPresenter;
import com.google.dagger.issue896.view.RootView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_RootViewFactory implements Factory<RootPresenter.RootViewInterface> {
  private final Provider<RootView> rootViewProvider;

  public MyModule_RootViewFactory(Provider<RootView> rootViewProvider) {
    this.rootViewProvider = rootViewProvider;
  }

  @Override
  public RootPresenter.RootViewInterface get() {
    return Preconditions.checkNotNull(
        MyModule.rootView(rootViewProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RootPresenter.RootViewInterface> create(
      Provider<RootView> rootViewProvider) {
    return new MyModule_RootViewFactory(rootViewProvider);
  }
}
