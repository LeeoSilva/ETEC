<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class users extends Model
{
    protected $table = 'users';
    protected $fillable = [
        'usr_pass',
        'usr_mail',
    ];

}
