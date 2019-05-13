#include <iostream>

float quantidadeTijolo(unsigned compriTij, unsigned alturaTij){
  float eh  = 0.01;
  float ev  = 0.01;
  float res = 1/(compriTij + eh) * (alturaTij + ev);
  std::cout << "quantidade tijolo " << res << std::endl;
  return res;
}

float tijoloPerArea(unsigned tij, unsigned per){
  int result =  tij / (per * 2.8);
  // std::cout << "Tijolo por area " <<  result << std::endl;
  return result;
}


float discount(unsigned valorMil){
  if( valorMil > 1000 ){
    valorMil -= (valorMil * 0.1);
    // std::cout << "Disconto " << valorMil << std::endl;
  }
  return valorMil;
}

int main(void){

  unsigned alturaTij  = 0;
  unsigned larguraTij = 0;
  unsigned compriTij  = 0;
  unsigned perimetComod = 0;
  unsigned valorMil = 0;

  int quantTij = 0;
  int tijPerArea = 0;

  while( true ){
    std::cin >> alturaTij >> larguraTij >> compriTij >> perimetComod >> valorMil;
    if( alturaTij == 0 ) return 0;

    quantTij   = quantidadeTijolo(compriTij, alturaTij);
    tijPerArea = tijoloPerArea(quantTij, perimetComod);
    valorMil   = discount(valorMil);

    std::cout << (int)quantTij << " ";
    std::cout << (int)tijPerArea << " ";
    std::cout << (int)valorMil << std::endl;
  }
  return 0;
}
