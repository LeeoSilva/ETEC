import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { RickAndMortyServiceProvider } from '../../providers/rick-and-morty-service/rick-and-morty-service';
import { DetalhesPage } from '../detalhes/detalhes';
import { Http } from '@angular/http';

// @IonicPage()
@Component({
  selector: 'page-home',
  templateUrl: 'home.html',
})
export class HomePage {
    public obg: any[] = [];
    public itens: any[] = [];
    public page = 0;

    constructor(public navCtrl: NavController, public rm: RickAndMortyServiceProvider, public http: Http) {
        this.loadCharacters(this.page);
    }

    public loadCharacters(infiniteScroll?): Observable<Object>{
        return this.http.get('https://rickandmortyapi.com/api/character/?page=' + this.page).subscribe(res => {
            let info;
            for(let i = 0; i <= 19; i++){
                info = JSON.parse(res._body);
                this.obg = this.obg.concat(info.results[i]);
            }
            if( infiniteScroll ){ infiniteScroll.complete(); }
        });
    }

    public loadMore(infiniteScroll){
        this.page++;
        this.loadCharacters(infiniteScroll);

        // The maximum pages of the API is 25.
        if( this.page === 25 ){ infiniteScroll.enable(false); }
    }


    ionViewDidLoad(){
      this.rm.getCharacters().subscribe((data: [{}]) => {
          // console.log(data)
          let info = JSON.parse(data._body);
          // 19 its the number of characters in the array per page request
          for(let i = 0; i <= 19; i++){
               this.obg[i] = info.results[i];
          }
          this.nextPage = info.info.next;
      });
  }
  getDetalhes(id: number){ this.navCtrl.push(DetalhesPage, {id: id}); }



}
