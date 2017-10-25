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

public interface ServidorCorreoElectronicoDao
{
	/** 
	 * Inserts a new row in the servidor_correo_electronico table.
	 */
	public ServidorCorreoElectronicoPk insert(ServidorCorreoElectronico dto) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Updates a single row in the servidor_correo_electronico table.
	 */
	public void update(ServidorCorreoElectronicoPk pk, ServidorCorreoElectronico dto) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Deletes a single row in the servidor_correo_electronico table.
	 */
	public void delete(ServidorCorreoElectronicoPk pk) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns the rows from the servidor_correo_electronico table that matches the specified primary-key value.
	 */
	public ServidorCorreoElectronico findByPrimaryKey(ServidorCorreoElectronicoPk pk) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'correo = :correo'.
	 */
	public ServidorCorreoElectronico findByPrimaryKey(String correo) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria ''.
	 */
	public ServidorCorreoElectronico[] findAll() throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'correo = :correo'.
	 */
	public ServidorCorreoElectronico[] findWhereCorreoEquals(String correo) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'contrasenia = :contrasenia'.
	 */
	public ServidorCorreoElectronico[] findWhereContraseniaEquals(String contrasenia) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'smtp_host = :smtpHost'.
	 */
	public ServidorCorreoElectronico[] findWhereSmtpHostEquals(String smtpHost) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'smtp_port = :smtpPort'.
	 */
	public ServidorCorreoElectronico[] findWhereSmtpPortEquals(int smtpPort) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'smtp_start_tls_enable = :smtpStartTlsEnable'.
	 */
	public ServidorCorreoElectronico[] findWhereSmtpStartTlsEnableEquals(short smtpStartTlsEnable) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'smtp_auth = :smtpAuth'.
	 */
	public ServidorCorreoElectronico[] findWhereSmtpAuthEquals(short smtpAuth) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'asunto_recuperacion = :asuntoRecuperacion'.
	 */
	public ServidorCorreoElectronico[] findWhereAsuntoRecuperacionEquals(String asuntoRecuperacion) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the criteria 'mensage_recuperacion = :mensageRecuperacion'.
	 */
	public ServidorCorreoElectronico[] findWhereMensageRecuperacionEquals(String mensageRecuperacion) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the specified arbitrary SQL statement
	 */
	public ServidorCorreoElectronico[] findByDynamicSelect(String sql, Object[] sqlParams) throws ServidorCorreoElectronicoDaoException;

	/** 
	 * Returns all rows from the servidor_correo_electronico table that match the specified arbitrary SQL statement
	 */
	public ServidorCorreoElectronico[] findByDynamicWhere(String sql, Object[] sqlParams) throws ServidorCorreoElectronicoDaoException;

}
