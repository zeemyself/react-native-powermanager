
import { NativeModules, Platform } from 'react-native';

const { RNReactNativePowermanager } = NativeModules;

export default {
    startPowerManager: () => {
        if(Platform.OS === 'android') {
            return RNReactNativePowermanager.startPowerManager()
        }
    }
}
