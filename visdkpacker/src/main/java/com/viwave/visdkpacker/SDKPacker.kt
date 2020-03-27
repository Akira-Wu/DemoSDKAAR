package com.viwave.visdkpacker

import com.viwave.visdk.ViSDK

object SDKPacker {

    private val viSDK = ViSDK()

    fun getName(): String {
        return viSDK.getName()/*"SDKPacker"*/
    }

}