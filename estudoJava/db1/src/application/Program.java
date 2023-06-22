package src.application;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            // comentar para abaixo realizar inserçao de dois departamentos
            // st = conn.prepareStatement(
            // "INSERT INTO seller "
            // + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
            // + "VALUES "
            // +
            // "(?, ?, ?, ?, ?)",
            // Statement.RETURN_GENERATED_KEYS// retorna o id gerado pelo banco de dados
            // );
            // st.setString(1, "Carl Purple");
            // st.setString(2, "carlandlenny@gmail.com");
            // st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            // st.setDouble(4, 3000.0);
            // st.setInt(5, 4);

            st = conn.prepareStatement("insert into department (name) values ('D1'),('D2')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = st.executeUpdate();// executa a inserção no banco de dados

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();// retorna o id gerado pelo banco de dados
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // } catch (java.text.ParseException e) {
            // e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
