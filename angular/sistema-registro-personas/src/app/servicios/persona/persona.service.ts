import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders,  } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Persona } from '../../model/persona';
import { ComandoPersona } from '../../comando/comando-persona';
import { ServiceUtil } from '../../util/service-util';

const URL_BASE = 'http://localhost:8082/v1/persona';



@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  constructor(private http: HttpClient, private serviceUtil: ServiceUtil) { }

  listarPersonas(): Observable<Persona[]>{
     return this.http.get<Persona[]>(URL_BASE, {headers: this.serviceUtil.getSimpleHeader()});
  }

  consultarPorId(idPersona: number): Observable<Persona>{
    return  this.http.get<Persona>(`${URL_BASE}/${idPersona}`, {headers: this.serviceUtil.getSimpleHeader()});
  }

  actualizar(comandoPersona: ComandoPersona): Observable<Persona>{
     return this.http.put<Persona>(`${URL_BASE}/${comandoPersona.idPersona}`, comandoPersona, {headers: this.serviceUtil.getJsonHeader()});
  }


  insertar(comandoPersona: ComandoPersona): Observable<Persona>{
     return this.http.post<Persona>(URL_BASE, comandoPersona, {headers: this.serviceUtil.getJsonHeader()});
  }

  eliminar(idPersona: number): Observable<Persona>{
    return this.http.delete<Persona>(`${URL_BASE}/${idPersona}`, {headers: this.serviceUtil.getSimpleHeader()});
  }







}
