import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TipoDocumento } from '../../model/tipo-documento';

const URL_BASE = 'http://localhost:8082/v1/tipo-documento';

@Injectable({
  providedIn: 'root'
})
export class TipoDocumentoService {

  constructor(private http: HttpClient) { }

  listarTipoDocumentos(): Observable<TipoDocumento[]>{
      return this.http.get<TipoDocumento[]>(URL_BASE);
  }

}
