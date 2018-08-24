@section('content')
	@include('HtmlWraps.header')
	<h1>Update user number {{ $info->id }}</h1>

	<hr>

	<div class='form-group'>
	{!! Form::open(['url' => 'User/edition/' . $info->id,
							 'method' => 'post',
							 'autocomplete' => 'off']); !!}

	{!! Form::label('ip', 'Ipv4 Address: '); !!}
	{!! Form::text('userip', $info->usr_ip); !!}<br>

	{!! Form::label('name', 'Username: '); !!}
	{!! Form::text('username', $info->usr_name); !!}<br>
	
	{!! Form::label('pass', 'Password: '); !!}
	{!! Form::password('userpass'); !!}<br>

	{{--  TODO - Check me to show password without encryption  --}}

	{{--  {!! Form::checkbox('') !!}  --}}


	{!! Form::label('mail', 'Email: '); !!}
	{!! Form::text('usermail', $info->usr_mail); !!}<br>

	{!! Form::label('cpf', 'CPF: '); !!}
	{!! Form::text('usercpf', $info->usr_cpf); !!}<br>

	{!! Form::label('userbirth', 'Nascimento: '); !!}
	{!! Form::date('userbirth', $info->usr_birth); !!}<br><br>

	{!! Form::label('usrlevel', 'Nível de usuário: '); !!}<br>

	{!! Form::label('Dedo Duro'); !!}
	{!! Form::radio('userlevel', '0'); !!}<br>

	{!! Form::label('SysAdmin'); !!}
	{!! Form::radio('userlevel', '1'); !!}<br>

	{!! Form::label('Oficina'); !!}
	{!! Form::radio('userlevel', '2'); !!}<br>

	{!! Form::label('Seguradora'); !!}
	{!! Form::radio('userlevel', '3'); !!}<br>

	{!! Form::label('Segurado'); !!}
	{!! Form::radio('userlevel', '4', true); !!}<br><br>


	{!! Form::submit('Enviar', ['class' => 'btn btn-success']); !!}
	{!! Form::close() !!}
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