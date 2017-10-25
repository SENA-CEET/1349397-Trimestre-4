/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dao;

import java.util.Date;
import co.edu.sena.model.dao.dto.*;
import co.edu.sena.model.dao.exceptions.*;

public interface LogErrorDao
{
	/** 
	 * Inserts a new row in the log_error table.
	 */
	public LogErrorPk insert(LogError dto) throws LogErrorDaoException;

	/** 
	 * Updates a single row in the log_error table.
	 */
	public void update(LogErrorPk pk, LogError dto) throws LogErrorDaoException;

	/** 
	 * Deletes a single row in the log_error table.
	 */
	public void delete(LogErrorPk pk) throws LogErrorDaoException;

	/** 
	 * Returns the rows from the log_error table that matches the specified primary-key value.
	 */
	public LogError findByPrimaryKey(LogErrorPk pk) throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the criteria 'id_log = :idLog'.
	 */
	public LogError findByPrimaryKey(long idLog) throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the criteria ''.
	 */
	public LogError[] findAll() throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the criteria 'id_log = :idLog'.
	 */
	public LogError[] findWhereIdLogEquals(long idLog) throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the criteria 'level = :level'.
	 */
	public LogError[] findWhereLevelEquals(String level) throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the criteria 'log_name = :logName'.
	 */
	public LogError[] findWhereLogNameEquals(String logName) throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the criteria 'mensage = :mensage'.
	 */
	public LogError[] findWhereMensageEquals(String mensage) throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the criteria 'fecha = :fecha'.
	 */
	public LogError[] findWhereFechaEquals(Date fecha) throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the criteria 'usuario = :usuario'.
	 */
	public LogError[] findWhereUsuarioEquals(String usuario) throws LogErrorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the log_error table that match the specified arbitrary SQL statement
	 */
	public LogError[] findByDynamicSelect(String sql, Object[] sqlParams) throws LogErrorDaoException;

	/** 
	 * Returns all rows from the log_error table that match the specified arbitrary SQL statement
	 */
	public LogError[] findByDynamicWhere(String sql, Object[] sqlParams) throws LogErrorDaoException;

}
