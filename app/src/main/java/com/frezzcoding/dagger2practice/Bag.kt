package com.frezzcoding.dagger2practice

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class Bag {
    @Provides
    @Named("Love")
    fun sayLoveDagger() : Info{
        return Info("Love Dagger 2")
    }

    @Provides
    @Named("Hate")
    fun sayHateDagger() : Info{
        return Info("Hate Dagger 2")
    }

}