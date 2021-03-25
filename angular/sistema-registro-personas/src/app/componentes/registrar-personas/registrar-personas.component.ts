import { Component, OnInit } from '@angular/core';
import { TipoDocumento } from 'src/app/model/tipo-documento';
import { TipoDocumentoService } from '../../servicios/tipo-documento/tipo-documento.service';
import { Persona } from '../../model/persona';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-registrar-personas',
  templateUrl: './registrar-personas.component.html',
  styleUrls: ['./registrar-personas.component.css']
})
export class RegistrarPersonasComponent implements OnInit {

  tipoDocumentos: TipoDocumento[];
  persona: Persona = new Persona();
  constructor(private tipDocumentoService: TipoDocumentoService) { }

  ngOnInit(): void {
      this.tipDocumentoService.listarTipoDocumentos().subscribe(
        resp => {
          this.tipoDocumentos = resp;
        }
      );
  }

  registrar(): void{
    Swal.fire({
      title: 'Atención',
      text: '¿Desea guardar la información de la persona?',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Si!'
    }).then((result) => {
      this.establecerComando();

      if (result.isConfirmed) {
        Swal.fire({
          position: 'top-end',
          icon: 'success',
          title: 'La información se ha guardado exitosamente',
          showConfirmButton: false,
          timer: 1500
        })
      }
    });
  }

  establecerComando(): void{
  }

}
