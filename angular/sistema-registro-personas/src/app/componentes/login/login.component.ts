import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { Usuario } from '../../model/usuario';
import { LoginService } from '../../servicios/login/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuario = new Usuario();

  constructor(private loginService: LoginService, private router: Router) { }

  ngOnInit(): void {
  }

  login(): void{
      if(this.usuario.username === undefined || this.usuario.password === undefined){
        Swal.fire({
          icon: 'error',
          title: 'Oops...',
          text: 'Debe ingresar las credenciales correctamente',
          footer: ''
        });
      } else {
           this.loginService.login(this.usuario).subscribe(
              response => {
              
                this.loginService.guardarUsuario(response.access_token);
                this.loginService.guardarToken(response.access_token);
                Swal.fire({
                  position: 'top-end',
                  icon: 'success',
                  title: 'Bienvenid@ ' + this.usuario.username,
                  showConfirmButton: false,
                  timer: 1500
                });
                this.router.navigate(['/home']);
              }, _ => {
                Swal.fire({
                  icon: 'error',
                  title: 'Oops...',
                  text: 'Las credenciales no son válidas',
                  footer: ''
                });
              }
           );
      }
  }

}
