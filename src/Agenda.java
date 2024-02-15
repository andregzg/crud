import java.sql.Connection;
import java.sql.Date;

import com.mysql.jdbc.PreparedStatement;

public class Agenda {

    public void save(Contato contato) {
        String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES(?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = conexao.creaConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, contato.getNome());
            pstm.setInt(2, contato.getIdade());
            pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));

            pstm.execute();

            System.out.println("Contato salvo com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
