main(){

/*
Agafeu dues llistes, per exemple
a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
i escriviu un programa que retorni una llista que contingui
només els elements comuns entre ells (sense duplicats). Assegureu-vos que el programa funcioni en dues llistes de mides diferents.

*/ 
var a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89];
var b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]; 
retornaElementsComuns(a,b); 
}

retornaElementsComuns(a, b){
  var comunes = a.toSet().intersection(b.toSet()); 
  print(comunes); 
}