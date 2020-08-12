package com.likethesalad.android.aaper.transformations

import android.app.Activity
import com.likethesalad.android.aaper.api.base.bytebuddy.AndroidComponentBaseTransformation

/**
 * ByteBuddy transformation for Activities.
 */
class ActivityTransformation : AndroidComponentBaseTransformation() {

    override fun getHostClassType(): Class<out Any> {
        return Activity::class.java
    }
}