import {EstrellaInterface} from './estrella-interface';

export interface PlanetaInterface {
  id: number;
  nombre: string;
  superficie: number;
  estrella: EstrellaInterface;
}
