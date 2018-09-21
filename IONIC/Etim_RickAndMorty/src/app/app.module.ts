import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { CharactersPage } from '../pages/characters/characters';
import { LocationsPage } from '../pages/locations/locations';
import { EpisodesPage } from '../pages/episodes/episodes';
import { RickAndMortyServiceProvider } from '../providers/rick-and-morty-service/rick-and-morty-service';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    DetalhesPage,
    CharactersPage,
    LocationsPage,
    EpisodesPage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    RickAndMortyServiceProvider
  ]
})
export class AppModule {}
