import 'dart:ffi';

class User{
  String _id; 
  String _nomComplet; 
  double _saldo = 0.0; 
  String correo; 
  bool esVIP default false; 

  User(String _id, String _nomComplet, double _saldo, String correo, bool esVIP){
    this._id = _id; 
    this._nomComplet = _nomComplet; 
    this._saldo = _saldo; 
    this.correo = correo; 
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