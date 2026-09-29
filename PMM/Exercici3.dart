main(){

/*
Donada una cadena de texte, imprimiu si aquesta cadena és un palíndrom o no.
*/ 

print(esPalidrom('Raul feo')); 
}


bool esPalidrom(String texte){
  String texteNet = texte.toLowerCase().replaceAll(RegExp(r'[^a-z0-9]'), ''); 

  String texteInvertit = texteNet.split('').reversed.join(''); 
  return texteNet == texteInvertit; 
}