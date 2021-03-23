import { Component, OnInit } from '@angular/core';
import { Cliente } from '../model/cliente';

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.css']
})
export class ContentComponent  {

     listaLenguajes: string[] = ['TypeScript', 'JavaScript', 'Java SE', 'C#', 'PHP'];
     habilitar  = true;

     clientes: Cliente[] = [
       {id: 1, nombre: 'Diego', apellido: 'Garcia'},
       {id: 2, nombre: 'Carolina', apellido: 'Gómez'},
       {id: 3, nombre: 'Carlos', apellido: 'Cifuentes'}
     ];

     enable(): void{
       this.habilitar = this.habilitar === true ? false: true;
     }

}
