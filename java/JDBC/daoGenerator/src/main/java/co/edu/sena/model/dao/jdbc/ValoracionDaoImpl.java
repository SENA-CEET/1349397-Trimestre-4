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

public class ValoracionDaoImpl extends AbstractDAO implements ValoracionDao
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
	protected final String SQL_SELECT = "SELECT valor, estado FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( valor, estado ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET valor = ?, estado = ? WHERE valor = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE valor = ?";

	/** 
	 * Index of column valor
	 */
	protected static final int COLUMN_VALOR = 1;

	/** 
	 * Index of column estado
	 */
	protected static final int COLUMN_ESTADO = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column valor
	 */
	protected static final int PK_COLUMN_VALOR = 1;

	/** 
	 * Inserts a new row in the valoracion table.
	 */
	public ValoracionPk insert(Valoracion dto) throws ValoracionDaoException
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
			stmt.setString( index++, dto.getValor() );
			stmt.setShort( index++, dto.getEstado() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ValoracionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the valoracion table.
	 */
	public void update(ValoracionPk pk, Valoracion dto) throws ValoracionDaoException
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
			stmt.setString( index++, dto.getValor() );
			stmt.setShort( index++, dto.getEstado() );
			stmt.setString( 3, pk.getValor() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ValoracionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the valoracion table.
	 */
	public void delete(ValoracionPk pk) throws ValoracionDaoException
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
			stmt.setString( 1, pk.getValor() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ValoracionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the valoracion table that matches the specified primary-key value.
	 */
	public Valoracion findByPrimaryKey(ValoracionPk pk) throws ValoracionDaoException
	{
		return findByPrimaryKey( pk.getValor() );
	}

	/** 
	 * Returns all rows from the valoracion table that match the criteria 'valor = :valor'.
	 */
	public Valoracion findByPrimaryKey(String valor) throws ValoracionDaoException
	{
		Valoracion ret[] = findByDynamicSelect( SQL_SELECT + " WHERE valor = ?", new Object[] { valor } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the valoracion table that match the criteria ''.
	 */
	public Valoracion[] findAll() throws ValoracionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY valor", null );
	}

	/** 
	 * Returns all rows from the valoracion table that match the criteria 'valor = :valor'.
	 */
	public Valoracion[] findWhereValorEquals(String valor) throws ValoracionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE valor = ? ORDER BY valor", new Object[] { valor } );
	}

	/** 
	 * Returns all rows from the valoracion table that match the criteria 'estado = :estado'.
	 */
	public Valoracion[] findWhereEstadoEquals(short estado) throws ValoracionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE estado = ? ORDER BY estado", new Object[] {  new Short(estado) } );
	}

	/**
	 * Method 'ValoracionDaoImpl'
	 * 
	 */
	public ValoracionDaoImpl()
	{
	}

	/**
	 * Method 'ValoracionDaoImpl'
	 * 
	 * @param userConn
	 */
	public ValoracionDaoImpl(final Connection userConn)
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
		return "observador_de_proyectos.valoracion";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Valoracion fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Valoracion dto = new Valoracion();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Valoracion[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Valoracion dto = new Valoracion();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Valoracion ret[] = new Valoracion[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Valoracion dto, ResultSet rs) throws SQLException
	{
		dto.setValor( rs.getString( COLUMN_VALOR ) );
		dto.setEstado( rs.getShort( COLUMN_ESTADO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Valoracion dto)
	{
	}

	/** 
	 * Returns all rows from the valoracion table that match the specified arbitrary SQL statement
	 */
	public Valoracion[] findByDynamicSelect(String sql, Object[] sqlParams) throws ValoracionDaoException
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
			throw new ValoracionDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the valoracion table that match the specified arbitrary SQL statement
	 */
	public Valoracion[] findByDynamicWhere(String sql, Object[] sqlParams) throws ValoracionDaoException
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
			throw new ValoracionDaoException( "Exception: " + _e.getMessage(), _e );
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
