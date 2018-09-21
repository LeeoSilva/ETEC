import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map' ;


@Injectable()
export class RickAndMortyServiceProvider {

  constructor(public http: HttpClient) {
    console.log('Hello RickAndMortyServiceProvider Provider');
  }

  getCharacters(): Observable<Object>{
      return this.http.get('https://rickandmortyapi.com/api/character/').map(function(response: Response){ return response; });
  }

  getCharactersById(id: number): Observable<Object> {
      return this.http.get('https://rickandmortyapi.com/api/character/${id}').map(function(response: Response){ return response; });
  }

  getLocations(): Observable<Object> {
      return this.http.get('https://rickandmortyapi.com/api/location').map(function(response: Response){ return response; });
  }

  getLocationsById(id: number): Observable<Object> {
      return this.http.get('https://rickandmortyapi.com/api/location/${id}').map(function(response: Response){ return response; });
  }

  getEpisodes(): Observable<Object> {
      return this.http.get('https://rickandmortyapi.com/api/episode').map(function(response: Response){ return response; });
  }

  getEpisodesById(id: number): Observable<Object> {
      return this.http.get('https://rickandmortyapi.com/api/episode/${id}').map(function(response: Response){ return response; });
  }
}
