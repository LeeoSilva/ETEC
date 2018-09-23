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
        // console.log("getCharacters function request!");
        return this.http.get('https://rickandmortyapi.com/api/character/').map(function(response: Response){ return response; });
    }

    getCharactersById(id: number): Observable<Object> {
        // console.log("getCharactersById function request!");
        // return this.http.get('https://rickandmortyapi.com/api/character/${id}').map(function(response: Response){ return response; });
        return this.http.get('https://rickandmortyapi.com/api/character/${id}').map(function(response: Response){ return response; });
    }

    getLocations(): Observable<Object> {
        console.log("getLocations function request!");
        return this.http.get('https://rickandmortyapi.com/api/location').map(function(response: Response){ return response; });
    }

    getLocationsById(id: number): Observable<Object> {
        // console.log("getLocationsById function request!");
        return this.http.get('https://rickandmortyapi.com/api/location/${id}').map(function(response: Response){ return response; });
    }

    getEpisodes(): Observable<Object> {
        // console.log("getEpisodes function request!");
        return this.http.get('https://rickandmortyapi.com/api/episode').map(function(response: Response){ return response; });
    }

    getEpisodesById(id: number): Observable<Object> {
        // console.log("getEpisodesById function request!");
        return this.http.get('https://rickandmortyapi.com/api/episode/${id}').map(function(response: Response){ return response; });
    }
}
