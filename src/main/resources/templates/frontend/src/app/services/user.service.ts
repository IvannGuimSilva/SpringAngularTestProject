import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Usuario } from "../models/usuario";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private urlUsuario: string = "";

  constructor(private http: HttpClient) {
    this.urlUsuario = "http://localhost:8080/usuarios";
  }

  public findAll(): Observable<Usuario[]> {
    return this.http.get<Usuario[]>(this.urlUsuario);
  }

  public save(usuario: Usuario) {
    return this.http.post<Usuario>(this.urlUsuario, usuario);
  }
}
