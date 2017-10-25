/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dao;

import co.edu.sena.model.dao.dto.*;
import co.edu.sena.model.dao.exceptions.*;

public interface TrimestreDao
{
	/** 
	 * Inserts a new row in the trimestre table.
	 */
	public TrimestrePk insert(Trimestre dto) throws TrimestreDaoException;

	/** 
	 * Updates a single row in the trimestre table.
	 */
	public void update(TrimestrePk pk, Trimestre dto) throws TrimestreDaoException;

	/** 
	 * Deletes a single row in the trimestre table.
	 */
	public void delete(TrimestrePk pk) throws TrimestreDaoException;

	/** 
	 * Returns the rows from the trimestre table that matches the specified primary-key value.
	 */
	public Trimestre findByPrimaryKey(TrimestrePk pk) throws TrimestreDaoException;

	/** 
	 * Returns all rows from the trimestre table that match the criteria 'id_trimestre = :idTrimestre AND jornada_nombre = :jornadaNombre'.
	 */
	public Trimestre findByPrimaryKey(String idTrimestre, String jornadaNombre) throws TrimestreDaoException;

	/** 
	 * Returns all rows from the trimestre table that match the criteria ''.
	 */
	public Trimestre[] findAll() throws TrimestreDaoException;

	/** 
	 * Returns all rows from the trimestre table that match the criteria 'jornada_nombre = :jornadaNombre'.
	 */
	public Trimestre[] findByJornada(String jornadaNombre) throws TrimestreDaoException;

	/** 
	 * Returns all rows from the trimestre table that match the criteria 'id_trimestre = :idTrimestre'.
	 */
	public Trimestre[] findWhereIdTrimestreEquals(String idTrimestre) throws TrimestreDaoException;

	/** 
	 * Returns all rows from the trimestre table that match the criteria 'jornada_nombre = :jornadaNombre'.
	 */
	public Trimestre[] findWhereJornadaNombreEquals(String jornadaNombre) throws TrimestreDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the trimestre table that match the specified arbitrary SQL statement
	 */
	public Trimestre[] findByDynamicSelect(String sql, Object[] sqlParams) throws TrimestreDaoException;

	/** 
	 * Returns all rows from the trimestre table that match the specified arbitrary SQL statement
	 */
	public Trimestre[] findByDynamicWhere(String sql, Object[] sqlParams) throws TrimestreDaoException;

}
