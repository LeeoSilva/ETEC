import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { RickAndMortyServiceProvider } from '../../providers/rick-and-morty-service/rick-and-morty-service';
import { DetalhesPage } from '../detalhes/detalhes';

// @IonicPage()
@Component({
  selector: 'page-home',
  templateUrl: 'home.html',
})
export class HomePage {
    public obg: any[] = [];

    constructor(public navCtrl: NavController, public rm: RickAndMortyServiceProvider) {}

    ionViewDidLoad(){
      this.rm.getCharacters().subscribe((data: [{}]) => {
          // console.log(data)
          let info = JSON.parse(data._body);
          // 19 its the number of characters in the array per page request
          for(let i = 0; i <= 19; i++){
               this.obg[i] = info.results[i];
          }
      });
  }
  getDetalhes(id: number){
      this.navCtrl.push(DetalhesPage, {id: id});
  }
}
