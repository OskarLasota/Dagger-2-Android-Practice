package com.frezzcoding.dagger2practice

import dagger.Module
import dagger.Provides

@Module
class Bag {
    @Provides
    fun sayLoveDagger() : Info{
        return Info("Love Dagger 2")
    }
}