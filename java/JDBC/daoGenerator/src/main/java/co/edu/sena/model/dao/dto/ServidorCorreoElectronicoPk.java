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
 * This class represents the primary key of the servidor_correo_electronico table.
 */
public class ServidorCorreoElectronicoPk implements Serializable
{
	protected String correo;

	/** 
	 * Sets the value of correo
	 */
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}

	/** 
	 * Gets the value of correo
	 */
	public String getCorreo()
	{
		return correo;
	}

	/**
	 * Method 'ServidorCorreoElectronicoPk'
	 * 
	 */
	public ServidorCorreoElectronicoPk()
	{
	}

	/**
	 * Method 'ServidorCorreoElectronicoPk'
	 * 
	 * @param correo
	 */
	public ServidorCorreoElectronicoPk(final String correo)
	{
		this.correo = correo;
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
		
		if (!(_other instanceof ServidorCorreoElectronicoPk)) {
			return false;
		}
		
		final ServidorCorreoElectronicoPk _cast = (ServidorCorreoElectronicoPk) _other;
		if (correo == null ? _cast.correo != correo : !correo.equals( _cast.correo )) {
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
		if (correo != null) {
			_hashCode = 29 * _hashCode + correo.hashCode();
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
		ret.append( "co.edu.sena.model.dao.dto.ServidorCorreoElectronicoPk: " );
		ret.append( "correo=" + correo );
		return ret.toString();
	}

}
