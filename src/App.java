import DAO.PersonagemDAO;
import entity.Personagem;
import java.sql.SQLException;



public class App {
    public static void main(String[] args) throws SQLException {
        Personagem p1 = new Personagem(1,"vecna", 30,"maluco suicida com problemas mal resolvidos" );
        System.out.println(p1);
        PersonagemDAO dao = new PersonagemDAO();
        Personagem p2 = new Personagem("Eleven", 18, "garota com poderes");
        dao.inserir(p2);
        System.out.println(p2);

        Personagem p = dao.buscarPorId(1);
        if (p != null) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Descrição: " + p.getDescricao());
        }
        else {
            System.out.println("Personagem não encontrado.");
        }


        dao.deletar(2);

    }
}

