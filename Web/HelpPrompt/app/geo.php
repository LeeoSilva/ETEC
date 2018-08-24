<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class geo extends Model{
	public $table = 'geo';
	public $timestamps = false;
	public $fillable = array(
		'lat',
		'lon',
		'city',
		'state',
		'country'
	);
}
