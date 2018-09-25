import { Http } from '@angular/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map' ;

@Injectable()
export class RickAndMortyServiceProvider {

    constructor(public http: Http) {
        // console.log('Hello RickAndMortyServiceProvider Provider');
}

    getCharacters(): Observable<Object>{
        return this.http.get('https://rickandmortyapi.com/api/character/').map(function(response: any){ return response; });
    }

    getCharactersById(id: any): Observable<Object> {
        return this.http.get('https://rickandmortyapi.com/api/character/' + id).map(function(response: any){ return response; });
    }

}
