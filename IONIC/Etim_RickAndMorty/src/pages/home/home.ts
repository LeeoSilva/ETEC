import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { RickAndMortyServiceProvider } from '../../providers/rick-and-morty-service/rick-and-morty-service.ts'
import { CharactersPage } from '../characters/characters';
import { LocationsPage } from '../locations/locations';
import { EpisodesPage } from '../episodes/episodes';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
    options: Array<Object> = [];

  constructor(public navCtrl: NavController, public rm: RickAndMortyServiceProvider) {}

  getCharacters(){ this.navCtrl.push(CharactersPage) }
  getLocations(){ this.navCtrl.push(LocationsPage); }
  getEpisodes(){ this.navCtrl.push(EpisodesPage); }

}
