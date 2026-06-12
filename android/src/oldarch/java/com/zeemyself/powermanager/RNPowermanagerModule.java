package com.zeemyself.powermanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;

public class RNPowermanagerModule extends ReactContextBaseJavaModule {

    private final RNPowermanagerModuleImpl delegate;

    public RNPowermanagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.delegate = new RNPowermanagerModuleImpl(reactContext);
    }

    @Override
    public String getName() {
        return RNPowermanagerModuleImpl.NAME;
    }

    @ReactMethod
    public void startPowerManager() {
        delegate.startPowerManager();
    }

    @Override
    public Map<String, Object> getConstants() {
        return delegate.getConstants();
    }
}
