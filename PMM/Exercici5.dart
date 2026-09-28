main(){

/*
Suposem que se us proporciona una llista desada en una variable:

a = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

Escriviu el codi que agafi aquesta llista i en faci una nova que inclogui només els elements parells d’aquesta llista.

*/ 

var a = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]; 
elementsParells(a); 
}

elementsParells(a){
  for(var i = 0; i < a.length; i++){
    if(a[i].isEven){print(a[i]);}
  }
}