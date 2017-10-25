/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.pruebas;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import co.edu.sena.model.dao.dao.ServidorCorreoElectronicoDao;
import co.edu.sena.model.dao.dto.ServidorCorreoElectronico;
import co.edu.sena.model.dao.exceptions.ServidorCorreoElectronicoDaoException;
import co.edu.sena.model.dao.factory.ServidorCorreoElectronicoDaoFactory;

public class ServidorCorreoElectronicoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereCorreoEquals("");
		// findWhereContraseniaEquals("");
		// findWhereSmtpHostEquals("");
		// findWhereSmtpPortEquals(0);
		// findWhereSmtpStartTlsEnableEquals(0);
		// findWhereSmtpAuthEquals(0);
		// findWhereAsuntoRecuperacionEquals("");
		// findWhereMensageRecuperacionEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCorreoEquals'
	 * 
	 * @param correo
	 */
	public static void findWhereCorreoEquals(String correo)
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findWhereCorreoEquals(correo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereContraseniaEquals'
	 * 
	 * @param contrasenia
	 */
	public static void findWhereContraseniaEquals(String contrasenia)
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findWhereContraseniaEquals(contrasenia);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSmtpHostEquals'
	 * 
	 * @param smtpHost
	 */
	public static void findWhereSmtpHostEquals(String smtpHost)
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findWhereSmtpHostEquals(smtpHost);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSmtpPortEquals'
	 * 
	 * @param smtpPort
	 */
	public static void findWhereSmtpPortEquals(int smtpPort)
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findWhereSmtpPortEquals(smtpPort);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSmtpStartTlsEnableEquals'
	 * 
	 * @param smtpStartTlsEnable
	 */
	public static void findWhereSmtpStartTlsEnableEquals(short smtpStartTlsEnable)
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findWhereSmtpStartTlsEnableEquals(smtpStartTlsEnable);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSmtpAuthEquals'
	 * 
	 * @param smtpAuth
	 */
	public static void findWhereSmtpAuthEquals(short smtpAuth)
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findWhereSmtpAuthEquals(smtpAuth);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereAsuntoRecuperacionEquals'
	 * 
	 * @param asuntoRecuperacion
	 */
	public static void findWhereAsuntoRecuperacionEquals(String asuntoRecuperacion)
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findWhereAsuntoRecuperacionEquals(asuntoRecuperacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereMensageRecuperacionEquals'
	 * 
	 * @param mensageRecuperacion
	 */
	public static void findWhereMensageRecuperacionEquals(String mensageRecuperacion)
	{
		try {
			ServidorCorreoElectronicoDao _dao = getServidorCorreoElectronicoDao();
			ServidorCorreoElectronico _result[] = _dao.findWhereMensageRecuperacionEquals(mensageRecuperacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getServidorCorreoElectronicoDao'
	 * 
	 * @return ServidorCorreoElectronicoDao
	 */
	public static ServidorCorreoElectronicoDao getServidorCorreoElectronicoDao()
	{
		return ServidorCorreoElectronicoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ServidorCorreoElectronico dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getCorreo() );
		buf.append( ", " );
		buf.append( dto.getContrasenia() );
		buf.append( ", " );
		buf.append( dto.getSmtpHost() );
		buf.append( ", " );
		buf.append( dto.getSmtpPort() );
		buf.append( ", " );
		buf.append( dto.getSmtpStartTlsEnable() );
		buf.append( ", " );
		buf.append( dto.getSmtpAuth() );
		buf.append( ", " );
		buf.append( dto.getAsuntoRecuperacion() );
		buf.append( ", " );
		buf.append( dto.getMensageRecuperacion() );
		System.out.println( buf.toString() );
	}

}
