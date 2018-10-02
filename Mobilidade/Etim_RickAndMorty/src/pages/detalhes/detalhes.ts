import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { RickAndMortyServiceProvider } from '../../providers/rick-and-morty-service/rick-and-morty-service';

@IonicPage()
@Component({
  selector: 'page-detalhes',
  templateUrl: 'detalhes.html',
})
export class DetalhesPage {
    public id: string;
    public obg: any;
    public name: string;
    public status: string;
    public type: string;
    public gender: string;
    public image: string;
    public origin: string;

  constructor(public navCtrl: NavController, public navParams: NavParams, public rm: RickAndMortyServiceProvider) {
      this.id = navParams.get("id");
      console.log("Character ID: " +this.id);
      this.rm.getCharactersById(this.id).subscribe((data: [{}]) => {
          this.obg    = JSON.parse(data._body);;
          this.name   = this.obg.name;
          this.status = this.obg.status;
          this.type   = this.obg.species;
          this.gender = this.obg.gender;
          this.image  = this.obg.image;
          this.origin = this.obg.location.name;
      })
  }

  // ionViewDidLoad() { console.log("ionViewDidLoad DetalhesPage"); }

}
