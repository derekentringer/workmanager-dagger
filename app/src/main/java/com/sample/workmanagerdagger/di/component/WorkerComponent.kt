package com.sample.workmanagerdagger.di.component

import com.sample.workmanagerdagger.di.module.AssistedInjectModule
import com.sample.workmanagerdagger.di.module.WorkerModule
import com.sample.workmanagerdagger.work.factory.WorkFactory
import dagger.Component

@Component(modules = [
    AssistedInjectModule::class,
    WorkerModule::class
])
interface WorkerComponent {
    fun factory(): WorkFactory
}