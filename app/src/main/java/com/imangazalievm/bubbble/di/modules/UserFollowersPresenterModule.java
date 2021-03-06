package com.imangazalievm.bubbble.di.modules;

import com.imangazalievm.bubbble.di.scopes.Presenter;

import dagger.Module;
import dagger.Provides;

@Module
public class UserFollowersPresenterModule {

    private final long userId;

    public UserFollowersPresenterModule(long userId) {
        this.userId = userId;
    }

    @Provides
    @Presenter
    long provideUserId() {
        return userId;
    }

}
