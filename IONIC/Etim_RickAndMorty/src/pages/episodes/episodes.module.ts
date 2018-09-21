import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { EpisodesPage } from './episodes';

@NgModule({
  declarations: [
    EpisodesPage,
  ],
  imports: [
    IonicPageModule.forChild(EpisodesPage),
  ],
})
export class EpisodesPageModule {}
