/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsbank.webservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.postgresql.jdbc.PgStatement;
import wsbank.database.Database;
import wsbank.objects.ObjectC;

/**
 *
 * @author chiarotti
 */
@WebService(serviceName = "WSChiarotti")
public class WSChiarotti {
	Connection conn;
	PgStatement statement;
        
        public WSChiarotti() throws SQLException{
            conn = Database.getConnection();
            statement = (PgStatement)conn.createStatement();
        }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ted")
    public String ted(@WebParam(name= "codigo") String codigo, @WebParam(name = "valor") double valor){
        String query = "UPDATE client SET balance = balance +"+valor+" WHERE account_number = "+codigo;
        try{
            if(statement.executeUpdate(query) > 0){
                return "ok";
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return "";
    }

    @WebMethod(operationName = "correntista")    
    public ObjectC correntista(@WebParam(name = "codigo") String codigo){
        String query = "SELECT name, balance FROM client WHERE "+codigo+ "= account_number";
        ResultSet queryResult;
        try {
            queryResult = statement.executeQuery(query);
            if(queryResult.next()){
               return new ObjectC(codigo, queryResult.getString(1), queryResult.getLong(2));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
