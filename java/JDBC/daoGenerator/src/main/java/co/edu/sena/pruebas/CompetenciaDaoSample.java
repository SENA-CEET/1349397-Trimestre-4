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
import co.edu.sena.model.dao.dao.CompetenciaDao;
import co.edu.sena.model.dao.dto.Competencia;
import co.edu.sena.model.dao.exceptions.CompetenciaDaoException;
import co.edu.sena.model.dao.factory.CompetenciaDaoFactory;

public class CompetenciaDaoSample
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
		// findByPrograma("");
		// findWhereCodigoEquals("");
		// findWhereDenominacionEquals("");
		// findWhereProgramaCodigoVersionEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			CompetenciaDao _dao = getCompetenciaDao();
			Competencia _result[] = _dao.findAll();
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
			CompetenciaDao _dao = getCompetenciaDao();
			Competencia _result[] = _dao.findByPrograma(programaCodigoVersion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCodigoEquals'
	 * 
	 * @param codigo
	 */
	public static void findWhereCodigoEquals(String codigo)
	{
		try {
			CompetenciaDao _dao = getCompetenciaDao();
			Competencia _result[] = _dao.findWhereCodigoEquals(codigo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDenominacionEquals'
	 * 
	 * @param denominacion
	 */
	public static void findWhereDenominacionEquals(String denominacion)
	{
		try {
			CompetenciaDao _dao = getCompetenciaDao();
			Competencia _result[] = _dao.findWhereDenominacionEquals(denominacion);
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
			CompetenciaDao _dao = getCompetenciaDao();
			Competencia _result[] = _dao.findWhereProgramaCodigoVersionEquals(programaCodigoVersion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getCompetenciaDao'
	 * 
	 * @return CompetenciaDao
	 */
	public static CompetenciaDao getCompetenciaDao()
	{
		return CompetenciaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Competencia dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getCodigo() );
		buf.append( ", " );
		buf.append( dto.getDenominacion() );
		buf.append( ", " );
		buf.append( dto.getProgramaCodigoVersion() );
		System.out.println( buf.toString() );
	}

}