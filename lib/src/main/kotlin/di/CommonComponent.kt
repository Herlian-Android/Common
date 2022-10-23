package di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CommonModule::class])
interface CommonComponent {
    @Component.Factory
    interface Factory {
        fun create(): CommonComponent
    }
}