package com.sample.workmanagerdagger.ui

import android.app.Activity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.sample.workmanagerdagger.R
import com.sample.workmanagerdagger.work.HelloWorldWorker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        start_worker.setOnClickListener {

            WorkManager.getInstance().enqueue(OneTimeWorkRequestBuilder<HelloWorldWorker>().build())
        }
    }

}
