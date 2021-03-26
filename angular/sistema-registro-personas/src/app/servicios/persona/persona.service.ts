import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders,  } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Persona } from '../../model/persona';
import { ComandoPersona } from '../../comando/comando-persona';

const URL_BASE = 'http://localhost:8082/v1/persona';
const HEADER_JSON = new HttpHeaders({'Content-type': 'application/json'});


@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  constructor(private http: HttpClient) { }

  listarPersonas(): Observable<Persona[]>{
     return this.http.get<Persona[]>(URL_BASE);
  }


  insertar(comandoPersona: ComandoPersona): Observable<Persona>{
     return this.http.post<Persona>(URL_BASE, comandoPersona, {headers: HEADER_JSON});
  }

  eliminar(idPersona: number): Observable<Persona>{
    return this.http.delete<Persona>(`${URL_BASE}/${idPersona}`);
  }




}
