import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule, JsonpModule  } from '@angular/http';
import { RouterModule }   from '@angular/router';
import { MaterialModule } from '@angular/material';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FrontpageComponent } from './frontpage/frontpage.component';
import {AccountService} from "./account.service";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    LoginComponent,
    FrontpageComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    JsonpModule,
    HttpModule,
    MaterialModule.forRoot(),
    RouterModule.forRoot([
      { path: '', component: FrontpageComponent },
      { path: 'login', component: LoginComponent }
    ])
  ],
  providers: [AccountService],
  bootstrap: [AppComponent]
})
export class AppModule { }
