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

public class ItemCheckerDaoImpl extends AbstractDAO implements ItemCheckerDao
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
	protected final String SQL_SELECT = "SELECT lista_chequeo, id_item, pregunta, rae_codigo, competencia_codigo, programa_codigo_version FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( lista_chequeo, id_item, pregunta, rae_codigo, competencia_codigo, programa_codigo_version ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET lista_chequeo = ?, id_item = ?, pregunta = ?, rae_codigo = ?, competencia_codigo = ?, programa_codigo_version = ? WHERE lista_chequeo = ? AND id_item = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE lista_chequeo = ? AND id_item = ?";

	/** 
	 * Index of column lista_chequeo
	 */
	protected static final int COLUMN_LISTA_CHEQUEO = 1;

	/** 
	 * Index of column id_item
	 */
	protected static final int COLUMN_ID_ITEM = 2;

	/** 
	 * Index of column pregunta
	 */
	protected static final int COLUMN_PREGUNTA = 3;

	/** 
	 * Index of column rae_codigo
	 */
	protected static final int COLUMN_RAE_CODIGO = 4;

	/** 
	 * Index of column competencia_codigo
	 */
	protected static final int COLUMN_COMPETENCIA_CODIGO = 5;

	/** 
	 * Index of column programa_codigo_version
	 */
	protected static final int COLUMN_PROGRAMA_CODIGO_VERSION = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column lista_chequeo
	 */
	protected static final int PK_COLUMN_LISTA_CHEQUEO = 1;

	/** 
	 * Index of primary-key column id_item
	 */
	protected static final int PK_COLUMN_ID_ITEM = 2;

	/** 
	 * Inserts a new row in the item_checker table.
	 */
	public ItemCheckerPk insert(ItemChecker dto) throws ItemCheckerDaoException
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
			stmt.setString( index++, dto.getListaChequeo() );
			stmt.setInt( index++, dto.getIdItem() );
			stmt.setString( index++, dto.getPregunta() );
			stmt.setString( index++, dto.getRaeCodigo() );
			stmt.setString( index++, dto.getCompetenciaCodigo() );
			stmt.setString( index++, dto.getProgramaCodigoVersion() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemCheckerDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the item_checker table.
	 */
	public void update(ItemCheckerPk pk, ItemChecker dto) throws ItemCheckerDaoException
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
			stmt.setString( index++, dto.getListaChequeo() );
			stmt.setInt( index++, dto.getIdItem() );
			stmt.setString( index++, dto.getPregunta() );
			stmt.setString( index++, dto.getRaeCodigo() );
			stmt.setString( index++, dto.getCompetenciaCodigo() );
			stmt.setString( index++, dto.getProgramaCodigoVersion() );
			stmt.setString( 7, pk.getListaChequeo() );
			stmt.setInt( 8, pk.getIdItem() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemCheckerDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the item_checker table.
	 */
	public void delete(ItemCheckerPk pk) throws ItemCheckerDaoException
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
			stmt.setString( 1, pk.getListaChequeo() );
			stmt.setInt( 2, pk.getIdItem() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemCheckerDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the item_checker table that matches the specified primary-key value.
	 */
	public ItemChecker findByPrimaryKey(ItemCheckerPk pk) throws ItemCheckerDaoException
	{
		return findByPrimaryKey( pk.getListaChequeo(), pk.getIdItem() );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'lista_chequeo = :listaChequeo AND id_item = :idItem'.
	 */
	public ItemChecker findByPrimaryKey(String listaChequeo, int idItem) throws ItemCheckerDaoException
	{
		ItemChecker ret[] = findByDynamicSelect( SQL_SELECT + " WHERE lista_chequeo = ? AND id_item = ?", new Object[] { listaChequeo,  new Integer(idItem) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria ''.
	 */
	public ItemChecker[] findAll() throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY lista_chequeo, id_item", null );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'lista_chequeo = :listaChequeo'.
	 */
	public ItemChecker[] findByListaChequeo(String listaChequeo) throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE lista_chequeo = ?", new Object[] { listaChequeo } );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'rae_codigo = :raeCodigo AND competencia_codigo = :competenciaCodigo AND programa_codigo_version = :programaCodigoVersion'.
	 */
	public ItemChecker[] findByRae(String raeCodigo, String competenciaCodigo, String programaCodigoVersion) throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rae_codigo = ? AND competencia_codigo = ? AND programa_codigo_version = ?", new Object[] { raeCodigo, competenciaCodigo, programaCodigoVersion } );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'lista_chequeo = :listaChequeo'.
	 */
	public ItemChecker[] findWhereListaChequeoEquals(String listaChequeo) throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE lista_chequeo = ? ORDER BY lista_chequeo", new Object[] { listaChequeo } );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'id_item = :idItem'.
	 */
	public ItemChecker[] findWhereIdItemEquals(int idItem) throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_item = ? ORDER BY id_item", new Object[] {  new Integer(idItem) } );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'pregunta = :pregunta'.
	 */
	public ItemChecker[] findWherePreguntaEquals(String pregunta) throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE pregunta = ? ORDER BY pregunta", new Object[] { pregunta } );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'rae_codigo = :raeCodigo'.
	 */
	public ItemChecker[] findWhereRaeCodigoEquals(String raeCodigo) throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE rae_codigo = ? ORDER BY rae_codigo", new Object[] { raeCodigo } );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'competencia_codigo = :competenciaCodigo'.
	 */
	public ItemChecker[] findWhereCompetenciaCodigoEquals(String competenciaCodigo) throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE competencia_codigo = ? ORDER BY competencia_codigo", new Object[] { competenciaCodigo } );
	}

	/** 
	 * Returns all rows from the item_checker table that match the criteria 'programa_codigo_version = :programaCodigoVersion'.
	 */
	public ItemChecker[] findWhereProgramaCodigoVersionEquals(String programaCodigoVersion) throws ItemCheckerDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE programa_codigo_version = ? ORDER BY programa_codigo_version", new Object[] { programaCodigoVersion } );
	}

	/**
	 * Method 'ItemCheckerDaoImpl'
	 * 
	 */
	public ItemCheckerDaoImpl()
	{
	}

	/**
	 * Method 'ItemCheckerDaoImpl'
	 * 
	 * @param userConn
	 */
	public ItemCheckerDaoImpl(final Connection userConn)
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
		return "observador_de_proyectos.item_checker";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ItemChecker fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ItemChecker dto = new ItemChecker();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ItemChecker[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ItemChecker dto = new ItemChecker();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ItemChecker ret[] = new ItemChecker[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ItemChecker dto, ResultSet rs) throws SQLException
	{
		dto.setListaChequeo( rs.getString( COLUMN_LISTA_CHEQUEO ) );
		dto.setIdItem( rs.getInt( COLUMN_ID_ITEM ) );
		dto.setPregunta( rs.getString( COLUMN_PREGUNTA ) );
		dto.setRaeCodigo( rs.getString( COLUMN_RAE_CODIGO ) );
		dto.setCompetenciaCodigo( rs.getString( COLUMN_COMPETENCIA_CODIGO ) );
		dto.setProgramaCodigoVersion( rs.getString( COLUMN_PROGRAMA_CODIGO_VERSION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ItemChecker dto)
	{
	}

	/** 
	 * Returns all rows from the item_checker table that match the specified arbitrary SQL statement
	 */
	public ItemChecker[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemCheckerDaoException
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
			throw new ItemCheckerDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the item_checker table that match the specified arbitrary SQL statement
	 */
	public ItemChecker[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemCheckerDaoException
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
			throw new ItemCheckerDaoException( "Exception: " + _e.getMessage(), _e );
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
