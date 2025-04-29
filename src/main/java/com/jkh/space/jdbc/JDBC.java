package com.jkh.space.jdbc;

import java.sql.*;
import java.util.Optional;

public class JDBC {
    private final Connection connection;
    private PreparedStatement ps;

    public JDBC() throws SQLException {
        String host = "localhost";
        String database = "nstitle";
        int port = 3306;

        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC";
        connection = DriverManager.getConnection(url);
    }

    public Optional<String> getNameByJDBC() throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                        "SELECT name "
                        + "FROM student "
                        + "WHERE grade = ?"
        );
        String grade ="1학년";
        ps.setString(1, grade);

        ResultSet rs = ps.executeQuery();

        String name = null;
        if (rs.next()) {
            name = rs.getString("name");
        }

        rs.close();
        ps.close();
        connection.close();

        return Optional.ofNullable(name);
    }
}
