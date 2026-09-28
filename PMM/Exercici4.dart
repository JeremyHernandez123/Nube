main(){

/*
Implementa una funció que pren com a entrada tres variables i retorna la més gran de les tres. Feu això sense utilitzar la funció Dart max().

L’objectiu d’aquest exercici és pensar en alguns elements interns que Dart normalment té cura de nosaltres. Tot el que necessiteu són algunes variables i declaracions if!
Altres exemples: https://www.geeksforgeeks.org/dart-finding-minimum-and-maximum-value-in-a-list/
*/ 
print(valorMesGran(10,17,20)); 
}

valorMesGran(a, b, c){
  var maxim = a;

  if (b > maxim) {
    maxim = b;
  }

  if (c > maxim) {
    maxim = c;
  }

  return maxim;
}