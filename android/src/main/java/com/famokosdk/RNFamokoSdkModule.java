package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class RNFamokoSdkModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNFamokoSdkModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNFamokoSdk";
  }

  @ReactMethod
  public void sayHello(Promise promise) {
    promise.resolve("Hello");
  }

  @ReactMethod
  public void getDeviceId(Promise promise) {
    try {
      String deviceId = Settings.Secure.getString(this.getReactApplicationContext().getContentResolver(),
          Settings.Secure.ANDROID_ID);
      promise.resolve(deviceId);
    } catch (Exception err) {
      promise.reject(err);
    }
  }

}
