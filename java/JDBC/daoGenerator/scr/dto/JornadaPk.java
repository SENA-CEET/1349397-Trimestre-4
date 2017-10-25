/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the jornada table.
 */
public class JornadaPk implements Serializable
{
	protected String nombre;

	/** 
	 * Sets the value of nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/** 
	 * Gets the value of nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'JornadaPk'
	 * 
	 */
	public JornadaPk()
	{
	}

	/**
	 * Method 'JornadaPk'
	 * 
	 * @param nombre
	 */
	public JornadaPk(final String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof JornadaPk)) {
			return false;
		}
		
		final JornadaPk _cast = (JornadaPk) _other;
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.JornadaPk: " );
		ret.append( "nombre=" + nombre );
		return ret.toString();
	}

}
