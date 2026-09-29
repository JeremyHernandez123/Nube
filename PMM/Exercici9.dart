main(){

/*
Escriu un programa que donada una longitud (expressada numericament int), 
generi una contrasenya segura de la longitud esmentada totalment aleatòria amb caràcters alfanumèrics.

*/ 
int nombre = 2; 
print("AQui tens una graella de $nombre per 2"); 

for(int i = 0;  i < nombre; i++){
  print(' ---'*nombre); 
  print('|   '*(nombre + 1));
}
print(' ---'* nombre); 
}

