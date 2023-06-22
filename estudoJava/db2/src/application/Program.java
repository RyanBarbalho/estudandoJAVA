package src.application;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {

            conn = DB.getConnection();

            String query = "UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)";
            st = conn.prepareStatement(query);

            st.setDouble(1, 200.0);// amount for salary increase
            st.setInt(2, 2); // departmentID

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
