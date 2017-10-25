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

public interface ValoracionDao
{
	/** 
	 * Inserts a new row in the valoracion table.
	 */
	public ValoracionPk insert(Valoracion dto) throws ValoracionDaoException;

	/** 
	 * Updates a single row in the valoracion table.
	 */
	public void update(ValoracionPk pk, Valoracion dto) throws ValoracionDaoException;

	/** 
	 * Deletes a single row in the valoracion table.
	 */
	public void delete(ValoracionPk pk) throws ValoracionDaoException;

	/** 
	 * Returns the rows from the valoracion table that matches the specified primary-key value.
	 */
	public Valoracion findByPrimaryKey(ValoracionPk pk) throws ValoracionDaoException;

	/** 
	 * Returns all rows from the valoracion table that match the criteria 'valor = :valor'.
	 */
	public Valoracion findByPrimaryKey(String valor) throws ValoracionDaoException;

	/** 
	 * Returns all rows from the valoracion table that match the criteria ''.
	 */
	public Valoracion[] findAll() throws ValoracionDaoException;

	/** 
	 * Returns all rows from the valoracion table that match the criteria 'valor = :valor'.
	 */
	public Valoracion[] findWhereValorEquals(String valor) throws ValoracionDaoException;

	/** 
	 * Returns all rows from the valoracion table that match the criteria 'estado = :estado'.
	 */
	public Valoracion[] findWhereEstadoEquals(short estado) throws ValoracionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the valoracion table that match the specified arbitrary SQL statement
	 */
	public Valoracion[] findByDynamicSelect(String sql, Object[] sqlParams) throws ValoracionDaoException;

	/** 
	 * Returns all rows from the valoracion table that match the specified arbitrary SQL statement
	 */
	public Valoracion[] findByDynamicWhere(String sql, Object[] sqlParams) throws ValoracionDaoException;

}
