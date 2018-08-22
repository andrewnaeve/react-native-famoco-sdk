import FamokoSdk from './NativeBridges';

class Famoko {
  constructor() {
    this.evt = new NativeEventEmitter(FamokoSdk);
  }
}

export default Famoko;
