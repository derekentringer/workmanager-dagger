package com.sample.workmanagerdagger.di.module

import com.sample.workmanagerdagger.di.annotations.WorkerKey
import com.sample.workmanagerdagger.work.factory.ChildWorkFactory
import com.sample.workmanagerdagger.work.HelloWorldWorker
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface WorkerModule {

    @Binds
    @IntoMap
    @WorkerKey(HelloWorldWorker::class)
    fun bindHelloWorldWorker(factory: HelloWorldWorker.Factory): ChildWorkFactory

}