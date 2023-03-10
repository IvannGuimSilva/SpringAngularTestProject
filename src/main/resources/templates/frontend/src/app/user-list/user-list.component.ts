import { Component, OnInit } from '@angular/core';
import { Usuario } from "../models/usuario";
import { UserService } from "../services/user.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  usuarios: Usuario[] = [];

  constructor(private servicoUsuario: UserService) { }

  ngOnInit(): void {
    this.servicoUsuario.findAll().subscribe(data => {
      this.usuarios = data;
    });
  }

}
