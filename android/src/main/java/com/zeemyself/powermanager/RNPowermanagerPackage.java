package com.zeemyself.powermanager;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

public class RNPowermanagerPackage extends TurboReactPackage {

    @Override
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        if (name.equals(RNPowermanagerModuleImpl.NAME)) {
            return new RNPowermanagerModule(reactContext);
        }
        return null;
    }

    @Override
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return () -> {
            final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
            boolean isTurboModule = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;
            moduleInfos.put(
                RNPowermanagerModuleImpl.NAME,
                new ReactModuleInfo(
                    RNPowermanagerModuleImpl.NAME,
                    RNPowermanagerModuleImpl.NAME,
                    false, // canOverrideExistingModule
                    false, // needsEagerInit
                    false, // isCxxModule
                    isTurboModule // isTurboModule
                ));
            return moduleInfos;
        };
    }
}