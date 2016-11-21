/**
 * Created by Pawel on 11/20/2016.
 */
import {Http, Headers, RequestOptions} from  "@angular/http";
import {Injectable} from "@angular/core";

@Injectable()
export class AccountService {
  _url: string = "http://localhost:7890/account";

  headers = new Headers({
    'access-control-allow-origin': '*',
    "access-control-request-method":"GET, POST, PUT, DELETE",
    'access-control-allow-headers': 'Content-Type, X-Requested-With'
  });

  options = new RequestOptions({
    headers: this.headers
  })

  constructor(private _http: Http) {}

  //return all accounts
  getAllAccounts() {
    return this._http.get(this._url+"/getall",this.options)
      .map(res => res.json());
  }

  //return account by ID
  getAccountById(id){
    return this._http.get(this._url+"/"+id,this.options)
      .map(res => res.json());
  }

  //create new account
  createAccount(account){
    return this._http
      .post(this._url+"/create",JSON.stringify(account),this.options)
      .map(res => res.json());
  }

  //delete account by ID
  deleteAccountById(id){
    return this._http.delete(this._url+"/delete/"+id,this.options)
      .map(res => res.json());
  }

  //update account by ID
  updateAccountById(id,account){
    return this._http.put(this._url+"/update/"+id,JSON.stringify(account),this.options)
      .map(res => res.json());
  }

}
