import {PlanetaInterface} from './planeta-interface';

export interface EstrellaInterface {
  id: number;
  nombre: string;
  densidad: number;
  planeta: PlanetaInterface;
}
