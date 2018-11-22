
import { NativeModules, Platform } from 'react-native';

const { RNPowermanager } = NativeModules;

export default PowerManager = {
    startPowerManager: () => {
        if(Platform.OS === 'android') {
            return RNPowermanager.startPowerManager()
        }
    },
    isSupported: () => {
        if(Platform.OS === 'android') {
            return RNPowermanager.isSupported()
        }
    }
}
