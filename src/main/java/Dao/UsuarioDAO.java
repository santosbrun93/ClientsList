package Dao;

import Model.Usuario;
import controller.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UsuarioDAO extends GenericoDAO<Usuario> {
    
    public Usuario findUsuarioByEmail(String email){

        Usuario usuario = null;
        try {
            Session session = HibernateUtil.getSession();

            Query query = session.createSQLQuery(
                    "select * from usuarios u where u.email = :email")
                    .addEntity(Usuario.class)
                    .setParameter("email", email);

           if(query.getFirstResult() > 0);
                usuario = (Usuario) query.getSingleResult();

        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return usuario;
    }
    
    
    
}
