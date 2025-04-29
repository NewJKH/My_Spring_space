package com.jkh.space.jdbc;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplate {
    private final JdbcTemplate template;

    public JDBCTemplate() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/nstitle?useSSL=false&serverTimezone=UTC");
        dataSource.setUsername("test");
        dataSource.setPassword("1234");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        this.template = new JdbcTemplate(dataSource);
    }

    public String getNameByGrade(String grade) {
        String sql = "SELECT name " +
                     "FROM student " +
                     "WHERE grade = ?";
        return template.queryForObject(sql, String.class, grade);
    }
}
