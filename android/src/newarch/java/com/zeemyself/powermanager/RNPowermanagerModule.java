package com.zeemyself.powermanager;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;

public class RNPowermanagerModule extends NativeRNPowermanagerSpec {

    private final RNPowermanagerModuleImpl delegate;

    public RNPowermanagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.delegate = new RNPowermanagerModuleImpl(reactContext);
    }

    @Override
    public String getName() {
        return RNPowermanagerModuleImpl.NAME;
    }

    @Override
    public void startPowerManager() {
        delegate.startPowerManager();
    }

    @Override
    protected Map<String, Object> getTypedExportedConstants() {
        return delegate.getConstants();
    }
}
