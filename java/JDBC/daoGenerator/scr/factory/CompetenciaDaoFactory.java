/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.factory;

import java.sql.Connection;
import co.edu.sena.model.dao.dao.*;
import co.edu.sena.model.dao.jdbc.*;

public class CompetenciaDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CompetenciaDao
	 */
	public static CompetenciaDao create()
	{
		return new CompetenciaDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CompetenciaDao
	 */
	public static CompetenciaDao create(Connection conn)
	{
		return new CompetenciaDaoImpl( conn );
	}

}
