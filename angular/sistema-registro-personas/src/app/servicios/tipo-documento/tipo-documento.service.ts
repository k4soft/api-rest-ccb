import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TipoDocumento } from '../../model/tipo-documento';
import { ServiceUtil } from '../../util/service-util';

const URL_BASE = 'http://localhost:8082/v1/tipo-documento';

@Injectable({
  providedIn: 'root'
})
export class TipoDocumentoService {

  constructor(private http: HttpClient, private serviceUtil: ServiceUtil) { }

  listarTipoDocumentos(): Observable<TipoDocumento[]>{
      return this.http.get<TipoDocumento[]>(URL_BASE, {headers: this.serviceUtil.getSimpleHeader()});
  }

}
