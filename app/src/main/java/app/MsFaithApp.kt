package app

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class MsFaithApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }

}