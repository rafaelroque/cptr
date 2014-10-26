import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main {

	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String sql = "INSERT INTO TB_CLIENTE(NOME) VALUES(?)";
		
		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pousada","postgres","postgres");
		PreparedStatement pst = null;
		for(int i = 0;i<10000000;i++){
			pst = c.prepareStatement(sql);
			pst.setString(1, "Cliente "+i);
			pst.execute();
		}
		
		c.close();
		
	}
}
