package com.sample.workmanagerdagger

import android.app.Application
import androidx.work.Configuration
import androidx.work.WorkManager
import com.sample.workmanagerdagger.di.component.DaggerWorkerComponent
import com.sample.workmanagerdagger.work.factory.WorkFactory

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        val factory: WorkFactory = DaggerWorkerComponent.create().factory()
        WorkManager.initialize(this, Configuration.Builder().setWorkerFactory(factory).build())

    }

}