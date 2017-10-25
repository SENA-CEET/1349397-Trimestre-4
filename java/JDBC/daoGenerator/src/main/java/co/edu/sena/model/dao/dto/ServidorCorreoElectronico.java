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

public class ServidorCorreoElectronico implements Serializable
{
	/** 
	 * This attribute maps to the column correo in the servidor_correo_electronico table.
	 */
	protected String correo;

	/** 
	 * This attribute maps to the column contrasenia in the servidor_correo_electronico table.
	 */
	protected String contrasenia;

	/** 
	 * This attribute maps to the column smtp_host in the servidor_correo_electronico table.
	 */
	protected String smtpHost;

	/** 
	 * This attribute maps to the column smtp_port in the servidor_correo_electronico table.
	 */
	protected int smtpPort;

	/** 
	 * This attribute maps to the column smtp_start_tls_enable in the servidor_correo_electronico table.
	 */
	protected short smtpStartTlsEnable;

	/** 
	 * This attribute maps to the column smtp_auth in the servidor_correo_electronico table.
	 */
	protected short smtpAuth;

	/** 
	 * This attribute maps to the column asunto_recuperacion in the servidor_correo_electronico table.
	 */
	protected String asuntoRecuperacion;

	/** 
	 * This attribute maps to the column mensage_recuperacion in the servidor_correo_electronico table.
	 */
	protected String mensageRecuperacion;

	/**
	 * Method 'ServidorCorreoElectronico'
	 * 
	 */
	public ServidorCorreoElectronico()
	{
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
	 * Method 'getSmtpHost'
	 * 
	 * @return String
	 */
	public String getSmtpHost()
	{
		return smtpHost;
	}

	/**
	 * Method 'setSmtpHost'
	 * 
	 * @param smtpHost
	 */
	public void setSmtpHost(String smtpHost)
	{
		this.smtpHost = smtpHost;
	}

	/**
	 * Method 'getSmtpPort'
	 * 
	 * @return int
	 */
	public int getSmtpPort()
	{
		return smtpPort;
	}

	/**
	 * Method 'setSmtpPort'
	 * 
	 * @param smtpPort
	 */
	public void setSmtpPort(int smtpPort)
	{
		this.smtpPort = smtpPort;
	}

	/**
	 * Method 'getSmtpStartTlsEnable'
	 * 
	 * @return short
	 */
	public short getSmtpStartTlsEnable()
	{
		return smtpStartTlsEnable;
	}

	/**
	 * Method 'setSmtpStartTlsEnable'
	 * 
	 * @param smtpStartTlsEnable
	 */
	public void setSmtpStartTlsEnable(short smtpStartTlsEnable)
	{
		this.smtpStartTlsEnable = smtpStartTlsEnable;
	}

	/**
	 * Method 'getSmtpAuth'
	 * 
	 * @return short
	 */
	public short getSmtpAuth()
	{
		return smtpAuth;
	}

	/**
	 * Method 'setSmtpAuth'
	 * 
	 * @param smtpAuth
	 */
	public void setSmtpAuth(short smtpAuth)
	{
		this.smtpAuth = smtpAuth;
	}

	/**
	 * Method 'getAsuntoRecuperacion'
	 * 
	 * @return String
	 */
	public String getAsuntoRecuperacion()
	{
		return asuntoRecuperacion;
	}

	/**
	 * Method 'setAsuntoRecuperacion'
	 * 
	 * @param asuntoRecuperacion
	 */
	public void setAsuntoRecuperacion(String asuntoRecuperacion)
	{
		this.asuntoRecuperacion = asuntoRecuperacion;
	}

	/**
	 * Method 'getMensageRecuperacion'
	 * 
	 * @return String
	 */
	public String getMensageRecuperacion()
	{
		return mensageRecuperacion;
	}

	/**
	 * Method 'setMensageRecuperacion'
	 * 
	 * @param mensageRecuperacion
	 */
	public void setMensageRecuperacion(String mensageRecuperacion)
	{
		this.mensageRecuperacion = mensageRecuperacion;
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
		
		if (!(_other instanceof ServidorCorreoElectronico)) {
			return false;
		}
		
		final ServidorCorreoElectronico _cast = (ServidorCorreoElectronico) _other;
		if (correo == null ? _cast.correo != correo : !correo.equals( _cast.correo )) {
			return false;
		}
		
		if (contrasenia == null ? _cast.contrasenia != contrasenia : !contrasenia.equals( _cast.contrasenia )) {
			return false;
		}
		
		if (smtpHost == null ? _cast.smtpHost != smtpHost : !smtpHost.equals( _cast.smtpHost )) {
			return false;
		}
		
		if (smtpPort != _cast.smtpPort) {
			return false;
		}
		
		if (smtpStartTlsEnable != _cast.smtpStartTlsEnable) {
			return false;
		}
		
		if (smtpAuth != _cast.smtpAuth) {
			return false;
		}
		
		if (asuntoRecuperacion == null ? _cast.asuntoRecuperacion != asuntoRecuperacion : !asuntoRecuperacion.equals( _cast.asuntoRecuperacion )) {
			return false;
		}
		
		if (mensageRecuperacion == null ? _cast.mensageRecuperacion != mensageRecuperacion : !mensageRecuperacion.equals( _cast.mensageRecuperacion )) {
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
		
		if (contrasenia != null) {
			_hashCode = 29 * _hashCode + contrasenia.hashCode();
		}
		
		if (smtpHost != null) {
			_hashCode = 29 * _hashCode + smtpHost.hashCode();
		}
		
		_hashCode = 29 * _hashCode + smtpPort;
		_hashCode = 29 * _hashCode + (int) smtpStartTlsEnable;
		_hashCode = 29 * _hashCode + (int) smtpAuth;
		if (asuntoRecuperacion != null) {
			_hashCode = 29 * _hashCode + asuntoRecuperacion.hashCode();
		}
		
		if (mensageRecuperacion != null) {
			_hashCode = 29 * _hashCode + mensageRecuperacion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ServidorCorreoElectronicoPk
	 */
	public ServidorCorreoElectronicoPk createPk()
	{
		return new ServidorCorreoElectronicoPk(correo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.ServidorCorreoElectronico: " );
		ret.append( "correo=" + correo );
		ret.append( ", contrasenia=" + contrasenia );
		ret.append( ", smtpHost=" + smtpHost );
		ret.append( ", smtpPort=" + smtpPort );
		ret.append( ", smtpStartTlsEnable=" + smtpStartTlsEnable );
		ret.append( ", smtpAuth=" + smtpAuth );
		ret.append( ", asuntoRecuperacion=" + asuntoRecuperacion );
		ret.append( ", mensageRecuperacion=" + mensageRecuperacion );
		return ret.toString();
	}

}
