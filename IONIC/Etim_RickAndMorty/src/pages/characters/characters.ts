import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { RMService } from '../../providers/rick-and-morty-service/rick-and-morty-service.ts';
import { DetalhesPage } from '../detalhes/detalhes';

@IonicPage()
@Component({
  selector: 'page-characters',
  templateUrl: 'characters.html',
})
export class CharactersPage {
    characters: Array<Object> = [];
    constructor(public navCtrl: NavController, public navParams: NavParams, public rm: RMService) { }

    ionViewDidLoad() {
        this.rm.getCharacters().subscribe((data: [{}])=> {
            this.characters = data.results;
        });
    }

    getDetalhes(id: number){ this.navCtrl.push(DetalhesPage, {id: id}); }
}
