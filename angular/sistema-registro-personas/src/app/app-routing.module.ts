import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './componentes/home/home.component';
import { ListarPersonasComponent } from './componentes/listar-personas/listar-personas.component';
import { RegistrarPersonasComponent } from './componentes/registrar-personas/registrar-personas.component';

const routes: Routes = [
  { path: 'editar/:idPersona', component: RegistrarPersonasComponent},
  { path: 'crear', component: RegistrarPersonasComponent},
  { path: 'listar', component: ListarPersonasComponent},
  { path: 'home', component: HomeComponent},
  { path: '**' , pathMatch: 'full' , redirectTo: 'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
