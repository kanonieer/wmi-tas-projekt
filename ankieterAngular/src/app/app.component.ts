import {Component, OnInit} from '@angular/core';
import {AccountService} from "./account.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit{
  title = 'app works!';
  constructor(private _accountService: AccountService){

  }
  ngOnInit(){
    this._accountService.getAllAccounts()
      .subscribe(res => console.log(res));
  }
}
