package com.frezzcoding.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    @field:Named("Love") lateinit var loveInfo : Info

    @Inject
    @field:Named("Hate") lateinit var hateInfo : Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerBoxComponent.builder().build().inject(this)
        println("${loveInfo.text}  ${hateInfo.text}")

    }
}
