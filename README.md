# react-native-famoko-sdk

## Getting started

`$ npm install react-native-famoko-sdk --save`

### Mostly automatic installation

`$ react-native link react-native-famoko-sdk`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`

- Add `import com.reactlibrary.RNFamokoSdkPackage;` to the imports at the top of the file
- Add `new RNFamokoSdkPackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:
   ```
   include ':react-native-famoko-sdk'
   project(':react-native-famoko-sdk').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-famoko-sdk/android')
   ```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
   ```
     compile project(':react-native-famoko-sdk')
   ```

## Usage

```javascript
import RNFamokoSdk from 'react-native-famoko-sdk';

// TODO: What to do with the module?
RNFamokoSdk;
```
