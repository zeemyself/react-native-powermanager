import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  startPowerManager(): void;
  getConstants(): {
    isSupported: boolean;
  };
}

export default TurboModuleRegistry.get<Spec>('RNPowermanager');
