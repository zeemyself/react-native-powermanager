
# react-native-powermanager

## Getting started

`$ npm install react-native-powermanager --save`

### Mostly automatic installation

`$ react-native link react-native-powermanager`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.zeemyself.powermanager.RNPowermanagerPackage;` to the imports at the top of the file
  - Add `new RNPowermanagerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-powermanager'
  	project(':react-native-powermanager').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-powermanager/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-powermanager')
  	```


## Usage
```javascript
import RNPowermanager from 'react-native-powermanager';

// TODO: What to do with the module?
RNReactNativePowermanager;
```
  