
main(){

/*
Agafeu una llista, per exemple aquesta:

a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]

i escriviu un programa que imprimeixi tots els elements de la llista que siguin inferiors a 5.


*/ 

var a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]; 

elementsInferiorA5(a); 
}


elementsInferiorA5(a){
    a.forEach((a) {
      if(a < 5){
      print(a); 
      }
    }); 
}