import { Http, Headers } from '@angular/http';
import { Injectable } from '@angular/core';

/*
  Generated class for the GoogleTranslateServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class GoogleTranslateServiceProvider {

  constructor(public http: Http) {}

  // getTranslation(public: Array<any>){
      // this.http.post('https://translation.googleapis.com/language/translate/v2')
  // }

}
