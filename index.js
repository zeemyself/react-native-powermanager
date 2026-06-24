
import { Platform } from 'react-native';
import RNPowermanager from './src/NativeRNPowermanager';

// Cache constants for isSupported if RNPowermanager exists
const constants = RNPowermanager
  ? (typeof RNPowermanager.getConstants === 'function'
      ? RNPowermanager.getConstants()
      : RNPowermanager)
  : null;

export default PowerManager = {
    startPowerManager: () => {
        if (Platform.OS === 'android' && RNPowermanager) {
            return RNPowermanager.startPowerManager();
        }
    },
    isSupported: () => {
        if (Platform.OS === 'android' && constants) {
            return constants.isSupported;
        }
        return false;
    }
};
