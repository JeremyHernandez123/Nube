import 'package:flutter/material.dart';
import 'dart:io';

void main() {

  // 1 
  print("Escriu el teu nom");
  String? nombre = stdin.readLineSync();
  print("Hola, $nombre");

}
