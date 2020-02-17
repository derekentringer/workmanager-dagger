package com.sample.workmanagerdagger.work

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.sample.workmanagerdagger.work.factory.ChildWorkFactory
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import javax.inject.Inject

class Foo @Inject constructor()

class HelloWorldWorker @AssistedInject constructor(@Assisted private val appContext: Context,
                                                   @Assisted private val params: WorkerParameters,
                                                   private val foo: Foo) : Worker(appContext, params) {

    override fun doWork(): Result {
        Log.d("TestWorker", "constructor injected foo: $foo")

        return Result.success()
    }

    @AssistedInject.Factory
    interface Factory : ChildWorkFactory

}