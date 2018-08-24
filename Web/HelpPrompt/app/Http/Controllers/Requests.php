<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class Requests extends Controller{

    public function index(){
		/*
		|--------
		| Index
		|--------
		|
		| Route para visualzação da página inicial;
		|
		*/
		return view('#');
    }

    public function login(){
		/*
		|-------
		| Login
		|-------
		|
		| Route para visualização da página de login;
		|
		*/
        return view('Formularios.Login');
	}
}
