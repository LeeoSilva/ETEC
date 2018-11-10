#include <iostream>
#include <string>

int check(std::string entrada){
  unsigned points = 0;

  for( unsigned i = 1; i <= (int)entrada.length()+1; i++ ){
      if( entrada[i-1] == entrada[i] ) points += 10;
  }
    return points;
}


int main(void){
  std::string entrada;
  while(true){
    std::cin >> entrada;
    if( entrada == "0" ) return 0;
    std::cout << check(entrada) << std::endl;
  }
  return 0;
}
