/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import co.edu.sena.model.dao.dao.*;
import co.edu.sena.model.dao.factory.*;
import co.edu.sena.model.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Usuario implements Serializable
{
	/** 
	 * This attribute maps to the column tipo_documento in the usuario table.
	 */
	protected String tipoDocumento;

	/** 
	 * This attribute maps to the column numero_documento in the usuario table.
	 */
	protected String numeroDocumento;

	/** 
	 * This attribute maps to the column correo in the usuario table.
	 */
	protected String correo;

	/** 
	 * This attribute maps to the column contrasenia in the usuario table.
	 */
	protected String contrasenia;

	/**
	 * Method 'Usuario'
	 * 
	 */
	public Usuario()
	{
	}

	/**
	 * Method 'getTipoDocumento'
	 * 
	 * @return String
	 */
	public String getTipoDocumento()
	{
		return tipoDocumento;
	}

	/**
	 * Method 'setTipoDocumento'
	 * 
	 * @param tipoDocumento
	 */
	public void setTipoDocumento(String tipoDocumento)
	{
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * Method 'getNumeroDocumento'
	 * 
	 * @return String
	 */
	public String getNumeroDocumento()
	{
		return numeroDocumento;
	}

	/**
	 * Method 'setNumeroDocumento'
	 * 
	 * @param numeroDocumento
	 */
	public void setNumeroDocumento(String numeroDocumento)
	{
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Method 'getCorreo'
	 * 
	 * @return String
	 */
	public String getCorreo()
	{
		return correo;
	}

	/**
	 * Method 'setCorreo'
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}

	/**
	 * Method 'getContrasenia'
	 * 
	 * @return String
	 */
	public String getContrasenia()
	{
		return contrasenia;
	}

	/**
	 * Method 'setContrasenia'
	 * 
	 * @param contrasenia
	 */
	public void setContrasenia(String contrasenia)
	{
		this.contrasenia = contrasenia;
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
		
		if (!(_other instanceof Usuario)) {
			return false;
		}
		
		final Usuario _cast = (Usuario) _other;
		if (tipoDocumento == null ? _cast.tipoDocumento != tipoDocumento : !tipoDocumento.equals( _cast.tipoDocumento )) {
			return false;
		}
		
		if (numeroDocumento == null ? _cast.numeroDocumento != numeroDocumento : !numeroDocumento.equals( _cast.numeroDocumento )) {
			return false;
		}
		
		if (correo == null ? _cast.correo != correo : !correo.equals( _cast.correo )) {
			return false;
		}
		
		if (contrasenia == null ? _cast.contrasenia != contrasenia : !contrasenia.equals( _cast.contrasenia )) {
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
		
		if (correo != null) {
			_hashCode = 29 * _hashCode + correo.hashCode();
		}
		
		if (contrasenia != null) {
			_hashCode = 29 * _hashCode + contrasenia.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsuarioPk
	 */
	public UsuarioPk createPk()
	{
		return new UsuarioPk(tipoDocumento, numeroDocumento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.Usuario: " );
		ret.append( "tipoDocumento=" + tipoDocumento );
		ret.append( ", numeroDocumento=" + numeroDocumento );
		ret.append( ", correo=" + correo );
		ret.append( ", contrasenia=" + contrasenia );
		return ret.toString();
	}

}
