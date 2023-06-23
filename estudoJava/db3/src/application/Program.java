package src.application;

import db.DB;
import db.DBException;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {

            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rowsAffected = st.executeUpdate(
                    "UPDATE seller "
                            + "SET BaseSalary = 2090 "
                            + "WHERE "
                            + "(DepartmentId = 1)");

            int rowsAffected2 = st.executeUpdate(
                    "UPDATE seller "
                            + "SET BaseSalary = 3090 "
                            + "WHERE "
                            + "(DepartmentId = 2)");

            conn.commit();// commita as alterações no banco de dados

            System.out.println("Done! Rows affected: " + rowsAffected);
            System.out.println("Done! Rows affected: " + rowsAffected2);

        } catch (SQLException e) {
            try {
                conn.rollback();// desfaz as alterações no banco de dados
                throw new DbIntegrityException("ERROR. Transaction rolled back. cause: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DBException("ERROR trying to rollback! cause: " + e.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
