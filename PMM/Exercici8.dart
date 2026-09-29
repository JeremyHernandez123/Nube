import 'dart:math';

main(){

/*
Escriu un programa que donada una longitud (expressada numericament int), 
generi una contrasenya segura de la longitud esmentada totalment aleatòria amb caràcters alfanumèrics.

*/ 
print(generarContrasenya(7));

}


String generarContrasenya(int longitud) {
  const letras = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';
  final nuneroRandom = Random.secure();
  var contrasenya = '';
  for (var i = 0; i < longitud; i++) {
    contrasenya += letras[nuneroRandom.nextInt(letras.length)];
  }
  return contrasenya;
}

