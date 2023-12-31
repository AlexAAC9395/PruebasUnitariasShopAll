package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.unintTests;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.db.MyDBConfiguration;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@RunWith(SpringRunner.class)
@ContextConfiguration( classes = {MyDBConfiguration.class})
public class DBTest {
@Autowired
    private DataSource dataSource;

@Test
    public void connectionTest(){
try (Connection connection = dataSource.getConnection()){
    Statement statement = connection.createStatement();
    statement.execute("SELECT 1");
    statement.close();
} catch (SQLException ex){
    ex.printStackTrace();
    throw new RuntimeException("Fallo al conectar con la base de datos");
}
}
}
