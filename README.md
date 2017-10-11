# Example project for Dagger 2 issue #896

https://github.com/google/dagger/issues/896

Since Dagger 2.12 - Importing this project into Eclipse will result in this error:

> The method provider(Provider<T>) in the type DoubleCheck is not applicable for the arguments (Factory)

Using plain Maven produces no error.

I found 2 possibilities to fix this error:

1) Remove `@Singleton` from `RootView`
2) Replace
```
@Module
public abstract class MyModule {

  @Binds
  @Singleton
  public abstract RootViewInterface rootView(RootView rootView);
}
```

with

```
@Module
public class MyModule {

  @Provides
  @Singleton
  public static RootViewInterface rootView(RootView rootView) {
    return rootView;
  };
}
```
