package com.zwy.neihan.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.zwy.neihan.mvp.contract.SubscribeContract;
import com.zwy.neihan.mvp.model.SubscribeModel;


@Module
public class SubscribeModule {
    private SubscribeContract.View view;

    /**
     * 构建SubscribeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public SubscribeModule(SubscribeContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    SubscribeContract.View provideSubscribeView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    SubscribeContract.Model provideSubscribeModel(SubscribeModel model) {
        return model;
    }
}