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
import co.edu.sena.model.dao.dao.ClienteHasRolDao;
import co.edu.sena.model.dao.dto.ClienteHasRol;
import co.edu.sena.model.dao.exceptions.ClienteHasRolDaoException;
import co.edu.sena.model.dao.factory.ClienteHasRolDaoFactory;

public class ClienteHasRolDaoSample
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
		// findByCliente("", "");
		// findByRol("");
		// findWhereTipoDocumentoEquals("");
		// findWhereNumeroDocumentoEquals("");
		// findWhereRolEquals("");
		// findWhereEstadoEquals(0);
		// findWhereFechaTerminacionEquals(null);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ClienteHasRolDao _dao = getClienteHasRolDao();
			ClienteHasRol _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCliente'
	 * 
	 * @param tipoDocumento
	 * @param numeroDocumento
	 */
	public static void findByCliente(String tipoDocumento, String numeroDocumento)
	{
		try {
			ClienteHasRolDao _dao = getClienteHasRolDao();
			ClienteHasRol _result[] = _dao.findByCliente(tipoDocumento, numeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByRol'
	 * 
	 * @param rol
	 */
	public static void findByRol(String rol)
	{
		try {
			ClienteHasRolDao _dao = getClienteHasRolDao();
			ClienteHasRol _result[] = _dao.findByRol(rol);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTipoDocumentoEquals'
	 * 
	 * @param tipoDocumento
	 */
	public static void findWhereTipoDocumentoEquals(String tipoDocumento)
	{
		try {
			ClienteHasRolDao _dao = getClienteHasRolDao();
			ClienteHasRol _result[] = _dao.findWhereTipoDocumentoEquals(tipoDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNumeroDocumentoEquals'
	 * 
	 * @param numeroDocumento
	 */
	public static void findWhereNumeroDocumentoEquals(String numeroDocumento)
	{
		try {
			ClienteHasRolDao _dao = getClienteHasRolDao();
			ClienteHasRol _result[] = _dao.findWhereNumeroDocumentoEquals(numeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRolEquals'
	 * 
	 * @param rol
	 */
	public static void findWhereRolEquals(String rol)
	{
		try {
			ClienteHasRolDao _dao = getClienteHasRolDao();
			ClienteHasRol _result[] = _dao.findWhereRolEquals(rol);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereEstadoEquals'
	 * 
	 * @param estado
	 */
	public static void findWhereEstadoEquals(short estado)
	{
		try {
			ClienteHasRolDao _dao = getClienteHasRolDao();
			ClienteHasRol _result[] = _dao.findWhereEstadoEquals(estado);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFechaTerminacionEquals'
	 * 
	 * @param fechaTerminacion
	 */
	public static void findWhereFechaTerminacionEquals(Date fechaTerminacion)
	{
		try {
			ClienteHasRolDao _dao = getClienteHasRolDao();
			ClienteHasRol _result[] = _dao.findWhereFechaTerminacionEquals(fechaTerminacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getClienteHasRolDao'
	 * 
	 * @return ClienteHasRolDao
	 */
	public static ClienteHasRolDao getClienteHasRolDao()
	{
		return ClienteHasRolDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ClienteHasRol dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getTipoDocumento() );
		buf.append( ", " );
		buf.append( dto.getNumeroDocumento() );
		buf.append( ", " );
		buf.append( dto.getRol() );
		buf.append( ", " );
		buf.append( dto.getEstado() );
		buf.append( ", " );
		buf.append( dto.getFechaTerminacion() );
		System.out.println( buf.toString() );
	}

}
