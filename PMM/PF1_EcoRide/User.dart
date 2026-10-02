
import 'dart:collection';

class User{
  String _id; 
  String _nomComplet; 
  double _saldo; 
  String correu; 
  bool esVIP default false; 

  User.nou({required String id, required String nom, required String correu, double saldoInicial  = 0.0})
  
  User(String _id, String _nomComplet, double _saldo, String correo, bool esVIP){
    this._id = _id; 
    this._nomComplet = _nomComplet; 
    this._saldo = _saldo; 
    this.correu = correu; 
    this.esVIP = esVIP; 
  }

  double get _saldo => _saldo; 
  String get _id => _id; 

  recarregarSaldo(double quantitat){
    if(quantitat < 0){
      throw Exception("No pot haver una quantitat negativa"); 
    }
  }


}