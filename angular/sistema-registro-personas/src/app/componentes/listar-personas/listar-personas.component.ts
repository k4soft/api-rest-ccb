import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/model/persona';
import Swal from 'sweetalert2';
import { PersonaService } from '../../servicios/persona/persona.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listar-personas',
  templateUrl: './listar-personas.component.html',
  styleUrls: ['./listar-personas.component.css']
})
export class ListarPersonasComponent implements OnInit {

  personas: Persona[];

  constructor(private personaService: PersonaService, public router: Router) { }

  ngOnInit(): void {
      this.personaService.listarPersonas().subscribe(
        resp => {
           this.personas = resp;
           if ( this.personas.length === 0){
              Swal.fire('No existen registros en el sistema');
           }
        }
      );
  }

  eliminar(persona: Persona): void{

    Swal.fire({
      title: '¿Desea eliminar el registro?',
      showDenyButton: true,
      showCancelButton: true,
      confirmButtonText: `Eliminar`,
      denyButtonText: `No eliminar`,
    }).then((result) => {
      if (result.isConfirmed) {
        this.personaService.eliminar(persona.idPersona).subscribe(
          _ =>{
           this.personas = this.personas.filter(p => p !== persona);
          }
       );
      } else if (result.isDenied) {
        Swal.fire('El registro no fue eliminado', '', 'info');
      }
    });

  }


  editarPersona(persona: Persona): void{
     this.router.navigate([`/editar/${persona.idPersona}`]);
  }

}
