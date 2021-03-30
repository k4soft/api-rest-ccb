import { TipoDocumento } from './tipo-documento';
export class Persona {
    idPersona: number;
    numeroDocumento: string;
    tipoDocumento =  new  TipoDocumento();
    nombre: string;
    apellido: string;
    activo: boolean;
}
