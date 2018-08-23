
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
      promise.resolve('Hello')
  }
  
}
