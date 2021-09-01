package com.salinas.juan.pattern.creational.factory;

public class ConexionOracle implements IConexion{

	@Override
	public void conectar() {
		System.out.println("Se conectů a Oracle");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectů de Oracle");
	}

}
