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

public interface LogAuditoriaDao
{
	/** 
	 * Inserts a new row in the log_auditoria table.
	 */
	public LogAuditoriaPk insert(LogAuditoria dto) throws LogAuditoriaDaoException;

	/** 
	 * Updates a single row in the log_auditoria table.
	 */
	public void update(LogAuditoriaPk pk, LogAuditoria dto) throws LogAuditoriaDaoException;

	/** 
	 * Deletes a single row in the log_auditoria table.
	 */
	public void delete(LogAuditoriaPk pk) throws LogAuditoriaDaoException;

	/** 
	 * Returns the rows from the log_auditoria table that matches the specified primary-key value.
	 */
	public LogAuditoria findByPrimaryKey(LogAuditoriaPk pk) throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'id_log = :idLog'.
	 */
	public LogAuditoria findByPrimaryKey(long idLog) throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria ''.
	 */
	public LogAuditoria[] findAll() throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'id_log = :idLog'.
	 */
	public LogAuditoria[] findWhereIdLogEquals(long idLog) throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'level = :level'.
	 */
	public LogAuditoria[] findWhereLevelEquals(String level) throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'log_name = :logName'.
	 */
	public LogAuditoria[] findWhereLogNameEquals(String logName) throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'mensage = :mensage'.
	 */
	public LogAuditoria[] findWhereMensageEquals(String mensage) throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'fecha = :fecha'.
	 */
	public LogAuditoria[] findWhereFechaEquals(Date fecha) throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'usuario = :usuario'.
	 */
	public LogAuditoria[] findWhereUsuarioEquals(String usuario) throws LogAuditoriaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the log_auditoria table that match the specified arbitrary SQL statement
	 */
	public LogAuditoria[] findByDynamicSelect(String sql, Object[] sqlParams) throws LogAuditoriaDaoException;

	/** 
	 * Returns all rows from the log_auditoria table that match the specified arbitrary SQL statement
	 */
	public LogAuditoria[] findByDynamicWhere(String sql, Object[] sqlParams) throws LogAuditoriaDaoException;

}