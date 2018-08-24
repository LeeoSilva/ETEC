<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/


// Páginas
Route::get  ('/', 'Requests@index');
Route::get  ('Login', 'Requests@Login');

// GeoLocalização
Route::post ('Geo/update', 'GeoLocation@update');

// Administração de usuários
Route::get  ('Users', 'UsersController@index');
Route::post ('User/create', 'UsersController@store');
Route::get  ('Register', 'UsersController@create');


Route::get  ('User/{id}', 'UsersController@show');
Route::get  ('User/delete/{id}', 'UsersController@destroy');
Route::post ('User/edition/{id}', 'UsersController@edition');
Route::get  ('User/edit/{id}', 'UsersController@edit');

// Teste
// Route::resource('User', 'UsersController');

