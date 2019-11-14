package org.firehound.githubreleases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.firehound.githubreleases.models.Release

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
