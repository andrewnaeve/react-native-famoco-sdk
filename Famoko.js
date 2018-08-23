import FamokoSdk from './NativeBridges';

class Famoko {
  constructor() {
    this.evt = new NativeEventEmitter(FamokoSdk);
  }

  async sayHello() {
    const saying = await FamokoSdk.sayHello();
    console.log(saying);
  }
}

export default Famoko;
