package conexaobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBancoDeDadosOracle {
	// nome do Driver JDBC e URL do banco de dados
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DDATABASE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	// carrega o aplicativo
	public static void main(String[] args) throws ClassNotFoundException {
        //gerencia a conecção
        Connection connection = null;
        //instrução de consulta
        Statement statement = null;
        try{
            //carrega a classe de drive do banco de dados
            Class.forName(JDBC_DRIVER);
            //estabelece conexão com o banco de dados
            connection =  DriverManager.getConnection( DDATABASE_URL,"anderson","3622975" );
            //cria statement para consultar bancoo de dados
            statement = connection.createStatement();
            //consulta o banco de dados
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TCURSO");
            //processa o resultados da consulta
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("Cursos Disponíveis");
            for(int i=1; i<=numberOfColumns; i++)
            	System.out.printf( "%-8s\t",metaData.getColumnName(i));
            System.out.println();
            while( resultSet.next() ){
                for( int i = 1;i <= numberOfColumns;i++ )
                    System.out.printf( "%-8s\t",resultSet.getObject( i ) );
                System.out.println();
            }//fim do while
        }//fim do try
        catch( SQLException sqlexception ){
            sqlexception.printStackTrace();
            System.exit( 1 );
        }//fim do catch
        //assegura que a instrução e conecção sejam fechadas adequadamente
        finally{
            try{
                statement.close();
                connection.close();
            }//fim do try
            catch( Exception exception ){
                exception.printStackTrace();
                System.exit( 1 );
            }//fim do catch
        }//fim do finally
    }// fim do método main
}



