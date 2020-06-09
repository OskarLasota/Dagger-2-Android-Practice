package com.frezzcoding.dagger2practice

import dagger.Component

@Component(modules = [Bag::class])
interface BoxComponent {
    fun inject(app : MainActivity)
}