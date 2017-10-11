package com.google.dagger.issue896.dagger;

import com.google.dagger.issue896.presenter.RootPresenter;
import com.google.dagger.issue896.presenter.RootPresenter_Factory;
import com.google.dagger.issue896.view.RootView;
import com.google.dagger.issue896.view.RootView_Factory;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMyComponent implements MyComponent {
  private Provider<RootView> rootViewProvider;

  private Provider<RootPresenter> rootPresenterProvider;

  private DaggerMyComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MyComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.rootViewProvider = DoubleCheck.provider(RootView_Factory.create());
    this.rootPresenterProvider =
        DoubleCheck.provider(RootPresenter_Factory.create((Provider) rootViewProvider));
  }

  @Override
  public RootPresenter rootPresenter() {
    return rootPresenterProvider.get();
  }

  public static final class Builder {
    private Builder() {}

    public MyComponent build() {
      return new DaggerMyComponent(this);
    }
  }
}
