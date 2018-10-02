// Criar um aplicativo em que o usuário possa selecionar
// um Estado e exiba a qual região pertence, 
// qual o nome da Capital e o número de habitantes da Capital.


import { Component } from '@angular/core';
import { NavController, AlertController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

	private estados: Array<Object> = [];

	constructor(public navCtrl: NavController) {

		this.estados = [
			{
				"Estado": 
				"Região": 
				"Capital": 
				"Habitantes": 
			},

		];
  	}	

}
