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
import co.edu.sena.model.dao.dao.FichaDao;
import co.edu.sena.model.dao.dto.Ficha;
import co.edu.sena.model.dao.exceptions.FichaDaoException;
import co.edu.sena.model.dao.factory.FichaDaoFactory;

public class FichaDaoSample
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
		// findByJornada("");
		// findByPrograma("");
		// findWhereNumeroFichaEquals("");
		// findWhereProgramaCodigoVersionEquals("");
		// findWhereJornadaNombreEquals("");
		// findWhereEstadoEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			FichaDao _dao = getFichaDao();
			Ficha _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByJornada'
	 * 
	 * @param jornadaNombre
	 */
	public static void findByJornada(String jornadaNombre)
	{
		try {
			FichaDao _dao = getFichaDao();
			Ficha _result[] = _dao.findByJornada(jornadaNombre);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByPrograma'
	 * 
	 * @param programaCodigoVersion
	 */
	public static void findByPrograma(String programaCodigoVersion)
	{
		try {
			FichaDao _dao = getFichaDao();
			Ficha _result[] = _dao.findByPrograma(programaCodigoVersion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNumeroFichaEquals'
	 * 
	 * @param numeroFicha
	 */
	public static void findWhereNumeroFichaEquals(String numeroFicha)
	{
		try {
			FichaDao _dao = getFichaDao();
			Ficha _result[] = _dao.findWhereNumeroFichaEquals(numeroFicha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProgramaCodigoVersionEquals'
	 * 
	 * @param programaCodigoVersion
	 */
	public static void findWhereProgramaCodigoVersionEquals(String programaCodigoVersion)
	{
		try {
			FichaDao _dao = getFichaDao();
			Ficha _result[] = _dao.findWhereProgramaCodigoVersionEquals(programaCodigoVersion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereJornadaNombreEquals'
	 * 
	 * @param jornadaNombre
	 */
	public static void findWhereJornadaNombreEquals(String jornadaNombre)
	{
		try {
			FichaDao _dao = getFichaDao();
			Ficha _result[] = _dao.findWhereJornadaNombreEquals(jornadaNombre);
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
	public static void findWhereEstadoEquals(String estado)
	{
		try {
			FichaDao _dao = getFichaDao();
			Ficha _result[] = _dao.findWhereEstadoEquals(estado);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getFichaDao'
	 * 
	 * @return FichaDao
	 */
	public static FichaDao getFichaDao()
	{
		return FichaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Ficha dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getNumeroFicha() );
		buf.append( ", " );
		buf.append( dto.getProgramaCodigoVersion() );
		buf.append( ", " );
		buf.append( dto.getJornadaNombre() );
		buf.append( ", " );
		buf.append( dto.getEstado() );
		System.out.println( buf.toString() );
	}

}
