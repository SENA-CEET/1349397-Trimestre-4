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
import co.edu.sena.model.dao.dao.ObservacionItemDao;
import co.edu.sena.model.dao.dto.ObservacionItem;
import co.edu.sena.model.dao.exceptions.ObservacionItemDaoException;
import co.edu.sena.model.dao.factory.ObservacionItemDaoFactory;

public class ObservacionItemDaoSample
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
		// findByRespuestaGrupo("", 0, "", 0);
		// findWhereIdObservacionEquals(0);
		// findWhereNumeroFichaEquals("");
		// findWhereGrupoCodigoEquals(0);
		// findWhereListaChequeoEquals("");
		// findWhereIdItemEquals(0);
		// findWhereObservacionEquals("");
		// findWhereJuradosEquals("");
		// findWhereFechaEquals(null);
		// findWhereUsuarioEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByRespuestaGrupo'
	 * 
	 * @param numeroFicha
	 * @param grupoCodigo
	 * @param listaChequeo
	 * @param idItem
	 */
	public static void findByRespuestaGrupo(String numeroFicha, int grupoCodigo, String listaChequeo, int idItem)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findByRespuestaGrupo(numeroFicha, grupoCodigo, listaChequeo, idItem);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdObservacionEquals'
	 * 
	 * @param idObservacion
	 */
	public static void findWhereIdObservacionEquals(int idObservacion)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereIdObservacionEquals(idObservacion);
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
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereNumeroFichaEquals(numeroFicha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGrupoCodigoEquals'
	 * 
	 * @param grupoCodigo
	 */
	public static void findWhereGrupoCodigoEquals(int grupoCodigo)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereGrupoCodigoEquals(grupoCodigo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereListaChequeoEquals'
	 * 
	 * @param listaChequeo
	 */
	public static void findWhereListaChequeoEquals(String listaChequeo)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereListaChequeoEquals(listaChequeo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdItemEquals'
	 * 
	 * @param idItem
	 */
	public static void findWhereIdItemEquals(int idItem)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereIdItemEquals(idItem);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereObservacionEquals'
	 * 
	 * @param observacion
	 */
	public static void findWhereObservacionEquals(String observacion)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereObservacionEquals(observacion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereJuradosEquals'
	 * 
	 * @param jurados
	 */
	public static void findWhereJuradosEquals(String jurados)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereJuradosEquals(jurados);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFechaEquals'
	 * 
	 * @param fecha
	 */
	public static void findWhereFechaEquals(Date fecha)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereFechaEquals(fecha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUsuarioEquals'
	 * 
	 * @param usuario
	 */
	public static void findWhereUsuarioEquals(String usuario)
	{
		try {
			ObservacionItemDao _dao = getObservacionItemDao();
			ObservacionItem _result[] = _dao.findWhereUsuarioEquals(usuario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getObservacionItemDao'
	 * 
	 * @return ObservacionItemDao
	 */
	public static ObservacionItemDao getObservacionItemDao()
	{
		return ObservacionItemDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ObservacionItem dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdObservacion() );
		buf.append( ", " );
		buf.append( dto.getNumeroFicha() );
		buf.append( ", " );
		buf.append( dto.getGrupoCodigo() );
		buf.append( ", " );
		buf.append( dto.getListaChequeo() );
		buf.append( ", " );
		buf.append( dto.getIdItem() );
		buf.append( ", " );
		buf.append( dto.getObservacion() );
		buf.append( ", " );
		buf.append( dto.getJurados() );
		buf.append( ", " );
		buf.append( dto.getFecha() );
		buf.append( ", " );
		buf.append( dto.getUsuario() );
		System.out.println( buf.toString() );
	}

}
