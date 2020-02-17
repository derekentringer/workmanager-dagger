package com.sample.workmanagerdagger.work.factory

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters

interface ChildWorkFactory {
    fun create(appContext: Context, params: WorkerParameters): ListenableWorker
}