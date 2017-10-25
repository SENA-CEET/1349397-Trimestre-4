/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.jdbc;

import co.edu.sena.model.dao.dao.*;
import co.edu.sena.model.dao.factory.*;
import java.util.Date;
import co.edu.sena.model.dao.dto.*;
import co.edu.sena.model.dao.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class LogAuditoriaDaoImpl extends AbstractDAO implements LogAuditoriaDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT id_log, level, log_name, mensage, fecha, usuario FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_log, level, log_name, mensage, fecha, usuario ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_log = ?, level = ?, log_name = ?, mensage = ?, fecha = ?, usuario = ? WHERE id_log = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_log = ?";

	/** 
	 * Index of column id_log
	 */
	protected static final int COLUMN_ID_LOG = 1;

	/** 
	 * Index of column level
	 */
	protected static final int COLUMN_LEVEL = 2;

	/** 
	 * Index of column log_name
	 */
	protected static final int COLUMN_LOG_NAME = 3;

	/** 
	 * Index of column mensage
	 */
	protected static final int COLUMN_MENSAGE = 4;

	/** 
	 * Index of column fecha
	 */
	protected static final int COLUMN_FECHA = 5;

	/** 
	 * Index of column usuario
	 */
	protected static final int COLUMN_USUARIO = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column id_log
	 */
	protected static final int PK_COLUMN_ID_LOG = 1;

	/** 
	 * Inserts a new row in the log_auditoria table.
	 */
	public LogAuditoriaPk insert(LogAuditoria dto) throws LogAuditoriaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setLong( index++, dto.getIdLog() );
			stmt.setString( index++, dto.getLevel() );
			stmt.setString( index++, dto.getLogName() );
			stmt.setString( index++, dto.getMensage() );
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setString( index++, dto.getUsuario() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdLog( rs.getLong( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LogAuditoriaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the log_auditoria table.
	 */
	public void update(LogAuditoriaPk pk, LogAuditoria dto) throws LogAuditoriaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setLong( index++, dto.getIdLog() );
			stmt.setString( index++, dto.getLevel() );
			stmt.setString( index++, dto.getLogName() );
			stmt.setString( index++, dto.getMensage() );
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setString( index++, dto.getUsuario() );
			stmt.setLong( 7, pk.getIdLog() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LogAuditoriaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the log_auditoria table.
	 */
	public void delete(LogAuditoriaPk pk) throws LogAuditoriaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setLong( 1, pk.getIdLog() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LogAuditoriaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the log_auditoria table that matches the specified primary-key value.
	 */
	public LogAuditoria findByPrimaryKey(LogAuditoriaPk pk) throws LogAuditoriaDaoException
	{
		return findByPrimaryKey( pk.getIdLog() );
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'id_log = :idLog'.
	 */
	public LogAuditoria findByPrimaryKey(long idLog) throws LogAuditoriaDaoException
	{
		LogAuditoria ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_log = ?", new Object[] {  new Long(idLog) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria ''.
	 */
	public LogAuditoria[] findAll() throws LogAuditoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_log", null );
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'id_log = :idLog'.
	 */
	public LogAuditoria[] findWhereIdLogEquals(long idLog) throws LogAuditoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_log = ? ORDER BY id_log", new Object[] {  new Long(idLog) } );
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'level = :level'.
	 */
	public LogAuditoria[] findWhereLevelEquals(String level) throws LogAuditoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE level = ? ORDER BY level", new Object[] { level } );
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'log_name = :logName'.
	 */
	public LogAuditoria[] findWhereLogNameEquals(String logName) throws LogAuditoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE log_name = ? ORDER BY log_name", new Object[] { logName } );
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'mensage = :mensage'.
	 */
	public LogAuditoria[] findWhereMensageEquals(String mensage) throws LogAuditoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE mensage = ? ORDER BY mensage", new Object[] { mensage } );
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'fecha = :fecha'.
	 */
	public LogAuditoria[] findWhereFechaEquals(Date fecha) throws LogAuditoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha = ? ORDER BY fecha", new Object[] { fecha==null ? null : new java.sql.Timestamp( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the criteria 'usuario = :usuario'.
	 */
	public LogAuditoria[] findWhereUsuarioEquals(String usuario) throws LogAuditoriaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE usuario = ? ORDER BY usuario", new Object[] { usuario } );
	}

	/**
	 * Method 'LogAuditoriaDaoImpl'
	 * 
	 */
	public LogAuditoriaDaoImpl()
	{
	}

	/**
	 * Method 'LogAuditoriaDaoImpl'
	 * 
	 * @param userConn
	 */
	public LogAuditoriaDaoImpl(final Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "observador_de_proyectos.log_auditoria";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected LogAuditoria fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			LogAuditoria dto = new LogAuditoria();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected LogAuditoria[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			LogAuditoria dto = new LogAuditoria();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		LogAuditoria ret[] = new LogAuditoria[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(LogAuditoria dto, ResultSet rs) throws SQLException
	{
		dto.setIdLog( rs.getLong( COLUMN_ID_LOG ) );
		dto.setLevel( rs.getString( COLUMN_LEVEL ) );
		dto.setLogName( rs.getString( COLUMN_LOG_NAME ) );
		dto.setMensage( rs.getString( COLUMN_MENSAGE ) );
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
		dto.setUsuario( rs.getString( COLUMN_USUARIO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(LogAuditoria dto)
	{
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the specified arbitrary SQL statement
	 */
	public LogAuditoria[] findByDynamicSelect(String sql, Object[] sqlParams) throws LogAuditoriaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LogAuditoriaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the log_auditoria table that match the specified arbitrary SQL statement
	 */
	public LogAuditoria[] findByDynamicWhere(String sql, Object[] sqlParams) throws LogAuditoriaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LogAuditoriaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
