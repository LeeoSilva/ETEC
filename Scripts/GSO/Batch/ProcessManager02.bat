cls
echo off
echo -----------------------------------
echo responda o formulário e tecle enter
echo -----------------------------------
set /p nome=Nome--^>
set /p snome=Sobrenome--^>
set /p idade=Idade--^>
pause
(
  echo Nome: %nome% %snome%
  echo Idade : %idade%
)>formulario.txt
