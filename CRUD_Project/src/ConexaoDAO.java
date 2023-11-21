
import java.sql.Connection;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            //CRIAR CONEXÃO COM BD//
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return conn;
    }
}
