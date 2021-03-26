import { Component, OnInit } from '@angular/core';
import { TipoDocumento } from 'src/app/model/tipo-documento';
import { TipoDocumentoService } from '../../servicios/tipo-documento/tipo-documento.service';
import { Persona } from '../../model/persona';
import Swal from 'sweetalert2';
import { ComandoPersona } from '../../comando/comando-persona';
import { PersonaService } from '../../servicios/persona/persona.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-registrar-personas',
  templateUrl: './registrar-personas.component.html',
  styleUrls: ['./registrar-personas.component.css']
})
export class RegistrarPersonasComponent implements OnInit {

  tipoDocumentos: TipoDocumento[];
  persona: Persona = new Persona();
  comandoPersona: ComandoPersona;
  idPersona: number;
  constructor(private tipDocumentoService: TipoDocumentoService,
              private personaService: PersonaService,
              private router: Router, private route: ActivatedRoute) {
              this.idPersona = +this.route.snapshot.paramMap.get('idPersona');
              alert(this.idPersona);
            }

  ngOnInit(): void {

      this.tipDocumentoService.listarTipoDocumentos().subscribe(
        resp => {
          this.tipoDocumentos = resp;
        }
      );
  }

  registrar(): void{
    Swal.fire({
      title: '¿Desea guardar la información de la persona?',
      showDenyButton: true,
      showCancelButton: true,
      confirmButtonText: `Guardar`,
      denyButtonText: `No guardar`,
    }).then((result) => {
      if (result.isConfirmed) {
        this.establecerComando();
        this.insertar();
      } else if (result.isDenied) {
        Swal.fire('Los cambios no fueron guardados', '', 'info');
      }
    });
  }

  establecerComando(): void{

    this.comandoPersona = new ComandoPersona();
    this.comandoPersona.idPersona = this.persona.idPersona;
    this.comandoPersona.idTipoDocumento = this.persona.tipoDocumento.idTipoDocumento;
    this.comandoPersona.numeroDocumento = this.persona.numeroDocumento;
    this.comandoPersona.nombre = this.persona.nombre;
    this.comandoPersona.apellido = this.persona.apellido;
    this.comandoPersona.activo = this.persona.activo;
  }

  insertar(): void{
     this.personaService.insertar(this.comandoPersona).subscribe(
        _ =>{

          Swal.fire('La infromación se guardó correctamente!', '', 'success');
          this.router.navigate(['/listar']);
        }
     );

  }

}
