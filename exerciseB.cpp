#include <iostream>
#include <string>

void getNota(std::string aln, std::string gabarito){
  unsigned nota = 0;
  int error = 0;
  for( unsigned i = 0; i <= 9; i++ ){
    if( aln[i] == gabarito[i] ) nota++;
  }

  error = nota - 10;
  if( error < 0 ) error*=-1; // Flooring the variable

  std::cout << nota << " "; // Nota Final
  std::cout << (nota*10) << " "; // Percentual de acertos
  std::cout << (error * 10) << " "; // Percentual de erros
  std::cout << std::endl;
}


int main(void){
  // std::string var;
  // std::getline(std::cin, var);
  // std::cout << var << std::endl;

  std::string gabarito;
  int quantAlunos = 0;
  std::string aln;

  std::cin >> gabarito >> quantAlunos;
  if( gabarito == "0" || quantAlunos == 0 ){ std::cout << "gabarito = 0"; return 0; }
  for( unsigned i = 0; i <= quantAlunos-1; i++ ){
    std::cin >> aln;
    getNota(aln, gabarito);
  }


  return 0;
}
