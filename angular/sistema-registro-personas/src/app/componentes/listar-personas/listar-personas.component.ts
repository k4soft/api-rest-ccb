import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/model/persona';
import Swal from 'sweetalert2';
import { PersonaService } from '../../servicios/persona/persona.service';

@Component({
  selector: 'app-listar-personas',
  templateUrl: './listar-personas.component.html',
  styleUrls: ['./listar-personas.component.css']
})
export class ListarPersonasComponent implements OnInit {

  personas: Persona[];

  constructor(private personaService: PersonaService) { }

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

}
