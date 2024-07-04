package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class AlteraAluno {
    public AlteraAluno() {
    }

    public Aluno alteraAluno(Aluno aluno) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.merge(aluno);
        manager.getTransaction().commit();
        manager.close();
        factory.close();
        return aluno;
    }
}