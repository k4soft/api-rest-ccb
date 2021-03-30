import { Injectable } from '@angular/core';
import { Usuario } from '../../model/usuario';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';


const utlEnPoint = 'http://localhost:8082/oauth/token';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

 private usuario: Usuario;
 private token: string;
 
  constructor(private http: HttpClient) { }

  login(usuario: Usuario): Observable<any>{
     const credenciales = btoa('cliente-app' + ':' + 'abcde*');
     const httpHeaders = new HttpHeaders(
            {
              'Content-Type': 'application/x-www-form-urlencoded',
              'Authorization': 'Basic ' + credenciales
            }
     );
     const params = new URLSearchParams();
     params.set('grant_type','password');
     params.set('username',usuario.username);
     params.set('password',usuario.password);
     return this.http.post<any>(utlEnPoint, params.toString(),{ headers: httpHeaders});
  }

  guardarUsuario(accessToken: string): void{
    const payload = this.getPayload(accessToken);
    this.usuario = new Usuario();
    this.usuario.username = payload.user_name;
    this.usuario.roles = payload.authorities;
    sessionStorage.setItem('usuario', JSON.stringify(this.usuario));
  }

  guardarToken(accessToken: string): void{
    this.token = accessToken;
    sessionStorage.setItem('token', accessToken);
  }

  getPayload(accessToken: string): any{
     if(accessToken !== undefined){
        return JSON.parse(atob(accessToken.split('.')[1]));
     }
     return null;
  }

  logout(): void{
    this.token = null;
    this.usuario = null;
    sessionStorage.clear();
    sessionStorage.removeItem('token');
    sessionStorage.removeItem('usuario');
  }


  isAuthenticated(): boolean {
    return sessionStorage.getItem('usuario') !== null;
  }

}
