@section('content')
	@include('HtmlWraps.header')
	<h1>Create new User</h1>

	<hr/>


	<div class="form-group">
	{!! Form::open(['url' => 'User/create', 'method' => 'post', 'autocomplete' => 'off']); !!}

	{!! Form::label('name', 'Usuário: '); !!} 
	{!! Form::text('username'); !!} <br>

	{!! Form::label('pass', 'Senha: '); !!} 
	{!! Form::password('userpass'); !!} <br>

	{{--  TODO: CheckBox para ver a senha em texto   --}}

	{!! Form::label('email', 'Email: '); !!}
	{!! Form::email('usermail'); !!} <br>

	{!! Form::label('cpf', 'CPF: '); !!} 
	{!! Form::text('usercpf'); !!} <br>

	{!! Form::label('birthday', 'Nascimento: ') !!}
	{!! Form::date('userbirth'); !!} <br>

	{!! Form::submit('Submit', ['class' => 'btn btn-primary']); !!} <br><br>
	
	{!! Form::close(); !!}

	</div>
	</div>
	
	{{-- Verificação e apresentação de erros --}}
	@if( $errors->any() )
		<ul class='alert alert-danger'>
			@foreach( $errors->all() as $error )
				<li>{{ $error }} </li>
			@endforeach
		</ul>
	@endif

	@include('HtmlWraps.footer')
	@show
