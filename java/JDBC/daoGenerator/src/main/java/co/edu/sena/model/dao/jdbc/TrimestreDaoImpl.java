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

public class TrimestreDaoImpl extends AbstractDAO implements TrimestreDao
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
	protected final String SQL_SELECT = "SELECT id_trimestre, jornada_nombre FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_trimestre, jornada_nombre ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_trimestre = ?, jornada_nombre = ? WHERE id_trimestre = ? AND jornada_nombre = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_trimestre = ? AND jornada_nombre = ?";

	/** 
	 * Index of column id_trimestre
	 */
	protected static final int COLUMN_ID_TRIMESTRE = 1;

	/** 
	 * Index of column jornada_nombre
	 */
	protected static final int COLUMN_JORNADA_NOMBRE = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column id_trimestre
	 */
	protected static final int PK_COLUMN_ID_TRIMESTRE = 1;

	/** 
	 * Index of primary-key column jornada_nombre
	 */
	protected static final int PK_COLUMN_JORNADA_NOMBRE = 2;

	/** 
	 * Inserts a new row in the trimestre table.
	 */
	public TrimestrePk insert(Trimestre dto) throws TrimestreDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setString( index++, dto.getIdTrimestre() );
			stmt.setString( index++, dto.getJornadaNombre() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TrimestreDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the trimestre table.
	 */
	public void update(TrimestrePk pk, Trimestre dto) throws TrimestreDaoException
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
			stmt.setString( index++, dto.getIdTrimestre() );
			stmt.setString( index++, dto.getJornadaNombre() );
			stmt.setString( 3, pk.getIdTrimestre() );
			stmt.setString( 4, pk.getJornadaNombre() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TrimestreDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the trimestre table.
	 */
	public void delete(TrimestrePk pk) throws TrimestreDaoException
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
			stmt.setString( 1, pk.getIdTrimestre() );
			stmt.setString( 2, pk.getJornadaNombre() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TrimestreDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the trimestre table that matches the specified primary-key value.
	 */
	public Trimestre findByPrimaryKey(TrimestrePk pk) throws TrimestreDaoException
	{
		return findByPrimaryKey( pk.getIdTrimestre(), pk.getJornadaNombre() );
	}

	/** 
	 * Returns all rows from the trimestre table that match the criteria 'id_trimestre = :idTrimestre AND jornada_nombre = :jornadaNombre'.
	 */
	public Trimestre findByPrimaryKey(String idTrimestre, String jornadaNombre) throws TrimestreDaoException
	{
		Trimestre ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_trimestre = ? AND jornada_nombre = ?", new Object[] { idTrimestre, jornadaNombre } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the trimestre table that match the criteria ''.
	 */
	public Trimestre[] findAll() throws TrimestreDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_trimestre, jornada_nombre", null );
	}

	/** 
	 * Returns all rows from the trimestre table that match the criteria 'jornada_nombre = :jornadaNombre'.
	 */
	public Trimestre[] findByJornada(String jornadaNombre) throws TrimestreDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE jornada_nombre = ?", new Object[] { jornadaNombre } );
	}

	/** 
	 * Returns all rows from the trimestre table that match the criteria 'id_trimestre = :idTrimestre'.
	 */
	public Trimestre[] findWhereIdTrimestreEquals(String idTrimestre) throws TrimestreDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_trimestre = ? ORDER BY id_trimestre", new Object[] { idTrimestre } );
	}

	/** 
	 * Returns all rows from the trimestre table that match the criteria 'jornada_nombre = :jornadaNombre'.
	 */
	public Trimestre[] findWhereJornadaNombreEquals(String jornadaNombre) throws TrimestreDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE jornada_nombre = ? ORDER BY jornada_nombre", new Object[] { jornadaNombre } );
	}

	/**
	 * Method 'TrimestreDaoImpl'
	 * 
	 */
	public TrimestreDaoImpl()
	{
	}

	/**
	 * Method 'TrimestreDaoImpl'
	 * 
	 * @param userConn
	 */
	public TrimestreDaoImpl(final Connection userConn)
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
		return "observador_de_proyectos.trimestre";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Trimestre fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Trimestre dto = new Trimestre();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Trimestre[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Trimestre dto = new Trimestre();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Trimestre ret[] = new Trimestre[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Trimestre dto, ResultSet rs) throws SQLException
	{
		dto.setIdTrimestre( rs.getString( COLUMN_ID_TRIMESTRE ) );
		dto.setJornadaNombre( rs.getString( COLUMN_JORNADA_NOMBRE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Trimestre dto)
	{
	}

	/** 
	 * Returns all rows from the trimestre table that match the specified arbitrary SQL statement
	 */
	public Trimestre[] findByDynamicSelect(String sql, Object[] sqlParams) throws TrimestreDaoException
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
			throw new TrimestreDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the trimestre table that match the specified arbitrary SQL statement
	 */
	public Trimestre[] findByDynamicWhere(String sql, Object[] sqlParams) throws TrimestreDaoException
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
			throw new TrimestreDaoException( "Exception: " + _e.getMessage(), _e );
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
