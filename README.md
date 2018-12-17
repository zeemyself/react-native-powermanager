
# react-native-powermanager

## Getting started

`$ npm install @zeemyself/react-native-powermanager --save`
`$ yarn add @zeemyself/react-native-powermanager`

### Mostly automatic installation

`$ react-native link @zeemyself/react-native-powermanager`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.zeemyself.powermanager.RNPowermanagerPackage;` to the imports at the top of the file
  - Add `new RNPowermanagerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':@zeemyself_react-native-powermanager'
  	project(':@zeemyself_react-native-powermanager').projectDir = new File(rootProject.projectDir, 	'../node_modules/@zeemyself/react-native-powermanager/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':@zeemyself_react-native-powermanager')
  	```


## Usage
```javascript
import RNPowermanager from '@zeemyself/react-native-powermanager';

// TODO: What to do with the module?
RNReactNativePowermanager;
```
