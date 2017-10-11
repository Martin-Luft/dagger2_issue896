package com.google.dagger.issue896.dagger;

import javax.inject.Singleton;

import com.google.dagger.issue896.presenter.RootPresenter.RootViewInterface;
import com.google.dagger.issue896.view.RootView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MyModule {

  @Binds
  @Singleton
  public abstract RootViewInterface rootView(RootView rootView);
}

// use this  to fix the error
//@Module
//public class MyModule {
//
//  @Provides
//  @Singleton
//  public static RootViewInterface rootView(RootView rootView) {
//    return rootView;
//  };
//}
