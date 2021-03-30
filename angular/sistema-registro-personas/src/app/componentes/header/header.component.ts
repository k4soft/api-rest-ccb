import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { LoginService } from '../../servicios/login/login.service';
import { Router } from '@angular/router';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private loginService: LoginService, private router: Router) { }

  ngOnInit(): void {
  }

  logout(): void{
     this.loginService.logout();
     Swal.fire('Has cerrado la sesión exitosamente');
     this.router.navigate(['/login']);
  }

  isAthenticated(): boolean {
     return this.loginService.isAuthenticated();
  }

}
