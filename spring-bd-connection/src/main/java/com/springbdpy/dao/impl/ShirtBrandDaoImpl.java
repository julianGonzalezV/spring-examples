package com.springbdpy.dao.impl;

import com.springbdpy.beans.ShirtBrand;
import com.springbdpy.dao.interfaces.ShirtBrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

//@Repository no es más que una anotacion que me indica de que capa es la clase, en este caso de la de manejo de acceso a datos
//repository viene de la teoría de DDD evans, da igual si coloca component o controlle , pero la buena practica obviamente dice que
//debe ser repository.
@Repository
public class ShirtBrandDaoImpl implements ShirtBrandDao {

    /**
     * Spring va a inyectar la conección siempre y ya no vamos a tener que crear una nueva
     * siempre
     * SI NO COLOCAMOS Aotowired entonces en el xml debemos agregar un nuevo bean
     * donde la clase sea esta ShirtBrandDaoImpl
     */
    @Autowired
    private DataSource dataSource;
    /**
     * Note que si el uso de template que ofrece spring nos tocaría
     * que por cada método manejar el prepared statement, manejo de
     * la conexión
     * @throws Exception
     */
    @Override
    public void insert(ShirtBrand brand) throws Exception {
        String sql = "INSERT INTO SHIRT_BRAND (id, name) VALUES (?, ?)";
        Connection connection = null;
        try{
            //no va a fallar diceiendo que dadtasource no está inicializado porque recordemos que srping carga todo en el
            //contexto primero ,en el momento que se setá iniciando
            connection = dataSource.getConnection();
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, brand.getId());
            st.setString(2, brand.getName());

            st.executeUpdate();
            st.close();

        }catch (Exception e){
            throw e;
        }finally {
            if(connection != null ){
                connection.close();
            }

        }
    }
}
