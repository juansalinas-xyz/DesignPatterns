package com.salinas.juan.pattern.creational.factory;

public class ConexionPostgreSQL implements IConexion {

	@Override
	public void conectar() {
		System.out.println("Se conectů a PostgreSQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectů de PostgreSQL");
	}

}
