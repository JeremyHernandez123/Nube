
main(){

/*
Escriviu un programa (mitjançant funcions!) Que donada una cadena llarga que contingui diverses paraules (en format string), torni a imprimir a l'usuari la mateixa cadena, però amb les paraules en ordre invers. Per exemple:

	El meu nom és Jaume

	Jaume és nom meu El



*/ 
paraulesInverses("En raul no sap programar en dart");

}


paraulesInverses(String a ){
  String texteInvertit = a.split(' ').reversed.join(' '); 
  print(texteInvertit); 
}