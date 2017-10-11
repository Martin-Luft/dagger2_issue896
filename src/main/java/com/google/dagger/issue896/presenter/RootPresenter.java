package com.google.dagger.issue896.presenter;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RootPresenter {

  public interface RootViewInterface {
  }

  @Inject
  RootViewInterface rootView;

  @Inject
  RootPresenter() {
  }
}
