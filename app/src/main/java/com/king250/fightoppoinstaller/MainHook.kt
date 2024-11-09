package com.king250.fightoppoinstaller

import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.XposedHelpers
import de.robv.android.xposed.callbacks.XC_LoadPackage

class MainHook : IXposedHookLoadPackage {
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        if (lpparam.packageName == "android") {
            val classLoader = lpparam.classLoader
            XposedBridge.log("Patch oppo usb alert START")
            try {
                XposedHelpers.findAndHookMethod(
                    "com.android.server.pm.ColorPackageInstallInterceptManager",
                    classLoader,
                    "allowInterceptAdbInstallInInstallStage",
                    Int::class.java,
                    "android.content.pm.PackageInstaller\$SessionParams",
                    java.io.File::class.java,
                    String::class.java,
                    "android.content.pm.IPackageInstallObserver2",
                    object : XC_MethodHook() {
                        override fun beforeHookedMethod(param: MethodHookParam) {
                            param.result = false
                        }
                    }
                )
            }
            catch (e: Exception) {
                XposedBridge.log("Error hooking method: ${e.message}")
            }
            XposedBridge.log("Patch oppo usb alert END")
        }
    }
}
