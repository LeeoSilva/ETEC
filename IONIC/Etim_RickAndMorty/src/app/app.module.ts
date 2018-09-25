// Modules
import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';

// Pages
import { DetalhesPage } from '../pages/detalhes/detalhes';

// Provider
import { RickAndMortyServiceProvider } from '../providers/rick-and-morty-service/rick-and-morty-service';
import { GoogleTranslateServiceProvider } from '../providers/google-translate-service/google-translate-service';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    DetalhesPage,
  ],
  imports: [
    BrowserModule,
    HttpModule,
    HttpClientModule,
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    DetalhesPage,
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    RickAndMortyServiceProvider,
    GoogleTranslateServiceProvider
  ]
})
export class AppModule {}
