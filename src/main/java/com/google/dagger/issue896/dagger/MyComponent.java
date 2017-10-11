package com.google.dagger.issue896.dagger;

import javax.inject.Singleton;

import com.google.dagger.issue896.presenter.RootPresenter;

import dagger.Component;

@Component(modules = {MyModule.class})
@Singleton
public interface MyComponent {
  RootPresenter rootPresenter();
}
