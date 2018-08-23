import FamokoSdk from './NativeBridges';
import { NativeEventEmitter } from 'react-native';

class Famoko {
  constructor() {
    this.evt = new NativeEventEmitter(FamokoSdk);
  }

  async sayHello() {
    const saying = await FamokoSdk.sayHello();
    console.log(saying);
  }

  getDeviceId() {
    return FamokoSdk.getDeviceId();
  }
}

export default Famoko;
