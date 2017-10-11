package com.google.dagger.issue896.view;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.google.dagger.issue896.presenter.RootPresenter.RootViewInterface;

@Singleton // remove this to fix the error
public class RootView implements RootViewInterface {

  @Inject
  RootView() {
  }
}
