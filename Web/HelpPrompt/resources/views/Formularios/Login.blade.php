@section('content')

	@include('HtmlWraps.header')
	<h1>Login</h1>

	<hr/>

	{!! Form::open(['url' => 'Login', 'method' => 'POST', 'autocomplete' => 'off']); !!}<br>
	
	{!! Form::label('usermail', 'Usuário ou Email: '); !!}
	{!! Form::text('namemail'); !!}<br>

	{!! Form::label('pass', 'Senha: '); !!}
	{!! Form::password('password'); !!}<br>
	
	{{--  TODO: Remember Me Token  --}}

	{!! Form::submit('Submit'); !!}<br>

	{!! Form::close(); !!}