import { Component, OnInit } from '@angular/core';
import { Usuario } from "../models/usuario";
import { ActivatedRoute, Router } from "@angular/router";
import { UserService } from "../services/user.service";

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  usuario: Usuario;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private userService: UserService)
  {
      this.usuario = new Usuario();
  }

  onSubmit() {
    this.userService.save(this.usuario).subscribe(result =>
      this.goToUserList());
  }

  goToUserList() {
    this.router.navigate(['/usuarios']);
  }

  ngOnInit(): void {
  }
}
