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
import co.edu.sena.model.dao.dao.InstructorHasTrimestreDao;
import co.edu.sena.model.dao.dto.InstructorHasTrimestre;
import co.edu.sena.model.dao.exceptions.InstructorHasTrimestreDaoException;
import co.edu.sena.model.dao.factory.InstructorHasTrimestreDaoFactory;

public class InstructorHasTrimestreDaoSample
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
		// findByInstructorFicha("", "", "");
		// findByTipoInstructor("");
		// findByTrimestre("", "");
		// findWhereTipoDocumentoEquals("");
		// findWhereNumeroDocumentoEquals("");
		// findWhereFichaEquals("");
		// findWhereIdTrimestreEquals("");
		// findWhereJornadaEquals("");
		// findWhereTipoInstructorEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByInstructorFicha'
	 * 
	 * @param tipoDocumento
	 * @param numeroDocumento
	 * @param ficha
	 */
	public static void findByInstructorFicha(String tipoDocumento, String numeroDocumento, String ficha)
	{
		try {
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findByInstructorFicha(tipoDocumento, numeroDocumento, ficha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByTipoInstructor'
	 * 
	 * @param tipoInstructor
	 */
	public static void findByTipoInstructor(String tipoInstructor)
	{
		try {
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findByTipoInstructor(tipoInstructor);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByTrimestre'
	 * 
	 * @param idTrimestre
	 * @param jornada
	 */
	public static void findByTrimestre(String idTrimestre, String jornada)
	{
		try {
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findByTrimestre(idTrimestre, jornada);
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
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findWhereTipoDocumentoEquals(tipoDocumento);
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
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findWhereNumeroDocumentoEquals(numeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFichaEquals'
	 * 
	 * @param ficha
	 */
	public static void findWhereFichaEquals(String ficha)
	{
		try {
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findWhereFichaEquals(ficha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdTrimestreEquals'
	 * 
	 * @param idTrimestre
	 */
	public static void findWhereIdTrimestreEquals(String idTrimestre)
	{
		try {
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findWhereIdTrimestreEquals(idTrimestre);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereJornadaEquals'
	 * 
	 * @param jornada
	 */
	public static void findWhereJornadaEquals(String jornada)
	{
		try {
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findWhereJornadaEquals(jornada);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTipoInstructorEquals'
	 * 
	 * @param tipoInstructor
	 */
	public static void findWhereTipoInstructorEquals(String tipoInstructor)
	{
		try {
			InstructorHasTrimestreDao _dao = getInstructorHasTrimestreDao();
			InstructorHasTrimestre _result[] = _dao.findWhereTipoInstructorEquals(tipoInstructor);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getInstructorHasTrimestreDao'
	 * 
	 * @return InstructorHasTrimestreDao
	 */
	public static InstructorHasTrimestreDao getInstructorHasTrimestreDao()
	{
		return InstructorHasTrimestreDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(InstructorHasTrimestre dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getTipoDocumento() );
		buf.append( ", " );
		buf.append( dto.getNumeroDocumento() );
		buf.append( ", " );
		buf.append( dto.getFicha() );
		buf.append( ", " );
		buf.append( dto.getIdTrimestre() );
		buf.append( ", " );
		buf.append( dto.getJornada() );
		buf.append( ", " );
		buf.append( dto.getTipoInstructor() );
		System.out.println( buf.toString() );
	}

}
