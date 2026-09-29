/*
Realitza una funció que retorni un llistat de “n” nombres primers on “n” ens ve donat per paràmetre.

print(llista_n_primers(10));

Sortida: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]


Pots emprar el programa que heu fet a l’apartat 6 per a calcular si un nombre és primer.

*/ 
import 'dart:math';
main(){
print(llista_n_primers(1000000)); 

}


bool esPrimer(int x){
  if(x < 2) return false; 
  for(int i = 2; i <= sqrt(x); i++){
    if(x % i == 0) return false; 
  }
  return true; 
}

List<int> llista_n_primers(int n){
  List<int> res = []; 
  int curNum = 2; 

  while(res.length < n){
    if(esPrimer(curNum)){
        res.add(curNum); 
    }
    curNum++; 
  }

  return res; 
}