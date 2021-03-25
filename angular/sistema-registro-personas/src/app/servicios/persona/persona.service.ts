import { Injectable } from '@angular/core';
import { HttpClient,  } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Persona } from '../../model/persona';

const URL_BASE = 'http://localhost:8082/v1/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  constructor(private http: HttpClient) { }

  listarPersonas(): Observable<Persona[]>{
     return this.http.get<Persona[]>(URL_BASE);
  }


}
