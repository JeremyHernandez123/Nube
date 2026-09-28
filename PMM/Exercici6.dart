import 'dart:math';
main(){

/*
Realitza un programa que generi un nombre aleatori entre 1 i 100,
 i seguidament comprovi si aquest nombre és primer o no. Pots fer servir la llibreria import 'dart:math';


*/ 
generarNombreIComprova();

}
generarNombreIComprova(){
  Random random = Random(); 
  int numeroAleatori = random.nextInt(100); 
  if(numeroAleatori.isEven){
    print("EL nombre es primer: $numeroAleatori");
  } else {
    print("EL nombre no es primer: $numeroAleatori"); 
  }
}