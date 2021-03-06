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
 * This class represents the primary key of the cliente_has_rol table.
 */
public class ClienteHasRolPk implements Serializable
{
	protected String tipoDocumento;

	protected String numeroDocumento;

	protected String rol;

	/** 
	 * Sets the value of tipoDocumento
	 */
	public void setTipoDocumento(String tipoDocumento)
	{
		this.tipoDocumento = tipoDocumento;
	}

	/** 
	 * Gets the value of tipoDocumento
	 */
	public String getTipoDocumento()
	{
		return tipoDocumento;
	}

	/** 
	 * Sets the value of numeroDocumento
	 */
	public void setNumeroDocumento(String numeroDocumento)
	{
		this.numeroDocumento = numeroDocumento;
	}

	/** 
	 * Gets the value of numeroDocumento
	 */
	public String getNumeroDocumento()
	{
		return numeroDocumento;
	}

	/** 
	 * Sets the value of rol
	 */
	public void setRol(String rol)
	{
		this.rol = rol;
	}

	/** 
	 * Gets the value of rol
	 */
	public String getRol()
	{
		return rol;
	}

	/**
	 * Method 'ClienteHasRolPk'
	 * 
	 */
	public ClienteHasRolPk()
	{
	}

	/**
	 * Method 'ClienteHasRolPk'
	 * 
	 * @param tipoDocumento
	 * @param numeroDocumento
	 * @param rol
	 */
	public ClienteHasRolPk(final String tipoDocumento, final String numeroDocumento, final String rol)
	{
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.rol = rol;
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
		
		if (!(_other instanceof ClienteHasRolPk)) {
			return false;
		}
		
		final ClienteHasRolPk _cast = (ClienteHasRolPk) _other;
		if (tipoDocumento == null ? _cast.tipoDocumento != tipoDocumento : !tipoDocumento.equals( _cast.tipoDocumento )) {
			return false;
		}
		
		if (numeroDocumento == null ? _cast.numeroDocumento != numeroDocumento : !numeroDocumento.equals( _cast.numeroDocumento )) {
			return false;
		}
		
		if (rol == null ? _cast.rol != rol : !rol.equals( _cast.rol )) {
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
		if (tipoDocumento != null) {
			_hashCode = 29 * _hashCode + tipoDocumento.hashCode();
		}
		
		if (numeroDocumento != null) {
			_hashCode = 29 * _hashCode + numeroDocumento.hashCode();
		}
		
		if (rol != null) {
			_hashCode = 29 * _hashCode + rol.hashCode();
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
		ret.append( "co.edu.sena.model.dao.dto.ClienteHasRolPk: " );
		ret.append( "tipoDocumento=" + tipoDocumento );
		ret.append( ", numeroDocumento=" + numeroDocumento );
		ret.append( ", rol=" + rol );
		return ret.toString();
	}

}
