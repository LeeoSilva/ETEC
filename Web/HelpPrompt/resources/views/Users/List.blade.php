@section('content')
	@include('HtmlWraps.header')
	<div align='right'>

		<a href="Register/"><h2>Register</h2></a>
		{{--  <a href="Login/"><h2>Login</h2></a>  --}}
	
	</div>
	@if( $info != null )
		@foreach( $info as $infos )

			<ul>
				<a href="{{ URL::action('UsersController@show', $infos->id) }}"><h2>{{$infos->id . '-' . $infos->usr_name }}</h2></a>
				<a href="{{ URL::to('User/delete/' . $infos->id) }}"><button type="submit" class="btn btn-danger btn-mini">Deletar</button></a><br><br>
				<a href="{{ URL::to('User/edit/' . $infos->id) }}"><button type="submit" class='btn btn-primary btn-mini'>Editar</button></a><br><br>
			</ul>

		@endforeach
	@endif
	@if( $info == null )
	<h3>Não há registros de usuários</h3>
	@endif

	@include('HtmlWraps.footer')
@show